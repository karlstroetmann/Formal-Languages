/**
   This is a small example of a stupid little program that adds up all 
   the numbers it can find in its input.  Everything else in the input
   is just ignored.
*/
package count;

%%

%class Count
%standalone
%unicode

%{
    int mCount = 0;
%}

%eof{
    System.out.println("Total: " + mCount); 
%eof}

%%

0|[1-9][0-9]*  { mCount += new Integer(yytext()); }
.|\n           { /* skip */                       }

