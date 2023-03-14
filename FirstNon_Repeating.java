public class FirstNon_Repeating {
    
    public char findFirstNonRepeatingChar(String s) {
        int[] charCounts = new int[26]; // assume lowercase English alphabet only
        
        // count the occurrence of each character
        for (char c : s.toCharArray()) {
            charCounts[c - 'a']++;
        }
        
        // find the first character with count 1
        for (char c : s.toCharArray()) {
            if (charCounts[c - 'a'] == 1) {
                return c;
            }
        }
        
        // no non-repeating characters found
        return '\0';
    }

    public static void main(String[] args) {
        
    }
}
