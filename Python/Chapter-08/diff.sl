// Symbolic differentiation.
//
// Arithmetic expressions are represented as nested tuples, just as in the notebook 02-Differentiator.ipynb of
// chapter 7:  A number is represented by itself and the variable x is represented by the string "x".  Compound
// expressions are represented as follows:
//
//     ("+", f, g)    represents  f + g             ("neg", f)    represents  -f
//     ("-", f, g)    represents  f - g             ("ln", f)     represents  ln(f)
//     ("*", f, g)    represents  f * g             ("exp", f)    represents  exp(f)
//     ("/", f, g)    represents  f / g
//     ("**", f, g)   represents  f ** g

// Is the expression e a number?  Every expression that is neither the variable x nor a tuple is a number.
function isNumber(e) {
    match (e) {
        case "x":       { return false; }
        case (_, _):    { return false; }
        case (_, _, _): { return false; }
        case _:         { return true;  }
    }
}

// Differentiate the expression e with respect to the variable x.  If the exponent of a power is a number, the
// power rule is used.  Otherwise, f ** g is differentiated as exp(g * ln(f)).
function diff(e) {
    match (e) {
        case ("+", f, g):                 { return ("+", diff(f), diff(g)); }
        case ("-", f, g):                 { return ("-", diff(f), diff(g)); }
        case ("*", f, g):                 { return ("+", ("*", diff(f), g), ("*", f, diff(g))); }
        case ("/", f, g):                 { return ("/", ("-", ("*", diff(f), g), ("*", f, diff(g))), ("*", g, g)); }
        case ("**", f, n) if isNumber(n): { return ("*", ("*", n, ("**", f, n - 1)), diff(f)); }
        case ("**", f, g):                { return diff(("exp", ("*", g, ("ln", f)))); }
        case ("neg", f):                  { return ("neg", diff(f)); }
        case ("ln", f):                   { return ("/", diff(f), f); }
        case ("exp", f):                  { return ("*", diff(f), e); }
        case "x":                         { return 1; }
        case _:                           { return 0; }
    }
}

// Simplify the expression e.  First, the arguments of e are simplified, then the function rewrite simplifies the
// root of e.
function simplify(e) {
    match (e) {
        case (op, f, g): { return rewrite((op, simplify(f), simplify(g))); }
        case (op, f):    { return rewrite((op, simplify(f))); }
        case _:          { return e; }
    }
}

// Apply the simplification rules to the root of the expression e, whose arguments have already been simplified.
// If a rule creates a new root, this root is rewritten, too.  A pattern like ("-", f, f), in which a variable
// occurs twice, only matches if both occurrences match equal values.
function rewrite(e) {
    match (e) {
        // operators whose arguments are numbers are evaluated
        case ("neg", a) if isNumber(a):                  { return -a; }
        case ("+", a, b) if isNumber(a) && isNumber(b):  { return a + b; }
        case ("-", a, b) if isNumber(a) && isNumber(b):  { return a - b; }
        case ("*", a, b) if isNumber(a) && isNumber(b):  { return a * b; }
        case ("/", a, b) if isNumber(a) && isNumber(b) && b != 0 && a % b == 0: {
            return a / b;    // only exact quotients, as the quotient of two integers is rounded down
        }
        case ("**", a, b) if isNumber(a) && isNumber(b) && b >= 0: { return pow(a, b); }
        // sums and differences
        case ("+", 0, f):           { return f; }
        case ("+", f, 0):           { return f; }
        case ("+", f, f):           { return rewrite(("*", 2, f)); }
        case ("+", f, ("neg", g)):  { return rewrite(("-", f, g)); }
        case ("+", ("neg", f), g):  { return rewrite(("-", g, f)); }
        case ("-", f, 0):           { return f; }
        case ("-", 0, f):           { return rewrite(("neg", f)); }
        case ("-", f, f):           { return 0; }
        case ("-", f, ("neg", g)):  { return rewrite(("+", f, g)); }
        // negations
        case ("neg", ("neg", f)):                 { return f; }
        case ("neg", ("*", n, f)) if isNumber(n): { return rewrite(("*", -n, f)); }
        // products and quotients
        case ("*", 0, _):           { return 0; }
        case ("*", _, 0):           { return 0; }
        case ("*", 1, f):           { return f; }
        case ("*", f, 1):           { return f; }
        case ("*", -1, f):          { return rewrite(("neg", f)); }
        case ("*", f, -1):          { return rewrite(("neg", f)); }
        case ("*", f, f):           { return rewrite(("**", f, 2)); }
        case ("*", f, ("/", g, f)): { return g; }
        case ("*", ("/", g, f), f): { return g; }
        case ("/", 0, _):           { return 0; }
        case ("/", f, 1):           { return f; }
        case ("/", f, f):           { return 1; }
        case ("/", ("*", f, g), g): { return f; }
        case ("/", ("*", g, f), g): { return f; }
        // powers
        case ("**", _, 0):          { return 1; }
        case ("**", f, 1):          { return f; }
        // the logarithm and the exponential function
        case ("ln", 1):                    { return 0; }
        case ("ln", ("exp", f)):           { return f; }
        case ("exp", 0):                   { return 1; }
        case ("exp", ("ln", f)):           { return f; }
        case ("exp", ("*", g, ("ln", f))): { return rewrite(("**", f, g)); }
        case _:                            { return e; }
    }
}

// The precedence of the operator at the root of the expression e.  The higher the precedence, the stronger the
// operator binds.  Negative numbers have the same precedence as the unary minus.
function precedence(e) {
    match (e) {
        case ("+", _, _):                { return 1; }
        case ("-", _, _):                { return 1; }
        case ("*", _, _):                { return 2; }
        case ("/", _, _):                { return 2; }
        case ("neg", _):                 { return 3; }
        case ("**", _, _):               { return 4; }
        case n if isNumber(n) && n < 0:  { return 3; }
        case _:                          { return 5; }
    }
}

// Convert the expression e into a string.  It is enclosed in parentheses if its precedence is less than p.
function paren(e, p) {
    if (precedence(e) < p) {
        return "(" + toString(e) + ")";
    }
    return toString(e);
}

// Convert the expression e into a string using as few parentheses as possible.  The operators "+", "-", "*", and
// "/" are left associative, while "**" is right associative.
function toString(e) {
    match (e) {
        case ("+", f, g):  { return paren(f, 1) + " + "  + paren(g, 1); }
        case ("-", f, g):  { return paren(f, 1) + " - "  + paren(g, 2); }
        case ("*", f, g):  { return paren(f, 2) + " * "  + paren(g, 2); }
        case ("/", f, g):  { return paren(f, 2) + " / "  + paren(g, 3); }
        case ("**", f, g): { return paren(f, 5) + " ** " + paren(g, 4); }
        case ("neg", f):   { return "-" + paren(f, 3); }
        case ("ln", f):    { return "ln(" + toString(f) + ")"; }
        case ("exp", f):   { return "exp(" + toString(f) + ")"; }
        case _:            { return str(e); }
    }
}

// Print the expression e together with its simplified derivative.
function test(e) {
    print("d/dx ", toString(e), " = ", toString(simplify(diff(e))));
}

test(("**", "x", 3));
test(("*", "x", "x"));
test(("/", "x", "x"));
test(("**", "x", "x"));
test(("ln", ("**", "x", "x")));
test(("exp", ("neg", ("**", "x", 2))));
test(("/", 1, ("+", 1, ("exp", ("neg", "x")))));
