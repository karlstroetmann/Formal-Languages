# Grammar rules:
r0 =("expr", ('expr', "'+'", 'product'))
r1 =("expr", ('expr', "'-'", 'product'))
r2 =("expr", ('product',))
r3 =("product", ('product', "'*'", 'factor'))
r4 =("product", ('product', "'/'", 'factor'))
r5 =("product", ('factor',))
r6 =("factor", ("'('", 'expr', "')'"))
r7 =("factor", ('NUMBER',))
r8 =("ŝ", ('expr',))

# Action table:
actionTable = {}
actionTable['s1', '/'] = ('shift', 's25')
actionTable['s1', '*'] = ('shift', 's3')
actionTable['s1', ')'] = ('reduce', r1)
actionTable['s1', '-'] = ('reduce', r1)
actionTable['s1', '+'] = ('reduce', r1)
actionTable['s2', 'NUMBER'] = ('shift', 's23')
actionTable['s2', '('] = ('shift', 's22')
actionTable['s3', 'NUMBER'] = ('shift', 's15')
actionTable['s3', '('] = ('shift', 's27')
actionTable['s4', '/'] = ('shift', 's25')
actionTable['s4', '*'] = ('shift', 's3')
actionTable['s4', ')'] = ('reduce', r0)
actionTable['s4', '-'] = ('reduce', r0)
actionTable['s4', '+'] = ('reduce', r0)
actionTable['s5', '/'] = ('shift', 's2')
actionTable['s5', '*'] = ('shift', 's13')
actionTable['s5', '$'] = ('reduce', r1)
actionTable['s5', '-'] = ('reduce', r1)
actionTable['s5', '+'] = ('reduce', r1)
actionTable['s6', ')'] = ('reduce', r4)
actionTable['s6', '*'] = ('reduce', r4)
actionTable['s6', '/'] = ('reduce', r4)
actionTable['s6', '-'] = ('reduce', r4)
actionTable['s6', '+'] = ('reduce', r4)
actionTable['s7', '$'] = ('reduce', r4)
actionTable['s7', '*'] = ('reduce', r4)
actionTable['s7', '/'] = ('reduce', r4)
actionTable['s7', '-'] = ('reduce', r4)
actionTable['s7', '+'] = ('reduce', r4)
actionTable['s8', '/'] = ('shift', 's2')
actionTable['s8', '*'] = ('shift', 's13')
actionTable['s8', '$'] = ('reduce', r2)
actionTable['s8', '-'] = ('reduce', r2)
actionTable['s8', '+'] = ('reduce', r2)
actionTable['s9', ')'] = ('reduce', r5)
actionTable['s9', '*'] = ('reduce', r5)
actionTable['s9', '/'] = ('reduce', r5)
actionTable['s9', '-'] = ('reduce', r5)
actionTable['s9', '+'] = ('reduce', r5)
actionTable['s10', 'NUMBER'] = ('shift', 's15')
actionTable['s10', '('] = ('shift', 's27')
actionTable['s11', '$'] = ('reduce', r5)
actionTable['s11', '*'] = ('reduce', r5)
actionTable['s11', '/'] = ('reduce', r5)
actionTable['s11', '-'] = ('reduce', r5)
actionTable['s11', '+'] = ('reduce', r5)
actionTable['s12', '/'] = ('shift', 's25')
actionTable['s12', '*'] = ('shift', 's3')
actionTable['s12', ')'] = ('reduce', r2)
actionTable['s12', '-'] = ('reduce', r2)
actionTable['s12', '+'] = ('reduce', r2)
actionTable['s13', 'NUMBER'] = ('shift', 's23')
actionTable['s13', '('] = ('shift', 's22')
actionTable['s0', 'NUMBER'] = ('shift', 's23')
actionTable['s0', '('] = ('shift', 's22')
actionTable['s14', '$'] = ('reduce', r3)
actionTable['s14', '*'] = ('reduce', r3)
actionTable['s14', '/'] = ('reduce', r3)
actionTable['s14', '-'] = ('reduce', r3)
actionTable['s14', '+'] = ('reduce', r3)
actionTable['s15', ')'] = ('reduce', r7)
actionTable['s15', '*'] = ('reduce', r7)
actionTable['s15', '/'] = ('reduce', r7)
actionTable['s15', '-'] = ('reduce', r7)
actionTable['s15', '+'] = ('reduce', r7)
actionTable['s16', '$'] = ('reduce', r6)
actionTable['s16', '*'] = ('reduce', r6)
actionTable['s16', '/'] = ('reduce', r6)
actionTable['s16', '-'] = ('reduce', r6)
actionTable['s16', '+'] = ('reduce', r6)
actionTable['s17', '+'] = ('shift', 's19')
actionTable['s17', ')'] = ('shift', 's26')
actionTable['s17', '-'] = ('shift', 's10')
actionTable['s18', ')'] = ('reduce', r3)
actionTable['s18', '*'] = ('reduce', r3)
actionTable['s18', '/'] = ('reduce', r3)
actionTable['s18', '-'] = ('reduce', r3)
actionTable['s18', '+'] = ('reduce', r3)
actionTable['s19', 'NUMBER'] = ('shift', 's15')
actionTable['s19', '('] = ('shift', 's27')
actionTable['s20', 'NUMBER'] = ('shift', 's23')
actionTable['s20', '('] = ('shift', 's22')
actionTable['s21', '/'] = ('shift', 's2')
actionTable['s21', '*'] = ('shift', 's13')
actionTable['s21', '$'] = ('reduce', r0)
actionTable['s21', '-'] = ('reduce', r0)
actionTable['s21', '+'] = ('reduce', r0)
actionTable['s22', 'NUMBER'] = ('shift', 's15')
actionTable['s22', '('] = ('shift', 's27')
actionTable['s23', '$'] = ('reduce', r7)
actionTable['s23', '*'] = ('reduce', r7)
actionTable['s23', '/'] = ('reduce', r7)
actionTable['s23', '-'] = ('reduce', r7)
actionTable['s23', '+'] = ('reduce', r7)
actionTable['s24', '+'] = ('shift', 's19')
actionTable['s24', ')'] = ('shift', 's16')
actionTable['s24', '-'] = ('shift', 's10')
actionTable['s25', 'NUMBER'] = ('shift', 's15')
actionTable['s25', '('] = ('shift', 's27')
actionTable['s26', ')'] = ('reduce', r6)
actionTable['s26', '*'] = ('reduce', r6)
actionTable['s26', '/'] = ('reduce', r6)
actionTable['s26', '-'] = ('reduce', r6)
actionTable['s26', '+'] = ('reduce', r6)
actionTable['s27', 'NUMBER'] = ('shift', 's15')
actionTable['s27', '('] = ('shift', 's27')
actionTable['s28', '+'] = ('shift', 's29')
actionTable['s28', '-'] = ('shift', 's20')
actionTable['s28', '$'] = 'accept'
actionTable['s29', 'NUMBER'] = ('shift', 's23')
actionTable['s29', '('] = ('shift', 's22')

# Goto table:
gotoTable = {}
gotoTable['s2', 'factor'] = 's7'
gotoTable['s3', 'factor'] = 's18'
gotoTable['s10', 'product'] = 's1'
gotoTable['s10', 'factor'] = 's9'
gotoTable['s13', 'factor'] = 's14'
gotoTable['s0', 'expr'] = 's28'
gotoTable['s0', 'product'] = 's8'
gotoTable['s0', 'factor'] = 's11'
gotoTable['s19', 'product'] = 's4'
gotoTable['s19', 'factor'] = 's9'
gotoTable['s20', 'product'] = 's5'
gotoTable['s20', 'factor'] = 's11'
gotoTable['s22', 'expr'] = 's24'
gotoTable['s22', 'product'] = 's12'
gotoTable['s22', 'factor'] = 's9'
gotoTable['s25', 'factor'] = 's6'
gotoTable['s27', 'expr'] = 's17'
gotoTable['s27', 'product'] = 's12'
gotoTable['s27', 'factor'] = 's9'
gotoTable['s29', 'product'] = 's21'
gotoTable['s29', 'factor'] = 's11'
