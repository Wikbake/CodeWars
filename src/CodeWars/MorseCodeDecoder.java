package CodeWars;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        String[] words = morseCode.trim().split("   ");
        String[][] letters = new String[words.length][];
        String result = "";
        for (int i = 0; i < words.length; i++)
            letters[i] = words[i].split(" ");
        for(int i=0; i< letters.length; i++){
            for(int j=0; j< letters[i].length; j++) {
                result += letters[i][j];
                //result += MorseCode.get(letter);
            }
        result += " ";

        }
        return result.trim();
    }
}


        /*
        String result = "";
        for(String word : morseCode.trim().split("   ")) {
            for(String letter : word.split("\\s+")) {
            result += MorseCode.get(letter);
        }
        result += ' ';
        }
        return result.trim();
         */

        /*
         return Arrays.stream(morseCode.split("   "))
                  .map(i -> Arrays.stream(i.split(" "))
                                  .map(l -> MorseCode.get(l))
                                  .filter(l -> l != null)
                                  .collect(Collectors.joining()))
                  .collect(Collectors.joining(" "))
                  .trim();
         */


        /*
        ArrayList<String[]> letters = new ArrayList<>();
        for (String lett : words)
            letters.add(lett.split(" "));
        for (String[] letter : letters)
            System.out.println(Arrays.toString(letter));
        */

        /*
        In this kata you have to write a simple Morse code decoder. While the Morse code is now mostly superceded by voice and digital data communication channels, it still has its use in some applications around the world.
The Morse code encodes every character as a sequence of "dots" and "dashes". For example, the letter A is coded as ·−, letter Q is coded as −−·−, and digit 1 is coded as ·−−−−. The Morse code is case-insensitive, traditionally capital letters are used. When the message is written in Morse code, a single space is used to separate the character codes and 3 spaces are used to separate words. For example, the message HEY JUDE in Morse code is ···· · −·−−   ·−−− ··− −·· ·.

NOTE: Extra spaces before or after the code have no meaning and should be ignored.

In addition to letters, digits and some punctuation, there are some special service codes, the most notorious of those is the international distress signal SOS (that was first issued by Titanic), that is coded as ···−−−···. These special codes are treated as single special characters, and usually are transmitted as separate words.

Your task is to implement a function that would take the morse code as input and return a decoded human-readable string.

For example:

MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .")
//should return "HEY JUDE"
NOTE: For coding purposes you have to use ASCII characters . and -, not Unicode characters.

The Morse code table is preloaded for you as a dictionary, feel free to use it:

Coffeescript/C++/Go/JavaScript/PHP/Python/Ruby/TypeScript: MORSE_CODE['.--']
C#: MorseCode.Get(".--") (returns string)
Elixir: morse_codes variable
Elm: MorseCodes.get : Dict String String
Haskell: morseCodes ! ".--" (Codes are in a Map String String)
Java: MorseCode.get(".--")
Kotlin: MorseCode[".--"] ?: "" or MorseCode.getOrDefault(".--", "")
Rust: self.morse_code
Scala: morseCodes(".--")
All the test strings would contain valid Morse code, so you may skip checking for errors and exceptions. In C#, tests will fail if the solution code throws an exception, please keep that in mind. This is mostly because otherwise the engine would simply ignore the tests, resulting in a "valid" solution.

Good luck!

After you complete this kata, you may try yourself at Decode the Morse code, advanced.
         */