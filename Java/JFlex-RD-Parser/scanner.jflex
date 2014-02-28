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
	Integer    result = parser.parseExpr();
	System.out.println("Ergebnis: " + result);
    } catch (ParseError e) {
	System.out.println(e);
    }
%eof}

%%

0|[1-9][0-9]*  { mTokenList.add(new NumberToken(yytext())); }
"+"            { mTokenList.add(new Token("+"));            }
"-"            { mTokenList.add(new Token("-"));            }
"*"            { mTokenList.add(new Token("*"));            }
"/"            { mTokenList.add(new Token("/"));            }
"("            { mTokenList.add(new Token("("));            }
")"            { mTokenList.add(new Token(")"));            }
[ \t\n\r]      { /* skip */                                 }
.              { System.out.println("Unexpected char: \"" + 
                                     yytext() + "\"");      } 

