package Tests;

import CodeWars.BraceChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BraceCheckerTest {

  private BraceChecker checker = new BraceChecker();

  @Test
  public void testValid() {
    assertTrue(checker.isValid("()"));
  }

  @Test
  public void testInvalid() {
    assertFalse(checker.isValid("[(])"));
  }
}