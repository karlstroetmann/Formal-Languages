import ply.lex as lex

tokens = [ 'X' ]

def t_NUMBER(t):
    r'x'
    return t

literals = ['v', 'w', 'y', 'z']

t_ignore  = ' \t'

def t_newline(t):
    r'\n+'
    t.lexer.lineno += t.value.count('\n')

def t_error(t):
    print(f"Illegal character '{t.value[0]}'")
    t.lexer.skip(1)

__file__ = 'main'

lexer = lex.lex()

import ply.yacc as yacc

start = 's'

def p_s(p):
    """
    s : 'v' a 'y'
      | 'w' b 'y'
      | 'v' b 'z'
      | 'w' a 'z'
      
    a : X
    
    b : X
    """
    pass

def p_error(p):
    if p:
        print(f'Syntax error at {p.value}.')
    else:
        print('Syntax error at end of input.')

parser = yacc.yacc(write_tables=False, debug=True)




