package CodeWars;

import java.util.Arrays;

public class Xbonacci {
  public static double[] tribonacci(double[] s, int n) {
    System.out.println(Arrays.toString(s));
    double[] result = new double[n];

    if (n == 0)
      return result;
    else if (n == 1) {
      result[0] = s[0];
      return result;
    } else if (n == 2) {
      result[0] = s[0];
      result[1] = s[1];
      return result;
    }
    System.arraycopy(s, 0, result, 0, 3);
    for (int i = 3; i < n; i++)
      result[i] =  result[i - 1] + result[i - 2] + result[i - 3];
    return result;
  }
}

/*    BEST PRACTISES
      double[] tritab=Arrays.copyOf(s, n);
      for(int i=3;i<n;i++){
        tritab[i]=tritab[i-1]+tritab[i-2]+tritab[i-3];
      }
      return tritab;
 */

/*    CLEVER
      double[] r = new double[n];
      for(int i = 0; i < n; i++){
        r[i] = (i<3)?s[i]:r[i-3]+r[i-2]+r[i-1];
      }
      return r;
 */

/*    ZADANIE
Well met with Fibonacci bigger brother, AKA Tribonacci.

As the name may already reveal, it works basically like a Fibonacci, but summing the last 3 (instead of 2) numbers of the sequence to generate the next. And, worse part of it, regrettably I won't get to hear non-native Italian speakers trying to pronounce it :(

So, if we are to start our Tribonacci sequence with [1, 1, 1] as a starting input (AKA signature), we have this sequence:

[1, 1 ,1, 3, 5, 9, 17, 31, ...]
But what if we started with [0, 0, 1] as a signature? As starting with [0, 1] instead of [1, 1] basically shifts the common Fibonacci sequence by once place, you may be tempted to think that we would get the same sequence shifted by 2 places, but that is not the case and we would get:

[0, 0, 1, 1, 2, 4, 7, 13, 24, ...]
Well, you may have guessed it by now, but to be clear: you need to create a fibonacci function that given a signature array/list, returns the first n elements - signature included of the so seeded sequence.

Signature will always contain 3 numbers; n will always be a non-negative number; if n == 0, then return an empty array and be ready for anything else which is not clearly specified ;)
 */









    /*    W zadaniu było że tablica zawsze 3 elementowa więc zbędne
    switch (s.length) {
      case 0:
        return result;
      case 1:
        result[0] = s[0];
        result[1] = result[0];
        result[2] = result[1] + result[0];
        for (int i = 3; i < n; i++)
          result[i] =  result[i - 1] + result[i - 2] + result[i - 3];
        return result;
      case 2:
        System.arraycopy(s, 0, result, 0, 2);
        result[2] = result[1] + result[0];
        for (int i = 3; i < n; i++)
          result[i] =  result[i - 1] + result[i - 2] + result[i - 3];
        return result;
    }
    */