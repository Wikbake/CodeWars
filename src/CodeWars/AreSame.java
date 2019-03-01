package CodeWars;

import java.util.Arrays;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        int counter = 0;
        int[] empty = new int[] {};
        try {
            if (Arrays.equals(a, empty) & Arrays.equals(b, empty))
                return true;
            for (int i = 0; i < a.length; i++) {
                a[i] = Math.abs(a[i]);
            }
            Arrays.sort(a);
            Arrays.sort(b);
            for (int i = 0; i < a.length; i++)
                if (b[i] == a[i] * a[i])
                    if (++counter == a.length)
                        return true;
        } catch (Exception e) {
            return false;
            }
        return false;
    }
}

/*
return a != null && b != null && a.length == b.length && Arrays.equals(Arrays.stream(a).map(i -> i * i).sorted().toArray(), Arrays.stream(b).sorted().toArray());

LUB

    if ((a == null) || (b == null)){
          return false;
    }
    int[] aa = Arrays.stream(a).map(n -> n * n).toArray();
    Arrays.sort(aa);
    Arrays.sort(b);
    return (Arrays.equals(aa, b));
 */




/*
Given two arrays a and b write a function comp(a, b) (compSame(a, b) in Clojure) that checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.

Examples
Valid arrays
a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
comp(a, b) returns true because in b 121 is the square of 11, 14641 is the square of 121, 20736 the square of 144, 361 the square of 19, 25921 the square of 161, and so on. It gets obvious if we write b's elements in terms of squares:

a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]
Invalid arrays
If we change the first number to something else, comp may not return true anymore:

a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [132, 14641, 20736, 361, 25921, 361, 20736, 361]
comp(a,b) returns false because in b 132 is not the square of any number of a.

a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [121, 14641, 20736, 36100, 25921, 361, 20736, 361]
comp(a,b) returns false because in b 36100 is not the square of any number of a.

Remarks
a or b might be [] (all languages except R, Shell). a or b might be nil or null or None or nothing (except in Haskell, Elixir, C++, Rust, R, Shell).

If a or b are nil (or null or None), the problem doesn't make sense so return false.

If a or b are empty the result is evident by itself.
 */