initBlock
    : statement+
    ;

initExpr
    : expr
    ;

block
    : statement*
    ;

statement
    : 'class' ID '(' procedureParameters ')' '{' block ('static' '{' block '}')? '}' ';'?
    | 'if' '(' condition ')' '{' block '}' ('else' 'if' '(' condition ')' '{' block '}')* ('else' '{' block '}')?
    | 'switch' '{' ('case' condition ':' block)* ('default' ':' block)? '}'
    | match
    | scan
    | 'for' '(' iteratorChain ('|' condition)? ')' '{' block '}'
    | 'while' '(' condition ')' '{' block '}'
    | 'do' '{' block '}' 'while' '(' condition ')' ';'
    | 'try' '{' block '}' ('catchLng' '(' assignableVariable ')' '{' block '}' | 'catchUsr' '(' assignableVariable ')' '{' block '}')* ('catch' '(' assignableVariable ')' '{' block '}')?
    | 'check' '{' block '}' ('afterBacktrack' '{' block '}')?
    | 'backtrack' ';'
    | 'break' ';'
    | 'continue' ';'
    | 'exit' ';'
    | 'return' expr? ';'
    | 'assert' '(' condition ',' expr ')' ';'
    | assignmentOther ';'
    | assignmentDirect ';'
    | expr ';'
    ;

match
    : 'match' '(' expr ')' '{' ('case' exprList ('|' condition)? ':' block | regexBranch)+ ('default' ':' block)? '}'
    ;

scan
    : 'scan' '(' expr ')' ('using' assignableVariable)? '{' regexBranch+ ('default' ':' block)? '}'
    ;

regexBranch
    : 'regex' expr ('as' expr)? ('|' condition)? ':' block
    ;

assignableVariable
    : ID
    ;

variable
    : ID
    ;

condition
    : expr
    ;

exprList
    : exprContent (',' exprContent)*
    ;

assignmentOther
    : assignable ('+=' expr | '-=' expr | '*=' expr | '/=' expr | '\\=' expr | '%=' expr)
    ;

assignmentDirect
    : assignmentDirectContent
    ;

assignmentDirectContent
    : assignable ':=' (assignmentDirectContent | exprContent)
    ;

assignable
    : assignableVariable ('.' variable | '[' exprList ']')*
    | '[' assignmentList ']'
    | '_'
    ;

assignmentList
    : assignable (',' assignable)*
    ;

expr
    : exprContent
    ;

exprContent
    : lambdaProcedure
    | implication ('<==>' implication | '<!=>' implication)?
    ;

lambdaProcedure
    : lambdaParameters ('|->' expr | '|=>' expr)
    ;

lambdaParameters
    : variable
    | '[' (variable (',' variable)*)? ']'
    ;

implication
    : disjunction ('=>' implication)?
    ;

disjunction
    : conjunction ('||' conjunction)*
    ;

conjunction
    : comparison ('&&' comparison)*
    ;

comparison
    : sum ('==' sum | '!=' sum | '<' sum | '<=' sum | '>' sum | '>=' sum | 'in' sum | 'notin' sum)?
    ;

sum
    : product ('+' product | '-' product)*
    ;

product
    : reduce ('*' reduce | '/' reduce | '\\' reduce | '%' reduce | '><' reduce)*
    ;

reduce
    : prefixOperation ('+/' prefixOperation | '*/' prefixOperation)*
    ;

prefixOperation
    : factor ('**' prefixOperation)?
    | '+/' prefixOperation
    | '*/' prefixOperation
    | '#' prefixOperation
    | '-' prefixOperation
    ;

factor
    : '!' factor
    | TERM '(' termArguments ')'
    | 'forall' '(' iteratorChain '|' condition ')'
    | 'exists' '(' iteratorChain '|' condition ')'
    | ('(' exprContent ')' | procedure | variable) ('.' variable | call)* '!'?
    | value '!'?
    ;

termArguments
    : exprList
    | /* epsilon */
    ;

procedure
    : 'procedure' '(' procedureParameters ')' '{' block '}'
    | 'cachedProcedure' '(' procedureParameters ')' '{' block '}'
    | 'closure' '(' procedureParameters ')' '{' block '}'
    ;

procedureParameters
    : procedureParameter (',' procedureParameter)* (',' procedureDefaultParameter)* (',' procedureListParameter)?
    | procedureDefaultParameter (',' procedureDefaultParameter)* (',' procedureListParameter)?
    | procedureListParameter
    | /* epsilon */
    ;

procedureParameter
    : 'rw' assignableVariable
    | variable
    ;

procedureDefaultParameter
    : assignableVariable ':=' expr
    ;

procedureListParameter
    : '*' variable
    ;

call
    : '(' callParameters ')'
    | '[' collectionAccessParams ']'
    | '{' expr '}'
    ;

callParameters
    : exprList (',' '*' exprContent)?
    | '*' exprContent
    | /* epsilon */
    ;

collectionAccessParams
    : expr (RANGE_SIGN expr? | (',' expr)+)?
    | RANGE_SIGN expr
    ;

value
    : '[' collectionBuilder? ']'
    | '{' collectionBuilder? '}'
    | STRING
    | LITERAL
    | matrix
    | vector
    | atomicValue
    | '_'
    ;

collectionBuilder
    : expr (',' expr (RANGE_SIGN expr | (',' expr)* ('|' expr | /* epsilon */)) | RANGE_SIGN expr | '|' expr | /* epsilon */ | ':' iteratorChain ('|' condition | /* epsilon */))
    ;

iteratorChain
    : iterator (',' iterator)*
    ;

iterator
    : assignable 'in' expr
    ;

matrix
    : '<<' vector+ '>>'
    ;

vector
    : '<<' (('-' | /* epsilon */) (NUMBER | DOUBLE) ('/' NUMBER)?)+ '>>'
    ;

atomicValue
    : NUMBER
    | DOUBLE
    | 'om'
    | 'true'
    | 'false'
    ;


