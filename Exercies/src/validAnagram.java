import java.util.Arrays;

public class validAnagram {
    public static void main(String[] args) {
        String s= "anagram";
        String t= "nagrama";
        System.out.println(isAnagram(s, t));
    }
    static boolean isAnagram(String s, String t){
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
    }
}
