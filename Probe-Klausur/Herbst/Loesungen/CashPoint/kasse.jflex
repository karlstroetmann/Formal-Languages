%%

%class Kasse
%standalone

%unicode

%{
    double mCount = 0;
%}

%eof{
    System.out.println("Total: " + mCount); 
%eof}

%%

(0|[1-9][0-9]*)\.[0-9]{2}/" Euro"    { mCount += new Double(yytext());         }
(0|[1-9][0-9]*)\.[0-9]{2}/" Franken" { mCount += (new Double(yytext())) / 1.2; }
.|\n                                 { /* skip */                              }

