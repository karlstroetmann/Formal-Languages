# Generated from Grammar.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .GrammarParser import GrammarParser
else:
    from GrammarParser import GrammarParser

# This class defines a complete listener for a parse tree produced by GrammarParser.
class GrammarListener(ParseTreeListener):

    # Enter a parse tree produced by GrammarParser#start.
    def enterStart(self, ctx:GrammarParser.StartContext):
        pass

    # Exit a parse tree produced by GrammarParser#start.
    def exitStart(self, ctx:GrammarParser.StartContext):
        pass


    # Enter a parse tree produced by GrammarParser#grmrl.
    def enterGrmrl(self, ctx:GrammarParser.GrmrlContext):
        pass

    # Exit a parse tree produced by GrammarParser#grmrl.
    def exitGrmrl(self, ctx:GrammarParser.GrmrlContext):
        pass


    # Enter a parse tree produced by GrammarParser#body.
    def enterBody(self, ctx:GrammarParser.BodyContext):
        pass

    # Exit a parse tree produced by GrammarParser#body.
    def exitBody(self, ctx:GrammarParser.BodyContext):
        pass


    # Enter a parse tree produced by GrammarParser#item.
    def enterItem(self, ctx:GrammarParser.ItemContext):
        pass

    # Exit a parse tree produced by GrammarParser#item.
    def exitItem(self, ctx:GrammarParser.ItemContext):
        pass



del GrammarParser