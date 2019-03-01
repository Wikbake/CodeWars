package CodeWars;

import java.util.Arrays;

public class JadenCase {
    public String toJadenCase (String phrase)
    {


        //phrChars[1] = phrChars[1].substring(0, 1).toUpperCase() + phrChars[1].substring(1).toLowerCase();
        //System.out.println(phrChars[0] + phrChars[1] + phrChars[2]+ phrChars[3]);
        if (phrase == null || phrase.equals(""))
            return null;
        else {
            String[] phrChars = phrase.split(" ");
            Arrays.setAll(phrChars, i -> phrChars[i].substring(0, 1).toUpperCase() + phrChars[i].substring(1).toLowerCase());
            String result = String.join(" ", phrChars);
            return result;
        }
    }
}
