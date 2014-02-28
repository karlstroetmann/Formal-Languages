grammar ClassOrInterfaceFactor;

options {
    k = 1;
}

class_or_interface_factor
    : modifier* ('class' | 'interface') ID '{' '...' '}'
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
