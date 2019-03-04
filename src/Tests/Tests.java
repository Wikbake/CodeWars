package Tests;

import static org.junit.jupiter.api.Assertions.*;
import CodeWars.*;
import org.junit.jupiter.api.Test;

/*

public class WeightSortTest {
  @Test
  public void basicTests() {
    System.out.println("****** Basic Tests ******");
    assertEquals("2000 103 123 4444 99", WeightSort.orderWeight("103 123 4444 99 2000"));
    assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999", WeightSort.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
  }

}
*/

class CountingDuplicatesTest {
  @Test
  public void abcdeReturnsZero() {
    assertEquals(0, CountingDuplicates.duplicateCount("abcde"));
  }

  @Test
  public void abcdeaReturnsOne() {
    assertEquals(1, CountingDuplicates.duplicateCount("abcdea"));
  }

  @Test
  public void indivisibilityReturnsOne() {
    assertEquals(1, CountingDuplicates.duplicateCount("indivisibility"));
  }

  @Test
  public void reallyLongStringContainingDuplicatesReturnsThree() {
    String testThousandA = new String(new char[1000]).replace('\0', 'a');
    String testHundredB = new String(new char[100]).replace('\0', 'b');
    String testTenC = new String(new char[10]).replace('\0', 'c');
    String test1CapitalA = new String(new char[1]).replace('\0', 'A');
    String test1d = new String(new char[1]).replace('\0', 'd');
    String test = test1d + test1CapitalA + testTenC +
            testHundredB + testThousandA;


    assertEquals(3, CountingDuplicates.duplicateCount(test));
  }
}

class ConversionTest {
  private Conversion conversion = new Conversion();
  @Test
  public void shouldConvertToRoman() {
    assertEquals("I", conversion.solution(1), "solution(1) should equal to I");
    assertEquals("IV", conversion.solution(4), "solution(4) should equal to IV");
    assertEquals("VI", conversion.solution(6), "solution(6) should equal to VI");
  }
}

class KataTest {
  @Test
  public void test() {
    assertEquals(3,Kata.findEvenIndex(new int[] {1,2,3,4,3,2,1}));
    assertEquals(1,Kata.findEvenIndex(new int[] {1,100,50,-51,1,1}));
    assertEquals(-1,Kata.findEvenIndex(new int[] {1,2,3,4,5,6}));
    assertEquals(3,Kata.findEvenIndex(new int[] {20,10,30,10,10,15,35}));
    assertEquals(-1,Kata.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
    assertEquals(1,Kata.findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
    assertEquals(6,Kata.findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
  }

  //--------------------------------------------------------------

  @Test
  public void BasicTests()
  {
    assertEquals("1", Kata.factorial(1));
    assertEquals("120", Kata.factorial(5));
    assertEquals("362880", Kata.factorial(9));
    assertEquals("1307674368000", Kata.factorial(15));
  }

  //----------------------------------------------------------------

  @Test
  public void testEncrypt() {
    assertEquals("This is a test!", Kata.encrypt("This is a test!", 0));
    assertEquals("hsi  etTi sats!", Kata.encrypt("This is a test!", 1));
    assertEquals("s eT ashi tist!", Kata.encrypt("This is a test!", 2));
    assertEquals(" Tah itse sits!", Kata.encrypt("This is a test!", 3));
    assertEquals("This is a test!", Kata.encrypt("This is a test!", 4));
    assertEquals("This is a test!", Kata.encrypt("This is a test!", -1));
    assertEquals("hskt svr neetn!Ti aai eyitrsig", Kata.encrypt("This kata is very interesting!", 1));
  }

  @Test
  public void testDecrypt() {
    assertEquals("This is a test!", Kata.decrypt("This is a test!", 0));
    assertEquals("This is a test!", Kata.decrypt("hsi  etTi sats!", 1));
    assertEquals("This is a test!", Kata.decrypt("s eT ashi tist!", 2));
    assertEquals("This is a test!", Kata.decrypt(" Tah itse sits!", 3));
    assertEquals("This is a test!", Kata.decrypt("This is a test!", 4));
    assertEquals("This is a test!", Kata.decrypt("This is a test!", -1));
    assertEquals("This kata is very interesting!", Kata.decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
  }

  @Test
  public void testNullOrEmpty() {
    assertEquals("", Kata.encrypt("", 0));
    assertEquals("", Kata.decrypt("", 0));
    assertNull(Kata.encrypt(null, 0));
    assertNull(Kata.decrypt(null, 0));
  }

}


class XOTest {
  @Test
  public void testSomething1() {
    assertTrue(XO.getXO("xxxooo"));
  }

  @Test
  public void testSomething2() {
    assertTrue(XO.getXO("xxxXooOo"));
  }

  @Test
  public void testSomething3() {
    assertFalse(XO.getXO("xxx23424esdsfvxXXOOooo"));
  }

  @Test
  public void testSomething4() {
    assertFalse(XO.getXO("xXxxoewrcoOoo"));
  }

  @Test
  public void testSomething5() {
    assertFalse(XO.getXO("XxxxooO"));
  }

  @Test
  public void testSomething6() {
    assertTrue(XO.getXO("zssddd"));
  }

  @Test
  public void testSomething7() {
    assertFalse(XO.getXO("Xxxxertr34"));
  }
}


class JadenCaseTest {
  JadenCase jadenCase = new JadenCase();

  @Test
  public void test() {
    assertEquals("Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"), "toJadenCase doesn't return a valide JadenCase String! try again please :)");
  }

  @Test
  public void testNullArg() {
    assertNull(jadenCase.toJadenCase(null), "Must return null when the arg is null");
  }

  @Test
  public void testEmptyArg() {
    assertNull(jadenCase.toJadenCase(""), "Must return null when the arg is empty string");
  }
}

class SolutionTest {
  @Test
  public void validPins() {
    assertTrue(Solution.validatePin("1234"));
    assertTrue(Solution.validatePin("0000"));
    assertTrue(Solution.validatePin("1111"));
    assertTrue(Solution.validatePin("123456"));
    assertTrue(Solution.validatePin("098765"));
    assertTrue(Solution.validatePin("000000"));
    assertTrue(Solution.validatePin("090909"));
  }

  @Test
  public void nonDigitCharacters() {
    assertFalse(Solution.validatePin("a234"));
    assertFalse(Solution.validatePin(".234"));
  }

  @Test
  public void invalidLengths() {
    assertFalse(Solution.validatePin("1"));
    assertFalse(Solution.validatePin("12"));
    assertFalse(Solution.validatePin("123"));
    assertFalse(Solution.validatePin("12345"));
    assertFalse(Solution.validatePin("1234567"));
    assertFalse(Solution.validatePin("-1234"));
    assertFalse(Solution.validatePin("1.234"));
    assertFalse(Solution.validatePin("00000000"));
  }

//--------------------------------------------------------------------------------------------

  @Test
  public void test() {
    assertEquals(23, new Solution().solution(10));
  }

}

class DnaStrandTest {
  @Test
  public void test01() {
    assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
  }
  @Test
  public void test02() {
    assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
  }
  @Test
  public void test03() {
    assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
  }
}

class VowelsTest {
  @Test
  public void testCase1() {
    assertEquals(5, Vowels.getCount("abracadabra"), "Nope!");
  }
}
