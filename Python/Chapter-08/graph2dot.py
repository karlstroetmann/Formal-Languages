"""
Drawing graphs with Graphviz.

A program of our language loads this file with the directive

    #load(graph2dot.py)

Afterwards, the function graph2dot can be called like a built-in function.  The function _label is a helper
function:  As its name starts with an underscore, it is not made available to programs of our language.
"""
import graphviz
from IPython.display import display


def graph2dot(R, start, goal, name):
    """
    Draw the relation R as an undirected graph and display it in the notebook.

    R is a set of pairs (x, y), every one of which is drawn as an edge between the nodes x and y.  If R contains
    both (x, y) and (y, x), this edge is drawn only once.  The nodes start and goal are highlighted, and name is
    used as the title of the graph.
    """
    dot = graphviz.Graph(name, graph_attr={'label': name, 'labelloc': 't', 'fontsize': '20'},
                               node_attr={'shape': 'box', 'style': 'rounded'})
    Nodes = {x for (x, _) in R} | {y for (_, y) in R} | {start, goal}
    Ids   = {}
    for node in sorted(Nodes, key=_label):
        Ids[node] = str(len(Ids))
        if node == start:
            dot.node(Ids[node], _label(node), style='rounded,filled', fillcolor='palegreen')
        elif node == goal:
            dot.node(Ids[node], _label(node), style='rounded,filled', fillcolor='lightskyblue')
        else:
            dot.node(Ids[node], _label(node))
    Edges = {tuple(sorted((x, y), key=_label)) for (x, y) in R}
    for (x, y) in sorted(Edges, key=_label):
        dot.edge(Ids[x], Ids[y])
    display(dot)


def _label(value):
    """Convert a value of our language into the string that is used as the label of a node."""
    if isinstance(value, bool):
        return 'true' if value else 'false'
    if isinstance(value, frozenset):
        return '{' + ', '.join(sorted(_label(x) for x in value)) + '}'
    if isinstance(value, tuple):
        return ', '.join(_label(x) for x in value) 
    if isinstance(value, list):
        return '[' + ', '.join(_label(x) for x in value) + ']'
    return str(value)
