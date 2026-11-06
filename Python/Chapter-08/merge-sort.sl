// Sorting a list with merge sort.

// Split the list L into a pair of two lists whose lengths differ by at most one.
function split(L) {
    match (L) {
        case []: {
            return ([], []);
        }
        case [x]: {
            return ([x], []);
        }
        case [x, y | R]: {
            match (split(R)) {
                case (A, B): {
                    return ([x] + A, [y] + B);
                }
            }
        }
    }
}

// Merge the sorted lists L1 and L2 into one sorted list.
function merge(L1, L2) {
    match (L1, L2) {
        case ([], _): {
            return L2;
        }
        case (_, []): {
            return L1;
        }
        case ([x | R1], [y | R2]) if x <= y: {
            return [x] + merge(R1, L2);
        }
        case (_, [y | R2]): {
            return [y] + merge(L1, R2);
        }
    }
}

function sort(L) {
    if (#L < 2) {
        return L;
    }
    match (split(L)) {
        case (A, B): {
            return merge(sort(A), sort(B));
        }
    }
}

L := [31, 41, 59, 26, 53, 58, 97, 93, 23, 84, 62, 64, 33, 83, 27, 95];
print("L       = ", L);
print("sort(L) = ", sort(L));
