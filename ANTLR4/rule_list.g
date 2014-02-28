grammar rule_list;



rule_list returns [Grammar result]
	:r = Rule  {List<Rule> liste  = new List<Rule>(); liste.add($r); $result= new Grammar(Liste) }
	( r = Rule {liste.add(r)} )*
	;
	
rule returns [Rule result]
	: head = VARIABLE ':' 
	b = Body {List<Body> liste =new List<Body>(); liste.add($b); $result = new Rule(head.getname,liste)}
	('|' b = Body {liste.add($b)} )*
	';'
	;


Body returns [Body result] : 
	{List<Item> liste = new List<Item>(); $result = new Body(liste);}
	(l = Item {liste.add(l); })*
	;

Item returns [Item result]: l = LITERAL { $result= new Literal($l.text);} 
	|	m = TOKEN { $result= new MyToken($m.text);}
	|	v = VARIABLE { $result= new Variable($v.text);}
	;

LITERAL	: ('A'..'Z')+;
VARIABLE: ('a'..'z')+;
TOKEN	: ('\'' (~('\''))* '\'');
WS 	: (' ' | '\t' | '\n' | 'r') {skip()};	
