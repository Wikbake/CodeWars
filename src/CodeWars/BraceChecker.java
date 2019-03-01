package CodeWars;

import java.util.Stack;

import java.util.Objects;

public class BraceChecker {

    public boolean isValid(String braces) {

        System.out.println(braces);
        int counter = 0;
        int stepper = 1;
        char a = '(';
        char aa = ')';
        char b = '[';
        char bb = ']';
        char c = '{';
        char cc = '}';

        if (Objects.equals(braces.charAt(0), aa) || Objects.equals(braces.charAt(0), bb) || Objects.equals(braces.charAt(0), cc))
            return false;

        for (int i = 0; i < braces.length(); i++) {

            if (Objects.equals(braces.charAt(i), a) || Objects.equals(braces.charAt(i), b) || Objects.equals(braces.charAt(i), c)) {
                counter++;
                continue;
            }

            if (Objects.equals(braces.charAt(i), aa)) {
                if (!Objects.equals(a, braces.charAt(i - stepper)))
                    return false;
                stepper += 2;
            }
            if (Objects.equals(braces.charAt(i), bb)) {
                if (!Objects.equals(b, braces.charAt(i - stepper)))
                    return false;
                stepper += 2;
            }
            if (Objects.equals(braces.charAt(i), cc)) {
                if (!Objects.equals(c, braces.charAt(i - stepper)))
                    return false;
                stepper += 2;
            }

            if (stepper == 2 * counter + 1) {
                counter = 0;
                stepper = 1;
            }

        }
        if (counter == braces.length())
            return false;

        return true;
    }


/* BEST PRACTICES

        Stack<Character> s = new Stack<>();
        for (char c : braces.toCharArray())
            if (s.size() > 0 && isClosing(s.peek(), c)) s.pop();
            else s.push(c);

        return s.size() == 0;
    }

    public boolean isClosing(char x, char c) {
        return (x == '{' && c == '}') || (x == '(' && c == ')') || (x == '[' && c == ']');
    }

    */

 /* CLEVER

     String b = braces;
    System.out.println(braces);
    for(int i=0;i<braces.length()/2;i++)
    {
      b = b.replaceAll("\\(\\)", "");
      b = b.replaceAll("\\[\\]", "");
      b = b.replaceAll("\\{\\}", "");
      if(b.length() == 0)
        return true;
    }
    return false;
  */
}



