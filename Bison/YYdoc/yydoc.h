typedef enum Kind { TOKEN_KIND, NONTERMINAL_KIND, CHAR_KIND } Kind;

typedef struct Item {
	Kind  mKind;
	char* mName;
} Item;

typedef struct Body {
	Item*        mFirst;
	struct Body* mBody;
} Body;

typedef struct BodyList {
	Body*            mBody;
	struct BodyList* mBodyList;
} BodyList;

typedef struct Rule {
	char*            mName;
	struct BodyList* mBodyList;
} Rule;

typedef struct Grammar {
 	Rule*           mRule;
	struct Grammar* mGrammar;
} Grammar;

// Constructor declarations
Grammar*  createGrammar ( Rule* rule,  Grammar*  grammar  );
Rule*     createRule    ( char* name,  BodyList* bodyList );
BodyList* createBodyList( Body* body,  BodyList* bodyList );
Body*     createBody    ( Item* first, Body* body         );
Item*     createItem    ( Kind  kind,  char* name         );

void writeGrammar(Grammar* grammar);

int  yylex();
void yyerror(char* msg);
