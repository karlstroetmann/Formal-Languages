%%

%class Note
%int        // declare return type of yylex
%line
%column
%unicode

%{
    public int mMaxPoints = 0;
    public int mSumPoints = 0;
    public double mark() {
        return 7.0 - 6.0 * mSumPoints / mMaxPoints;
    } 
    public void errorMsg() {
        System.out.printf("invalid character '%s' at line %d, column %d\n", 
                          yytext(), yyline + 1, yycolumn + 1); 
    }    
    public static void main(String argv[]) {
        if (argv.length != 2) {
            System.out.println("Usage : java Note <inputfile> <maxPoints>");
        } else {
            Note scanner = null;
            try {
                scanner            = new Note(new java.io.FileReader(argv[0]));
                scanner.mMaxPoints = new Integer(argv[1]);
                scanner.yylex();
            } catch (java.io.FileNotFoundException e) {
                System.out.println("File not found : \"" + argv[0] + "\"");
            } catch (java.io.IOException e) {
                System.out.println("IO error scanning \"" + argv[0] + "\"");
                System.out.println(e);
            } 
        }
    }

%}
ZAHL = 0|[1-9][0-9]*
NAME = [A-Za-z‰ˆ¸ƒ÷‹ﬂ]+[ ][A-Za-z‰ˆ¸ƒ÷‹ﬂ\-]+
%% 

[A-Za-z]+:.*\R { /* skip header                         */ }
{NAME}/:       { System.out.print(yytext()); 
                 mSumPoints = 0;                           }
:[ \t]+        { System.out.print(yytext());               }
{ZAHL}         { mSumPoints += new Integer(yytext());      }
-              { /* skip hyphens                        */ }
[ \t]          { /* skip white space                    */ }
^[ \t]*\R      { /* skip empty line                     */ }
\R             { System.out.printf(" %3.1f\n", mark());    }
.              { errorMsg();                               }


