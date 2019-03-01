package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;

public class DirReduction {
  public static String[] dirReduc(String[] arr) {
    System.out.println(Arrays.toString(arr));
    ArrayList<String> sec = new ArrayList<>();
    int i = 0;
    for (String s : arr)
      sec.add(s);
    while (true) {
      if (i == sec.size() - 1)
        break;
      else if (sec.isEmpty())
        return new String[]{};
      if (sec.get(i).equals("NORTH"))
        if (sec.get(i + 1).equals("SOUTH")) {
          sec.remove(i);
          sec.remove(i);
          i = 0;
          continue;
        }
      if (sec.get(i).equals("SOUTH"))
        if (sec.get(i + 1).equals("NORTH")) {
          sec.remove(i);
          sec.remove(i);
          i = 0;
          continue;
        }
      if (sec.get(i).equals("EAST"))
        if (sec.get(i + 1).equals("WEST")) {
          sec.remove(i);
          sec.remove(i);
          i = 0;
          continue;
        }
      if (sec.get(i).equals("WEST"))
        if (sec.get(i + 1).equals("EAST")) {
          sec.remove(i);
          sec.remove(i);
          i = 0;
          continue;
        }
      i++;
    }
    String[] result = new String[sec.size()];
    for (int j = 0; j < sec.size(); j++)
      result[j] = sec.get(j);
    return result;
  }
}


/*    BEST PRACTICES + CLEVER
        final Stack<String> stack = new Stack<>();

        for (final String direction : arr) {
            final String lastElement = stack.size() > 0 ? stack.lastElement() : null;

            switch(direction) {
                case "NORTH": if ("SOUTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "SOUTH": if ("NORTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "EAST":  if ("WEST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "WEST":  if ("EAST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
            }
        }
        return stack.stream().toArray(String[]::new);
 */
/*    FAJNE
    public static final String NORTH_SOUTH = "NORTH SOUTH ";
    public static final String WEST_EAST = "WEST EAST ";
    public static final String SOUTH_NORTH = "SOUTH NORTH ";
    public static final String EAST_WEST = "EAST WEST ";
    public static String[] dirReduc(String[] arr) {
        String s = "";
        for (String string: arr) s += string + " ";
        for (int i = 0; i < arr.length; i++){
          s = s.contains(NORTH_SOUTH) ? s.replace(NORTH_SOUTH, "") : s;
          s = s.contains(WEST_EAST)   ? s.replace(WEST_EAST, "")   : s;
          s = s.contains(SOUTH_NORTH) ? s.replace(SOUTH_NORTH, "") : s;
          s = s.contains(EAST_WEST)   ? s.replace(EAST_WEST, "")   : s;
        }
        return s.isEmpty() ? new String[] {} : s.split(" ");
 */


      /*
      if (copyArr[i].equals("NORTH"))
        if (copyArr[i + 1].equals("SOUTH")) {
          copyArr[i] = "";
          copyArr[i + 1] = "";
        }
      if (copyArr[i].equals("SOUTH"))
        if (copyArr[i + 1].equals("NORTH")) {
          copyArr[i] = "";
          copyArr[i + 1] = "";
        }
      if (copyArr[i].equals("EAST"))
        if (copyArr[i + 1].equals("WEST")) {
          copyArr[i] = "";
          copyArr[i + 1] = "";
        }
      if (copyArr[i].equals("WEST"))
        if (copyArr[i + 1].equals("EAST")) {
          copyArr[i] = "";
          copyArr[i + 1] = "";
        }
        */
//}
//System.out.println(Arrays.toString(copyArr));