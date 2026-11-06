// A farmer wants to cross a river together with a wolf, a goat, and a cabbage.  His boat is so small that he can
// only take one of them with him.  However, he must not leave the wolf alone with the goat, since the wolf would eat
// the goat, and he must not leave the goat alone with the cabbage, since the goat would eat the cabbage.
//
// A state is the set of those that are still on the left bank of the river.  A path is a tuple of states.

#load(graph2dot.py)

// Check whether there is a path from x to y in the relation R and compute it.
function findPath(x, y, R) {
    P := { (x,) };
    while (true) {
        oldP  := P;
        P     := P + pathProduct(P, R);
        found := { l : l in P | l[-1] == y };
        if (found != {}) {
            return arb(found);
        }
        if (P == oldP) {
            return;
        }
    }
}

// The call join(p, q) concatenates the paths p and q.  The last point of p has to be the first point of q,
// hence the first point of q is left out.
function join(p, q) {
    [_ | Rest] := list(q);
    return p + tuple(Rest);
}

function pathProduct(P, Q) {
    return { join(x, y) : x in P, y in Q | x[-1] == y[0] && noCycle(x, y) };
}

// The paths l1 and l2 must only have a single point in common.
function noCycle(l1, l2) {
    return #({ x : x in l1 } * { x : x in l2 }) == 1;
}

// Compute the power set of S.
function power(S) {
    if (S == {}) {
        return { {} };
    }
    x := arb(S);
    P := power(S - { x });
    return P + { A + { x } : A in P };
}

////////////////////////////////////////////////////////////////////////////////
//                                                                            //
// Problem specific code                                                      //
//                                                                            //
////////////////////////////////////////////////////////////////////////////////

// Is there a problem on the bank of the river that is given by the set S?
function problem(S) {
    return !("farmer" in S) && "goat" in S && #S > 1;
}

All := { "farmer", "wolf", "goat", "cabbage" };
P   := { S : S in power(All) | !problem(S) && !problem(All - S) };
R1  := { (S, S - B) : S in P, B in power(S) | S - B in P && "farmer" in B && #B <= 2 };
R2  := { (y, x) : (x, y) in R1 };
R   := R1 + R2;

start := All;
goal  := {};

path  := findPath(start, goal, R);

////////////////////////////////////////////////////////////////////////////////
//                                                                            //
// Display code                                                               //
//                                                                            //
////////////////////////////////////////////////////////////////////////////////

// As functions cannot access global variables, the set All is passed as an argument.
function mkPair(S, All) {
    return (S, All - S);
}

graph := { (mkPair(s1, All), mkPair(s2, All)) : (s1, s2) in R1 };
graph2dot(graph, mkPair(start, All), mkPair(goal, All), "wolf-goat-cabbage");

// The number of characters needed to print the set S of strings.
function width(S) {
    if (S == {}) {
        return 2;
    }
    return sum([ #x : x in S ]) + 2 * #S;
}

// Print the path.
function printPath(path, All) {
    for (i := 0; i < #path; i := i + 1) {
        (s1, s2) := mkPair(path[i], All);
        print(s1, (61 - width(s1)) * " ", s2);
        if (i < #path - 1) {
            (t1, t2) := mkPair(path[i + 1], All);
            if ("farmer" in s1) {
                print("                               >>>> ", s1 - t1, " >>>>");
            } else {
                print("                               <<<< ", s2 - t2, " <<<<");
            }
        }
    }
}

printPath(path, All);
