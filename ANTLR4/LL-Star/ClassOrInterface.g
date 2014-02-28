grammar ClassOrInterface;

// options {
//    k = 5;
// }

class_or_interface
    : modifier* 'class'     ID '{' '...' '}'
    | modifier* 'interface' ID '{' '...' '}'
    ;

modifier
    : 'public'
    | 'package'
    | 'protected'
    | 'private'
    | 'abstract'
    | 'final'   
    ;

ID : ('A'..'Z'|'a'..'z')+;
