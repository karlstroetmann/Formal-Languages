%{
/* This flex program is intended to translate HTML to text. 
   It is not intended to be practical but is rather used to demonstrate
   the usage of start conditions.
   Author:  Karl Stroetmann
   License: GPL
*/   
%}

%x header script

%%

"<head>"            { BEGIN(header);           }
"<script"[^>\n]+">" { BEGIN(script);           }
"<"[^>\n]+">"       { /* skip html tags */     }
[\n]+               { printf("\n");            }
&nbsp;              { printf(" ");             }
&auml;              { printf("ä");             }
&ouml;              { printf("ö");             }
&uuml;              { printf("ü");             }
&Auml;              { printf("Ä");             }
&Ouml;              { printf("Ö");             }
&Uuml;              { printf("Ü");             }
&szlig;             { printf("ß");             }

<header>"</head>"   { BEGIN(INITIAL);          }
<header>.|\n        { /* skip anything else */ }

<script>"</script>" { BEGIN(INITIAL); }
<script>.|\n        { /* skip anything else */ }

%%

int main() {
    yylex();
}
