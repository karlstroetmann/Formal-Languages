#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include "yydoc.h"

// Constructors

char* myStringCopy(char* string) {
	int   length = strlen(string) + 1;
	char* result = malloc(length);
	strcpy(result, string);
	return result;
}

Grammar* createGrammar(Rule* rule, Grammar* grammar) {
	Grammar* result  = malloc(sizeof(Grammar));
	result->mRule    = rule;
	result->mGrammar = grammar;
	return result;
}

Rule* createRule(char* name, BodyList* bodyList) {
	Rule* result      = malloc(sizeof(Rule));
	result->mName     = name;
	result->mBodyList = bodyList;
	return result;
}

BodyList* createBodyList(Body* body, BodyList* bodyList) {
	BodyList* result  = malloc(sizeof(BodyList));
	result->mBody     = body;
	result->mBodyList = bodyList;
	return result;
}

Body* createBody(Item* first, Body* body) {
	Body* result   = malloc(sizeof(Body));
	result->mFirst = first;
	result->mBody  = body;
	return result;
}

Item* createItem(Kind kind, char* name) {
	Item* result  = malloc(sizeof(Item));
	result->mKind = kind;
	result->mName = name;
	return result;
}

// functions for printing

void writeItem(Item* item) {
	if (item->mKind == NONTERMINAL_KIND) {
		printf("<A HREF=\"#%s\"><EM>%s</EM></A>\n", item->mName, item->mName);
		return;
	}
	printf("<TT>%s</TT>\n", item->mName);
}

void writeBody(Body* body) {
	if (body == NULL) {
		return;
	}
	writeItem(body->mFirst);
	writeBody(body->mBody);
}

void writeBodyList(BodyList* bodyList, int number) {
	if (bodyList == NULL) {
		printf("<TR><TD></TD><TD><TT>;</TT></TD></TR>\n");
		return;
	}
	if (number > 0) {
		printf("<TD></TD><TD ALIGN=CENTER>|</TD>\n");
	}
	printf("<TD ALIGN=LEFT>");
	writeBody(bodyList->mBody);
	printf("</TD>\n");
	printf("</TR>\n");
	writeBodyList(bodyList->mBodyList, number + 1);
}

void writeRule(Rule* rule) {
	printf("<TR>\n");
	printf("<TD ALIGN=RIGHT><A NAME=\"%s\">%s</A></TD>\n", rule->mName, rule->mName);
	printf("<TD ALIGN=CENTER><TT>:</TT></TD>\n");
	writeBodyList(rule->mBodyList, 0);
}

void writeRuleList(Grammar* grammar) {
	if (grammar == NULL) {
		return;
	}
	writeRule(grammar->mRule);
	writeRuleList(grammar->mGrammar);
}

void writeGrammar(Grammar* grammar) {
	printf("<HTML>\n");
	printf("<HEAD>\n");
	printf("<TITLE>Grammar</TITLE>\n");
	printf("</HEAD>\n");
	printf("<BODY>\n");
	printf("<TABLE>\n");
	writeRuleList(grammar);
	printf("</TABLE>\n");
	printf("</BODY>\n");
	printf("</HTML>\n");	
}

