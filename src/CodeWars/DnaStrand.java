package CodeWars;

public class DnaStrand {

    public static String makeComplement(String str)
    {
        char[] stre = str.toCharArray();
        for (int i = 0; i < stre.length; i++)
            switch (str.charAt(i)) {
                case 'A': stre[i] = 'T';
                continue;
                case 'T': stre[i] = 'A';
                continue;
                case 'G': stre[i] = 'C';
                continue;
                case 'C': stre[i] = 'G';
            }
        return String.copyValueOf(stre);
    }
}
