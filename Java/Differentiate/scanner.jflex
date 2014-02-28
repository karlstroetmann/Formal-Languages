import java.util.*;

%%

%class Scanner
%standalone

%unicode

%{
    List<Token> mTokenList = new ArrayList<Token>();
%}

%eof{
    System.out.println("Length: " + mTokenList.size()); 
    ExprParser parser = new ExprParser(mTokenList);
    try {
	Expr expr       = parser.parseExpr();
	Expr derivation = expr.diff("x");
	System.out.println("d " + expr + " / dx = " + derivation);
    } catch (ParseError e) {
	System.out.println(e);
    }
%eof}

%%

0|[1-9][0-9]*  { mTokenList.add(new NumberToken(yytext()));   }
"exp"          { mTokenList.add(new Token("exp"));            }
"ln"           { mTokenList.add(new Token("ln"));             }
[a-z]          { mTokenList.add(new VariableToken(yytext())); }
"+"            { mTokenList.add(new Token("+"));              }
"-"            { mTokenList.add(new Token("-"));              }
"*"            { mTokenList.add(new Token("*"));              }
"/"            { mTokenList.add(new Token("/"));              }
"("            { mTokenList.add(new Token("("));              }
")"            { mTokenList.add(new Token(")"));              }
[ \t\n\r]      { /* skip */                                   }
.              { System.out.println("Unexpected char: \"" + 
                                     yytext() + "\"");        } 

