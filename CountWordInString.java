public class CountWordInString {

    public static int CountWordsInString(String s) {
        String[] str = s.split(" ");
        return str.length;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(CountWordsInString(str));
    }
}
