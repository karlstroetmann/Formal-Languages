conjunction	: conjunction '&' disjunction
         	| disjunction
	        ;

disjunction : disjunction '|' literal
            | literal
            ;

literal     : '!' IDENTIFIER
            | IDENTIFIER
            ;

            
