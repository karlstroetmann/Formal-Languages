// Binary search trees, represented as nested tuples:
//   - the empty tree is represented by the empty tuple (),
//   - the tree with the key k, the left subtree L, and the right subtree R is represented by the triple (L, k, R).

function insert(T, k) {
    match (T) {
        case (): {
            return ((), k, ());
        }
        case (L, x, R) if k < x: {
            return (insert(L, k), x, R);
        }
        case (L, x, R) if k > x: {
            return (L, x, insert(R, k));
        }
        case _: {
            return T;   // the key k is already stored in T
        }
    }
}

function member(T, k) {
    match (T) {
        case (): {
            return false;
        }
        case (L, x, _) if k < x: {
            return member(L, k);
        }
        case (_, x, R) if k > x: {
            return member(R, k);
        }
        case _: {
            return true;
        }
    }
}

// Return the list of all keys stored in T in ascending order.
function to_list(T) {
    match (T) {
        case (): {
            return [];
        }
        case (L, x, R): {
            return to_list(L) + [x] + to_list(R);
        }
    }
}

function height(T) {
    match (T) {
        case (): {
            return 0;
        }
        case (L, _, R): {
            return 1 + max(height(L), height(R));
        }
    }
}

Keys := [5, 3, 8, 1, 4, 7, 9, 2, 6];
T    := ();
for (i := 0; i < #Keys; i := i + 1) {
    T := insert(T, Keys[i]);
}
print("T          = ", T);
print("to_list(T) = ", to_list(T));
print("height(T)  = ", height(T));
print("member(T, 6) = ", member(T, 6), ", member(T, 10) = ", member(T, 10));
