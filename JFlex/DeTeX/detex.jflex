%% 

%class DeTeX
%line
%column
%standalone
%unicode

%{
  void myPrint(String arg) { System.out.print(arg);        }
  void myPrint(int    arg) { System.out.print(arg + ". "); }
  int  counter = 0; 
%}

SIZE = [0-9\-\.]+(cm|in|mm|pt)
   
%xstate chapter format pair verbatim
%%

\344                  { myPrint("ä"); }
\366                  { myPrint("ö"); }
\374                  { myPrint("ü"); }
\304                  { myPrint("Ä"); }
\326                  { myPrint("Ö"); }
\334                  { myPrint("Ü"); }
\337                  { myPrint("ß"); }

\u00e4                { myPrint("ä"); }
\u00f6                { myPrint("ö"); }
\u00fc                { myPrint("ü"); }
\u00c4                { myPrint("Ä"); }
\u00d6                { myPrint("Ö"); }
\u00dc                { myPrint("Ü"); }
\u00d6                { myPrint("ß"); }

"\\\"a"               { myPrint("ä"); }
"\\\"o"               { myPrint("ö"); }
"\\\"u"               { myPrint("ü"); }
"\\\"A"               { myPrint("Ä"); }
"\\\"O"               { myPrint("Ö"); }
"\\\"U"               { myPrint("Ü"); }

"\\\"{a}"             { myPrint("ä"); }
"\\\"{o}"             { myPrint("ö"); }
"\\\"{u}"             { myPrint("ü"); }
"\\\"{A}"             { myPrint("Ä"); }
"\\\"{O}"             { myPrint("Ö"); }
"\\\"{U}"             { myPrint("Ü"); }
"\\3"                 { myPrint("ß"); }

"$$"                  { myPrint("$"); }
"\\noindent"          { /* skip */    }
"\\centering"         { /* skip */    }
"\\quad"              { /* skip */    }
"\\qquad"             { /* skip */    }
"\\limits"            { /* skip */    }
"\\href"              { /* skip */    }
"\\;"                 { /* skip */    }
"\\,"                 { /* skip */    }
"\\right"             { /* skip */    }
"\\left"              { /* skip */    }
"\\bigl"              { /* skip */    }
"\\bigr"              { /* skip */    }
"\\bigm"              { /* skip */    }
"\\biggl"             { /* skip */    }
"\\biggr"             { /* skip */    }
"\\biggm"             { /* skip */    }
"\\Bigl"              { /* skip */    }
"\\Bigr"              { /* skip */    }
"\\Bigm"              { /* skip */    }
"\\big"               { /* skip */    }
^\\\\\[{SIZE}\]\n?    { /* skip */    }
\\\\\[{SIZE}\]\n      { /* skip */    }
"\\hspace*{"{SIZE}"}" { /* skip */    }
"\\vspace*{"{SIZE}"}" { /* skip */    }
"\\vspace{"{SIZE}"}"  { /* skip */    }
"\\hspace{"{SIZE}"}"  { /* skip */    }
"\\hspace*{\\fill}"   { /* skip */    }
"\\vspace*{\\fill}"   { /* skip */    }
"\\begin{center}"     { /* skip */    }
"\\end{center}"       { /* skip */    }
"\\pagebreak"         { /* skip */    }
"\\end{Verbatim}"     { /* skip */    }
"\\end{figure}"       { /* skip */    }
%.*                   { /* skip */    }
"\\ref"               { /* skip */    }
"\\pageref"           { /* skip */    }

"\\begin{figure}"(\[[ht!]+\])?     { /* skip */    }
"\\colorbox{"[^}]+"}"              { /* skip */    }
"\\color{"[^}]+"}"                 { /* skip */    }

"\\stackrel{\\mathrm{def}}{\\Longleftrightarrow}" { myPrint(":<==>"); }
"\\stackrel{de\\!f}{\\Longleftrightarrow}"        { myPrint(":<==>"); }

