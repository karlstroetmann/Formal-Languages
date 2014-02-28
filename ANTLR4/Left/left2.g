grammar left2;

options {
    k = 1;
}

left2: a;

a : u
  | v
  ;

u : 'x' 'y';
v : 'x' 'z' ;

