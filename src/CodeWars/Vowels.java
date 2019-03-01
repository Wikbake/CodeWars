package CodeWars;

import org.jetbrains.annotations.NotNull;

public class Vowels {

    public static int getCount(@NotNull String str) {

        int vowelsCount = 0;
        /*
        for (int i = 0; i < str.length(); i++)
            if (Objects.equals(str.charAt(i), 'a') || Objects.equals(str.charAt(i), 'e') ||
                    Objects.equals(str.charAt(i), 'i') || Objects.equals(str.charAt(i), 'o') ||
                    Objects.equals(str.charAt(i), 'u'))
                vowelsCount++;
        return vowelsCount;
        */
        for (char c : str.toCharArray())
            vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
        return vowelsCount;
    }

}
