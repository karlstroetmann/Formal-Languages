def print_lalr1_states(parser, token_map=None):
    """
    Computes and prints the true LALR(1) state machine for an arbitrary Lark LALR parser.
    
    Args:
        parser (Lark): A Lark parser instance initialized with parser='lalr'
        token_map (dict, optional): A dictionary mapping formal Terminal names to 
                                    their string representations for didactic printing.
                                    (e.g., {'ASSIGN': "':='", 'SEMI': "';'"})
    """
    if token_map is None:
        token_map = {}
        
    rules = parser.parser.parser_conf.rules
    
    # 1. Generalized Formatter
    def fmt(sym):
        name = getattr(sym, 'name', str(sym))
        if getattr(sym, 'is_term', False):
            # Use user-provided map, default EOF, or fallback to the formal name
            if name in token_map:
                return token_map[name]
            if name == '$END':
                return "'$'"
            return f"'{name}'"
        return name

    non_terminals = {r.origin.name for r in rules}
    
    # 2. Compute FIRST sets
    first = {nt: set() for nt in non_terminals}
    
    def first_of(seq):
        res = set()
        for sym in seq:
            s = fmt(sym)
            if s not in non_terminals:
                res.add(s)
                break
            else:
                res |= first[s]
                break 
        return res

    changed = True
    while changed:
        changed = False
        for r in rules:
            lhs = r.origin.name
            f = first_of(r.expansion)
            if not f.issubset(first[lhs]):
                first[lhs] |= f
                changed = True
                
    # 3. LR(0) State Generation
    def get_lr0_closure(items):
        closure = set(items)
        changed = True
        while changed:
            changed = False
            for rule, dot in list(closure):
                if dot < len(rule.expansion):
                    sym = rule.expansion[dot]
                    if not getattr(sym, 'is_term', False):
                        for r in rules:
                            if r.origin.name == sym.name:
                                if (r, 0) not in closure:
                                    closure.add((r, 0))
                                    changed = True
        return frozenset(closure)

    start_rule = rules[0]
    initial_state = get_lr0_closure({(start_rule, 0)})
    
    states = [initial_state]
    transitions = {} 
    processed = 0
    
    while processed < len(states):
        current = states[processed]
        symbols = {r.expansion[dot] for r, dot in current if dot < len(r.expansion)}
        
        for sym in symbols:
            next_items = get_lr0_closure({(r, dot + 1) for r, dot in current 
                                     if dot < len(r.expansion) and r.expansion[dot] == sym})
            if next_items not in states:
                states.append(next_items)
            transitions[(processed, fmt(sym))] = states.index(next_items)
        processed += 1

    # 4. LALR(1) Lookahead Propagation
    lookaheads = { (i, r, d): set() for i, state in enumerate(states) for r, d in state }
    lookaheads[(0, start_rule, 0)].add("'$'") 
    
    changed = True
    while changed:
        changed = False
        for i, state in enumerate(states):
            # A. Internal closure propagation
            for rule, dot in state:
                if dot < len(rule.expansion):
                    sym = rule.expansion[dot]
                    if fmt(sym) in non_terminals:
                        beta = rule.expansion[dot+1:]
                        pass_la = set(first_of(beta))
                        if len(beta) == 0:
                            pass_la |= lookaheads[(i, rule, dot)]
                        
                        for r in rules:
                            if r.origin.name == sym.name:
                                old_len = len(lookaheads[(i, r, 0)])
                                lookaheads[(i, r, 0)] |= pass_la
                                if len(lookaheads[(i, r, 0)]) > old_len:
                                    changed = True
                                    
            # B. Transition propagation
            for rule, dot in state:
                if dot < len(rule.expansion):
                    sym = rule.expansion[dot]
                    next_i = transitions.get((i, fmt(sym)))
                    if next_i is not None:
                        old_len = len(lookaheads[(next_i, rule, dot + 1)])
                        lookaheads[(next_i, rule, dot + 1)] |= lookaheads[(i, rule, dot)]
                        if len(lookaheads[(next_i, rule, dot + 1)]) > old_len:
                            changed = True

    # 5. Formatted Didactic Output
    for i, state in enumerate(states):
        print(f"\n--- State {i} ---")
        for rule, dot in sorted(state, key=lambda x: (x[0].origin.name, x[1])):
            exp = [fmt(x) for x in rule.expansion]
            exp.insert(dot, "•")
            
            la_str = ""
            if dot == len(rule.expansion):
                la_set = sorted(lookaheads[(i, rule, dot)])
                la_str = f" [{', '.join(la_set)}]"
                
            print(f"  {fmt(rule.origin):<10} -> {' '.join(exp)}{la_str}")
