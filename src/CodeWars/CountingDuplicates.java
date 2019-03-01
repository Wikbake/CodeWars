package CodeWars;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        char[] textAr = text.toLowerCase().toCharArray();
        int counterDuplicates = 0;
        for (char c : textAr) {
            String textShort = text.toLowerCase().replace(Character.toString(c), "");
            if (textShort.length() < text.length()-1)
                counterDuplicates ++;
            text = textShort;
            textAr = textShort.toCharArray();
        }
        System.out.println(counterDuplicates);
        return counterDuplicates;


    }
}

/*
    Set<String> count = new HashSet<>();

    for (String string : text.toLowerCase().split("")) {
      if (text.toLowerCase().indexOf(string) != text.toLowerCase().lastIndexOf(string)) count.add(string);
    }

    return count.size();
 */

/*
      HashMap<Character, Integer> map = new HashMap<>();
        for (char c : text.toLowerCase().toCharArray()) {
            map.put(c, map.containsKey(c) ? 1 : 0);
        }
      return (int) map.values().stream().filter(e -> e > 0).count();
    }
 */

/*
Count the number of Duplicates
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice
 */