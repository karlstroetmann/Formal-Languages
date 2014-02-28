grammar left;

left: a;

a : 'a' 'b' U 'd' 
  | 'a' V 'b' 'd'
  | 'a' 'b' W
  | 'x' U
  | 'x' V
  ;

U : 'u';
V : 'v';
W : 'w';

