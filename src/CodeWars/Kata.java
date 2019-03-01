package CodeWars;

import java.math.BigInteger;

import java.util.Arrays;


public class Kata {
    public static int findEvenIndex(int[] arr) {
        int setLeft = 0, setRight = 0, index = 0;

        if (Arrays.stream(arr, 1, arr.length).sum() != 0) {
            int i = 0;
            while (i < arr.length) {
                setRight += Arrays.stream(arr, i + 1, arr.length).sum();
                index = i;
                if (setLeft == setRight)
                    return index;
                setLeft += arr[i];
                setRight = 0;
                i++;
            }
        }
        return -1;
    }

    /*
BRAK
     */

    public static String factorial(int n) {
        if (n < 0)
            return null;
        else if (n == 0)
            return "0";
        BigInteger resultInt = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            resultInt = resultInt.multiply(BigInteger.valueOf(i));
        }
        return String.valueOf(resultInt);
    }

    /*
In mathematics, the factorial of integer n is written as n!. It is equal to the product of n and every integer preceding it. For example: 5! = 1 x 2 x 3 x 4 x 5 = 120

Your mission is simple: write a function that takes an integer n and returns the value of n!.

You are guaranteed an integer argument. For any values outside the non-negative range, return null, nil or None (return an empty string "" in C and C++). For non-negative numbers a full length number is expected for example, return 25! = "15511210043330985984000000" as a string.
 */


    public static String encrypt(final String text, final int n) {
        String firstText, secText;
        String result = "";
        String resText = text;
        if (n <= 0)
            return text;
        else if (text == null)
            return null;
        for (int i = 0; i < n; i++) {
            firstText = "";
            secText = "";
            for (int j = 1; j < text.length(); j += 2)
                firstText += resText.charAt(j);
            for (int j = 0; j < text.length(); j += 2)
                secText += resText.charAt(j);
            result = firstText + secText;
            resText = result;
        }
        return result;
    }

    public static String decrypt(final String encryptedText, final int n) {
        String firstText, secText;
        String result = "";
        String resText = encryptedText;
        if (n <= 0)
            return encryptedText;
        else if (encryptedText == null)
            return null;
        for (int i = 0; i < n; i++) {
            firstText = "";
            secText = "";
            result = "";
            for (int j = 0; j < encryptedText.length()/2; j++)
                firstText += resText.charAt(j);
            for (int j = encryptedText.length()/2; j < encryptedText.length(); j++)
                secText += resText.charAt(j);
            for (int k = 0; k < encryptedText.length()/2 + 1; k++) {
                if (k < secText.length())
                    result += secText.charAt(k);
                if (k < firstText.length())
                    result += firstText.charAt(k);
            }
            resText = result;
        }
        return result;
    }


    /*
        if(text == null || n < 1) return text;
    String first = IntStream.range(0, text.length())
                            .filter(i -> i%2 == 1)
                            .mapToObj(i -> text.charAt(i))
                            .map(Object::toString)
                            .collect(Collectors.joining(""));
    String second = IntStream.range(0, text.length())
                              .filter(i -> i%2 == 0)
                              .mapToObj(i -> text.charAt(i))
                              .map(Object::toString)
                              .collect(Collectors.joining(""));
    return encrypt(first + second, n - 1);
}


  public static String decrypt(final String text, final int n) {
    if(text == null || n < 1) return text;
    String decrypted = IntStream.range(0, text.length())
                              .mapToObj(i -> (i%2 == 1) ? text.charAt(i/2) : text.charAt(text.length()/2 + i/2))
                              .map(Object::toString)
                              .collect(Collectors.joining(""));
   return decrypt(decrypted, n - 1);
     */

    /*
    For building the encrypted string:
    Take every 2nd char from the string, then the other chars, that are not every 2nd char, and concat them as new String.
    Do this n times!

    Examples:

    "This is a test!", 1 -> "hsi  etTi sats!"
    "This is a test!", 2 -> "hsi  etTi sats!" -> "s eT ashi tist!"
    Write two methods:

    String encrypt(final String text, final int n)
    String decrypt(final String encryptedText, final int n)
    For both methods:
    If the input-string is null or empty return exactly this value!
    If n is <= 0 then return the input text.
     */





}

