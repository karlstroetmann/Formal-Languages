run: SetlInterpreter.class
	java SetlInterpreter

grammarTest: setl_language.g
	java org.antlr.Tool setl_language.g

SetlInterpreter.class: 	Arb.java AssignmentAdd.java Assignment.java\
			AssignmentSub.java BoolExpr.java Combinator.java\
			ComparableList.java ComparableSet.java\
			Conjunction.java Count.java Definition.java\
			Difference.java Disjunction.java Environment.java\
			Equal.java Expr.java ExprList.java ExprStmnt.java \
			For.java FunctionCall.java GreaterOrEqual.java\
			GreaterThan.java IfThen.java InputReader.java\
			InSet.java IteratorAndBool.java IteratorList.java\
			LessOrEqual.java LessThan.java ListCall.java\
			Modulo.java MyCrossMul.java MyCrossSum.java\
			MyIntersection.java MyIterator.java MyList.java\
			MyListWrapper.java MyNumber.java MyNumberWrapper.java\
			MyReader.java MySet.java MySetWrapper.java PowSet.java\
			MyString.java MyStringWrapper.java Negation.java\
			NotEqual.java Pair.java Power.java PrintExpr.java\
			Print.java PrintString.java Product.java Quit.java\
			Quotient.java Range.java ReturnException.java\
			Return.java Selector.java SetlInterpreter.java\
			SetOrList.java SExpr.java Statement.java Sum.java\
			Transformer.java Value.java Variable.java While.java\
			setl_languageParser.java setl_languageLexer.java\
			setl_language.tokens
	javac *.java

setl_languageParser.java setl_languageLexer.java setl_language.tokens: setl_language.g
	java org.antlr.Tool setl_language.g


clean:
	rm -f *.class
	rm -f setl_language.tokens
	rm -f setl_languageLexer.java
	rm -f setl_languageParser.java
