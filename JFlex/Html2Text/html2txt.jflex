package Converter;

%% 

%class Html2Txt
%standalone
%unicode

%xstate header script
%%

"<head>"            { yybegin(header);         }
"<script"[^>]+">"   { yybegin(script);         }
"<"[^>]+">"         { /* skip html tags */     }
\R+                 { System.out.print("\n");  }
&nbsp;              { System.out.print(" ");   }
&auml;              { System.out.print("ä");   }
&ouml;              { System.out.print("ö");   }
&uuml;              { System.out.print("ü");   }
&Auml;              { System.out.print("Ä");   }
&Ouml;              { System.out.print("Ö");   }
&Uuml;              { System.out.print("Ü");   }
&szlig;             { System.out.print("ß");   }

<header>"</head>"   { yybegin(YYINITIAL);      }
<header>.|\R        { /* skip anything else */ }

<script>"</script>" { yybegin(YYINITIAL);      }
<script>.|\R        { /* skip anything else */ }

