grammar Rows;

@parser::members { // add members to generated RowsParser
    int mColumn;
    public RowsParser(TokenStream input, int column) { // custom constructor
        this(input);
        this.mColumn = column;
    }
}

file: (row NL)+ ;

row
locals [int i=0]
    : (STUFF { $i++; if ($i == mColumn) System.out.println($STUFF.text); })+
    ;

TAB  :  '\t' -> skip ;   // match but don't pass to the parser
NL   :  '\r'? '\n' ;     // match and pass to the parser
STUFF:  ~[\t\r\n]+ ;     // match any chars except tab, newline
