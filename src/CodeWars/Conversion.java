package CodeWars;

import java.util.ArrayList;
import java.util.Collections;

public class Conversion {
  public String solution(int n) {
    ArrayList<String> digitsArr = new ArrayList<>();
    int digit = n;
    while (digit > 0) {
      digitsArr.add(String.valueOf(digit%10));
      digit /= 10;
    }
    for (int i = 0; i < digitsArr.size(); i++)
      switch (i) {
        case 0: switch (digitsArr.get(i)) {
          case "0": digitsArr.set(i, "");continue;
          case "1": digitsArr.set(i, "I"); continue;
          case "2": digitsArr.set(i, "II"); continue;
          case "3": digitsArr.set(i, "III"); continue;
          case "4": digitsArr.set(i, "IV"); continue;
          case "5": digitsArr.set(i, "V"); continue;
          case "6": digitsArr.set(i, "VI"); continue;
          case "7": digitsArr.set(i, "VII"); continue;
          case "8": digitsArr.set(i, "VIII"); continue;
          case "9": digitsArr.set(i, "IX"); continue;
        }
        case 1: switch (digitsArr.get(i)) {
          case "0": digitsArr.set(i, "");continue;
          case "1": digitsArr.set(i, "X"); continue;
          case "2": digitsArr.set(i, "XX"); continue;
          case "3": digitsArr.set(i, "XXX"); continue;
          case "4": digitsArr.set(i, "XL"); continue;
          case "5": digitsArr.set(i, "L"); continue;
          case "6": digitsArr.set(i, "LX"); continue;
          case "7": digitsArr.set(i, "LXX"); continue;
          case "8": digitsArr.set(i, "LXXX"); continue;
          case "9": digitsArr.set(i, "XC"); continue;
        }
        case 2: switch (digitsArr.get(i)) {
          case "0": digitsArr.set(i, "");continue;
          case "1": digitsArr.set(i, "C"); continue;
          case "2": digitsArr.set(i, "CC"); continue;
          case "3": digitsArr.set(i, "CCC"); continue;
          case "4": digitsArr.set(i, "CD"); continue;
          case "5": digitsArr.set(i, "D"); continue;
          case "6": digitsArr.set(i, "DC"); continue;
          case "7": digitsArr.set(i, "DCC"); continue;
          case "8": digitsArr.set(i, "DCCC"); continue;
          case "9": digitsArr.set(i, "CM"); continue;
        }
        case 3: switch (digitsArr.get(i)) {
          case "0": digitsArr.set(i, "");continue;
          case "1": digitsArr.set(i, "M"); continue;
          case "2": digitsArr.set(i, "MM"); continue;
          case "3": digitsArr.set(i, "MMM");
        }
      }
    Collections.reverse(digitsArr);
    String listString = "";
    for (String s : digitsArr)
    {
      listString += s;
    }
    return listString;
  }
}

/*
final String[] digit = {"", "I", "II", "III", "IV", "V", "VI", "VII",
                                  "VIII", "IX"};
        final String[] ten = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX",
                                  "LXXX", "XC"};
        final String[] hundred = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC",
                                  "DCCC", "CM"};
        final String[] thousand = {"", "M", "MM", "MMM"};

        String result="";
        result = thousand[n/1000] + hundred[n%1000/100] + ten[n%100/10] +
                  digit[n%10];
        return result;
 */

/*
Symbol    Value
I          1
V          5
X          10
L          50
C          100
D          500
M          1,000

1000=M, 900=CM, 90=XC; resulting in MCMXC.
2008 is written as 2000=MM, 8=VIII; or MMVIII.
1666 uses each Roman symbol in descending order: MDCLXVI.

 */

            /*
            if (i == 0) {
                if (digitsArr.get(i).equals("0"))
                    continue;
                else if (digitsArr.get(i).equals("1"))
                    digitsArr.set(i, "I");
                else if (digitsArr.get(i).equals(2))
                    digitsArr.set(i, "II");
                else if (digitsArr.get(i).equals(3))
                    digitsArr.set(i, "III");
                else if (digitsArr.get(i).equals(4))
                    digitsArr.set(i, "IV");
                else if (digitsArr.get(i).equals(5))
                    digitsArr.set(i, "V");
                else if (digitsArr.get(i).equals("6"))
                    digitsArr.set(i, "VI");
                else if (digitsArr.get(i).equals(7))
                    digitsArr.set(i, "VII");
                else if (digitsArr.get(i).equals(8))
                    digitsArr.set(i, "VIII");
                else if (digitsArr.get(i).equals(9))
                    digitsArr.set(i, "IX");
            }

            if (i == 1) {
                if (digitsArr.get(i).equals(0))
                    continue;
                else if (digitsArr.get(i).equals(1))
                    digitsArr.set(i, "X");
                else if (digitsArr.get(i).equals(2))
                    digitsArr.set(i, "XX");
                else if (digitsArr.get(i).equals(3))
                    digitsArr.set(i, "XXX");
                else if (digitsArr.get(i).equals(4))
                    digitsArr.set(i, "XL");
                else if (digitsArr.get(i).equals(5))
                    digitsArr.set(i, "L");
                else if (digitsArr.get(i).equals(6))
                    digitsArr.set(i, "LX");
                else if (digitsArr.get(i).equals(7))
                    digitsArr.set(i, "LXX");
                else if (digitsArr.get(i).equals(8))
                    digitsArr.set(i, "LXXX");
                else if (digitsArr.get(i).equals(9))
                    digitsArr.set(i, "XC");
            }
            if (i == 2) {
                if (digitsArr.get(i).equals(0))
                    continue;
                else if (digitsArr.get(i).equals(1))
                    digitsArr.set(i, "C");
                else if (digitsArr.get(i).equals(2))
                    digitsArr.set(i, "CC");
                else if (digitsArr.get(i).equals(3))
                    digitsArr.set(i, "CCC");
                else if (digitsArr.get(i).equals(4))
                    digitsArr.set(i, "CD");
                else if (digitsArr.get(i).equals(5))
                    digitsArr.set(i, "D");
                else if (digitsArr.get(i).equals(6))
                    digitsArr.set(i, "DC");
                else if (digitsArr.get(i).equals(7))
                    digitsArr.set(i, "DCC");
                else if (digitsArr.get(i).equals(8))
                    digitsArr.set(i, "DCCC");
                else if (digitsArr.get(i).equals(9))
                    digitsArr.set(i, "CM");
            }
            if (i == 3) {
                if (digitsArr.get(i).equals(0))
                    continue;
                else if (digitsArr.get(i).equals(1))
                    digitsArr.set(i, "M");
                else if (digitsArr.get(i).equals(2))
                    digitsArr.set(i, "MM");
                else if (digitsArr.get(i).equals(3))
                    digitsArr.set(i, "MMM");
                else if (digitsArr.get(i).equals(4))
                    digitsArr.set(i, "CD");
                else if (digitsArr.get(i).equals(5))
                    digitsArr.set(i, "D");
                else if (digitsArr.get(i).equals(6))
                    digitsArr.set(i, "DC");
                else if (digitsArr.get(i).equals(7))
                    digitsArr.set(i, "DCC");
                else if (digitsArr.get(i).equals(8))
                    digitsArr.set(i, "DCCC");
                else if (digitsArr.get(i).equals(9))
                    digitsArr.set(i, "CM");
            }
            */
