package CodeWars;

import java.util.ArrayList;

public class Solution {

    public static boolean validatePin(String pin) {



        char[] pinAr = pin.toCharArray();
        if (pinAr.length == 4 || pinAr.length == 6) {
            for (char p : pinAr) {
                if (!Character.isDigit(p))
                    return false;
            }
            return true;
        }
        return false;
    }
    /*
     return pin.matches("//d{4}|//d{6}");        //fajny zamiennik tego co wyżej //d - cyfra, {4} - o dł. 4, | - lub

    Tutaj nie skopiowałeś zadania @up
     */

    public static int solution(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (i%3 == 0 || i%5 == 0)
                sum += i;
        }
        return sum;
        /*
        Swietne!!!
            return IntStream.range(0, number)
                    .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                    .sum();
  }
         */
/*
        for (int i = 1; i < number; i++) {
            if (i%3 == 0 || (i%5 == 0 & !multiples.contains(i)))
                multiples.add(i);
        }
        for (int d : multiples)
            sum += d;
        return sum;
*/
    }
}

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

Note: If the number is a multiple of both 3 and 5, only count it once.
 */
