# Grammar rules:
r0 =("s", ("'v'", 'a', "'y'"))
r1 =("s", ("'w'", 'b', "'y'"))
r2 =("s", ("'v'", 'b', "'z'"))
r3 =("s", ("'w'", 'a', "'z'"))
r4 =("a", ("'x'",))
r5 =("b", ("'x'",))
r6 =("ŝ", ('s',))

# Action table:
actionTable = {}
actionTable['s1', 'z'] = ('shift', 's3')
actionTable['s2', 'z'] = ('reduce', r5)
actionTable['s2', 'y'] = ('reduce', r4)
actionTable['s3', '$'] = ('reduce', r2)
actionTable['s4', 'x'] = ('shift', 's7')
actionTable['s5', 'y'] = ('shift', 's6')
actionTable['s6', '$'] = ('reduce', r0)
actionTable['s7', 'y'] = ('reduce', r5)
actionTable['s7', 'z'] = ('reduce', r4)
actionTable['s8', 'z'] = ('shift', 's12')
actionTable['s9', '$'] = ('reduce', r1)
actionTable['s0', 'v'] = ('shift', 's13')
actionTable['s0', 'w'] = ('shift', 's4')
actionTable['s10', '$'] = 'accept'
actionTable['s11', 'y'] = ('shift', 's9')
actionTable['s12', '$'] = ('reduce', r3)
actionTable['s13', 'x'] = ('shift', 's2')

# Goto table:
gotoTable = {}
gotoTable['s4', 'b'] = 's11'
gotoTable['s4', 'a'] = 's8'
gotoTable['s0', 's'] = 's10'
gotoTable['s13', 'b'] = 's1'
gotoTable['s13', 'a'] = 's5'
