import java.util.Arrays;

public class AnagramString {
    public static boolean Anagram_String(String str1, String str2) {

        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        if (charArr1.length == charArr2.length) {
            Arrays.sort(charArr1);
            Arrays.sort(charArr2);

            if (String.valueOf(charArr1).equals(String.valueOf(charArr2)))
                return true;

        }
        return false;

    }

    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";
        System.out.println(Anagram_String(s1, s2));
    }
}
