package CodeWars;

import java.util.Locale;

public class XO{

    public static boolean getXO (String str) {

        char[] strAr = str.toLowerCase(Locale.ROOT).toCharArray();
        int counterX = 0, counterO = 0;
        for (char c : strAr)
        {
            counterX += (c == 'x') ? 1 : 0;
            counterO += (c == 'o') ? 1 : 0;
        }
        return counterX == counterO;

        /*  fajna dużo krótsza wersja
        return str.toLowerCase().replace("x", "").length() == str.toLowerCase().replace("o", "").length();
        */

    }
}

/*
public class SolutionTest {
    @Test
    public void testSomething1() {
      assertEquals(true, XO.getXO("xxxooo"));
    }

    @Test
    public void testSomething2() {
      assertEquals(true, XO.getXO("xxxXooOo"));
    }

    @Test
    public void testSomething3() {
      assertEquals(false, XO.getXO("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void testSomething4() {
      assertEquals(false, XO.getXO("xXxxoewrcoOoo"));
    }

    @Test
    public void testSomething5() {
      assertEquals(false, XO.getXO("XxxxooO"));
    }

    @Test
    public void testSomething6() {
      assertEquals(true, XO.getXO("zssddd"));
    }

    @Test
    public void testSomething7() {
      assertEquals(false, XO.getXO("Xxxxertr34"));
    }
}
 */