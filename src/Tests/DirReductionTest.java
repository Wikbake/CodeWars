package Tests;

import CodeWars.DirReduction;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;


class DirReductionTest {
  @Test
  public void testSimpleDirReduc() {
    assertArrayEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
            new String[]{"WEST"},
            DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
    assertArrayEquals("\"NORTH\",\"SOUTH\",\"SOUTH\",\"EAST\",\"WEST\",\"NORTH\"",
            new String[]{},
            DirReduction.dirReduc(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"}));
  }
}