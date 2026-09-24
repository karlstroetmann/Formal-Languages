init_block
    : statement_plus
    ;

statement_plus
    : statement
    | statement_plus statement
    ;

init_expr
    : expr
    ;

block
    : statement_star
    ;

statement_star
    : 
    | statement_star statement
    ;

statement
    : 'class' ID '(' procedure_parameters ')' '{' block static_block_opt '}' semi_opt
    | 'if' '(' condition ')' '{' block '}' elseif_list_star else_block_opt
    | 'switch' '{' case_list_star default_block_opt '}'
    | match
    | scan
    | 'for' '(' iterator_chain pipe_condition_opt ')' '{' block '}'
    | 'while' '(' condition ')' '{' block '}'
    | 'do' '{' block '}' 'while' '(' condition ')' ';'
    | 'try' '{' block '}' catch_list_star catch_opt
    | 'check' '{' block '}' after_backtrack_opt
    | 'backtrack' ';'
    | 'break' ';'
    | 'continue' ';'
    | 'exit' ';'
    | 'return' expr_opt ';'
    | 'assert' '(' condition ',' expr ')' ';'
    | assignment_other ';'
    | assignment_direct ';'
    | expr ';'
    ;

static_block_opt
    : 'static' '{' block '}'
    | 
    ;

semi_opt
    : ';'
    | 
    ;

elseif_list_star
    : 
    | elseif_list_star elseif_block
    ;

elseif_block
    : 'else' 'if' '(' condition ')' '{' block '}'
    ;

else_block_opt
    : 'else' '{' block '}'
    | 
    ;

case_list_star
    : 
    | case_list_star case_block
    ;

case_block
    : 'case' condition ':' block
    ;

default_block_opt
    : 'default' ':' block
    | 
    ;

catch_list_star
    : 
    | catch_list_star catch_lng_usr
    ;

catch_lng_usr
    : 'catchLng' '(' assignable_variable ')' '{' block '}'
    | 'catchUsr' '(' assignable_variable ')' '{' block '}'
    ;

catch_opt
    : 'catch' '(' assignable_variable ')' '{' block '}'
    | 
    ;

after_backtrack_opt
    : 'afterBacktrack' '{' block '}'
    | 
    ;

expr_opt
    : expr
    | 
    ;

match
    : 'match' '(' expr ')' '{' match_branch_plus default_block_opt '}'
    ;

match_branch_plus
    : match_branch
    | match_branch_plus match_branch
    ;

match_branch
    : 'case' expr_list pipe_condition_opt ':' block
    | regex_branch
    ;

scan
    : 'scan' '(' expr ')' using_opt '{' regex_branch_plus default_block_opt '}'
    ;

using_opt
    : 'using' assignable_variable
    | 
    ;

regex_branch_plus
    : regex_branch
    | regex_branch_plus regex_branch
    ;

regex_branch
    : 'regex' expr as_expr_opt pipe_condition_opt ':' block
    ;

as_expr_opt
    : 'as' expr
    | 
    ;

pipe_condition_opt
    : '|' condition
    | 
    ;

assignable_variable
    : ID
    ;

variable
    : ID
    ;

condition
    : expr
    ;

expr_list
    : expr_content comma_expr_content_star
    ;

comma_expr_content_star
    : 
    | comma_expr_content_star comma_expr_content
    ;

comma_expr_content
    : ',' expr_content
    ;

assignment_other
    : assignable assign_op_expr
    ;

assign_op_expr
    : '+=' expr
    | '-=' expr
    | '*=' expr
    | '/=' expr
    | '\\=' expr
    | '%=' expr
    ;

assignment_direct
    : assignment_direct_content
    ;

assignment_direct_content
    : assignable ':=' direct_assign_rhs
    ;

direct_assign_rhs
    : assignment_direct_content
    | expr_content
    ;

assignable
    : assignable_variable assignable_tail_star
    | '[' assignment_list ']'
    | '_'
    ;

assignable_tail_star
    : 
    | assignable_tail_star assignable_tail
    ;

assignable_tail
    : '.' variable
    | '[' expr_list ']'
    ;

assignment_list
    : assignable comma_assignable_star
    ;

comma_assignable_star
    : 
    | comma_assignable_star comma_assignable
    ;

comma_assignable
    : ',' assignable
    ;

expr
    : expr_content
    ;

expr_content
    : lambda_procedure
    | implication implication_tail_opt
    ;

implication_tail_opt
    : implication_op implication
    | 
    ;

implication_op
    : '<==>'
    | '<!=>'
    ;

lambda_procedure
    : lambda_parameters lambda_op expr
    ;

lambda_op
    : '|->'
    | '|=>'
    ;

lambda_parameters
    : variable
    | '[' lambda_var_list_opt ']'
    ;

lambda_var_list_opt
    : lambda_var_list
    | 
    ;

lambda_var_list
    : variable comma_variable_star
    ;

comma_variable_star
    : 
    | comma_variable_star comma_variable
    ;

comma_variable
    : ',' variable
    ;

implication
    : disjunction right_arrow_implication_opt
    ;

right_arrow_implication_opt
    : '=>' implication
    | 
    ;

disjunction
    : conjunction or_conjunction_star
    ;

or_conjunction_star
    : 
    | or_conjunction_star or_conjunction
    ;

or_conjunction
    : '||' conjunction
    ;

conjunction
    : comparison and_comparison_star
    ;