"\\longleftrightarrow" { myPrint("<-->"); }
"\\Longleftrightarrow" { myPrint("<==>"); }
"\\leftrightarrow"     { myPrint("<->");  }
"\\Leftrightarrow"     { myPrint("<=>");  }
"\\Rightarrow"         { myPrint("=>");   }
"\\rightarrow"         { myPrint("->");   }
"\\leftarrow"          { myPrint("<-");   }
"\\Leftarrow"          { myPrint("<=");   }
"\\mapsto"             { myPrint("|->");  }

"\\colon"             { myPrint(":");          }
"\\symbol{34}"        { myPrint("\"");         }
"\\symbol{36}"        { myPrint("$");          }
"\\symbol{37}"        { myPrint("%");          }
"\\symbol{126}"       { myPrint("~");          }
"\\symbol{94}"        { myPrint("^");          }
"\\cdots"             { myPrint("...");        }
"\\times"             { myPrint("><");         }
"\\langle"            { myPrint("<");          }
"\\rangle"            { myPrint(">");          }
"\\cdot"              { myPrint("*");          }
"\\el"                { myPrint("\\in");       }
"\\bigcup"            { myPrint(yytext());     }
"\\bigcap"            { myPrint(yytext());     }
"\\bruch"             { myPrint("\\frac");     }
"``"                  { myPrint("\"");         }
"''"                  { myPrint("\"");         }
"\\proof"             { myPrint("Beweis:");    }
"\\remark"            { myPrint("Bemerkung:"); }
"\\examples"          { myPrint("Beispiele:"); }
"\\example"           { myPrint("Beispiel:");  }
"\\leq"               { myPrint("<=");         }
"\\geq"               { myPrint(">=");         }
"\\mid"               { myPrint("|");          }
"\\vee"               { myPrint("||");         }
"\\wedge"             { myPrint("&&");         }
"\\backslash"         { myPrint("\\");         }
"\\neg"               { myPrint("!");          }
"\\mathbb{N}"         { myPrint("\\N");        }
"\\mathbb{Q}"         { myPrint("\\Q");        }
"\\mathbb{C}"         { myPrint("\\C");        }
"\\mathbb{R}"         { myPrint("\\R");        }
"\\mathbb{Z}"         { myPrint("\\Z");        }

"\\label{"[a-z:0-9]"}" { /* skip */ }

"\\begin{Definition}" { myPrint("Definition"); }
"\\end{Definition}"   { myPrint("\n");         }

"\\begin{enumerate}"  { counter = 1;        }
"\\end{enumerate}"    { counter = 0;        }
"\\item"              { myPrint(counter++); }
.                     { myPrint(yytext()); }

"\\begin{Verbatim}["  { yybegin(verbatim);                             }

"\\mathtt{"           { yybegin(format);   }
"\\underline{"        { yybegin(format);   }
"\\texttt{"           { yybegin(format);   }
"\\textbf{"           { yybegin(format);   }
"\\textsc{"           { yybegin(format);   }
"\\emph{"             { yybegin(format);   }
"\\textsl{"           { yybegin(format);   }

"\\pair("             { yybegin(pair); myPrint("<");                   }

"\\chapter{"         { yybegin(chapter); myPrint("Kapitel: ");        }
"\\section{"         { yybegin(chapter); myPrint("Abschnitt: ");      }
"\\subsection{"      { yybegin(chapter); myPrint("Unterabschnitt: "); }
"\\subsubsection{"   { yybegin(chapter);                              }
"\\paragraph{"       { yybegin(chapter);                              }

<chapter> {
  "}"               { yybegin(YYINITIAL); }
  "$^*$"            { myPrint("*");       }
  .                 { myPrint(yytext());  }
}

<format> {
  "}"               { yybegin(YYINITIAL); }
  .                 { myPrint(yytext());  }
} 

<pair> {
  ")"               { yybegin(YYINITIAL); myPrint(">"); }
  .                 { myPrint(yytext());  }
} 

<verbatim> {
  "]"               { yybegin(YYINITIAL); }
  [^]               { /* skip */          }
} 



