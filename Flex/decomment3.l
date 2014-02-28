%{
/* remove multiline C comments from a file */
%}

%x comment
%%

"/*"          { BEGIN(comment);    }

<comment>"*/" { BEGIN(INITIAL);    }
<comment>.|\n { /* skip comment */ }

%%

int main() {
    yylex();
    return 0;
}