and_comparison_star
    : 
    | and_comparison_star and_comparison
    ;

and_comparison
    : '&&' comparison
    ;

comparison
    : sum comparison_tail_opt
    ;

comparison_tail_opt
    : comp_op sum
    | 
    ;

comp_op
    : '=='
    | '!='
    | '<'
    | '<='
    | '>'
    | '>='
    | 'in'
    | 'notin'
    ;

sum
    : product sum_tail_star
    ;

sum_tail_star
    : 
    | sum_tail_star sum_tail
    ;

sum_tail
    : '+' product
    | '-' product
    ;

product
    : reduce product_tail_star
    ;

product_tail_star
    : 
    | product_tail_star product_tail
    ;

product_tail
    : '*' reduce
    | '/' reduce
    | '\\' reduce
    | '%' reduce
    | '><' reduce
    ;

reduce
    : prefix_operation reduce_tail_star
    ;

reduce_tail_star
    : 
    | reduce_tail_star reduce_tail
    ;

reduce_tail
    : '+/' prefix_operation
    | '*/' prefix_operation
    ;

prefix_operation
    : factor power_opt
    | '+/' prefix_operation
    | '*/' prefix_operation
    | '#' prefix_operation
    | '-' prefix_operation
    ;

power_opt
    : '**' prefix_operation
    | 
    ;

factor
    : '!' factor
    | TERM '(' term_arguments ')'
    | 'forall' '(' iterator_chain '|' condition ')'
    | 'exists' '(' iterator_chain '|' condition ')'
    | factor_base factor_tail_star bang_opt
    | value bang_opt
    ;

factor_base
    : '(' expr_content ')'
    | procedure
    | variable
    ;

factor_tail
    : '.' variable
    | call
    ;

bang_opt
    : '!'
    | 
    ;

term_arguments
    : expr_list
    | 
    ;

procedure
    : 'procedure' '(' procedure_parameters ')' '{' block '}'
    | 'cachedProcedure' '(' procedure_parameters ')' '{' block '}'
    | 'closure' '(' procedure_parameters ')' '{' block '}'
    ;

procedure_parameters
    : procedure_parameter comma_proc_param_star comma_proc_def_param_star comma_proc_list_param_opt
    | procedure_default_parameter comma_proc_def_param_star comma_proc_list_param_opt
    | procedure_list_parameter
    | 
    ;

comma_proc_param_star
    : 
    | comma_proc_param_star comma_proc_param
    ;

comma_proc_param
    : ',' procedure_parameter
    ;

comma_proc_def_param_star
    : 
    | comma_proc_def_param_star comma_proc_def_param
    ;

comma_proc_def_param
    : ',' procedure_default_parameter
    ;

comma_proc_list_param_opt
    : ',' procedure_list_parameter
    | 
    ;

procedure_parameter
    : 'rw' assignable_variable
    | variable
    ;

procedure_default_parameter
    : assignable_variable ':=' expr
    ;

procedure_list_parameter
    : '*' variable
    ;

call
    : '(' call_parameters ')'
    | '[' collection_access_params ']'
    | '{' expr '}'
    ;

call_parameters
    : expr_list call_params_tail_opt
    | '*' expr_content
    | 
    ;

call_params_tail_opt
    : ',' '*' expr_content
    | 
    ;

collection_access_params
    : expr collection_access_tail_opt
    | RANGE_SIGN expr
    ;

collection_access_tail_opt
    : RANGE_SIGN expr_opt
    | comma_expr_plus
    | 
    ;

comma_expr_plus
    : comma_expr
    | comma_expr_plus comma_expr
    ;

comma_expr
    : ',' expr
    ;

value
    : '[' collection_builder_opt ']'
    | '{' collection_builder_opt '}'
    | STRING
    | LITERAL
    | matrix
    | vector
    | atomic_value
    | '_'
    ;

collection_builder_opt
    : collection_builder
    | 
    ;

collection_builder
    : expr collection_builder_tail
    ;

collection_builder_tail
    : ',' expr coll_build_sub_tail
    | RANGE_SIGN expr
    | '|' expr
    | 
    | ':' iterator_chain pipe_cond_or_empty
    ;

coll_build_sub_tail
    : RANGE_SIGN expr
    | comma_expr_star pipe_expr_opt
    ;

comma_expr_star
    : 
    | comma_expr_star comma_expr
    ;

pipe_expr_opt
    : '|' expr
    | 
    ;

pipe_cond_or_empty
    : '|' condition
    | 
    ;

iterator_chain
    : iterator comma_iterator_star
    ;

comma_iterator_star
    : 
    | comma_iterator_star comma_iterator
    ;

comma_iterator
    : ',' iterator
    ;

iterator
    : assignable 'in' expr
    ;

matrix
    : '<<' vector_plus '>>'
    ;

vector_plus
    : vector
    | vector_plus vector
    ;

vector
    : '<<' vector_elem_plus '>>'
    ;

vector_elem_plus
    : vector_elem
    | vector_elem_plus vector_elem
    ;

vector_elem
    : minus_opt num_or_double div_num_opt
    ;

minus_opt
    : '-'
    | 
    ;

num_or_double
    : NUMBER
    | DOUBLE
    ;

div_num_opt
    : '/' NUMBER
    | 
    ;

atomic_value
    : NUMBER
    | DOUBLE
    | 'om'
    | 'true'
    | 'false'
    ;
