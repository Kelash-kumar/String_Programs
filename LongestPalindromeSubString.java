public class LongestPalindromeSubString {
    public static String longestPalindromicSubstring(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int maxLength = 1;
        int start = 0;
    
        // Initialize dp for substrings of length 1 and 2
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        for (int i = 0; i < n-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                dp[i][i+1] = true;
                start = i;
                maxLength = 2;
            }
        }
    
        // Check substrings of length 3 and greater
        for (int k = 3; k <= n; k++) {
            for (int i = 0; i < n-k+1; i++) {
                int j = i+k-1;
                if (s.charAt(i) == s.charAt(j) && dp[i+1][j-1]) {
                    dp[i][j] = true;
                    if (k > maxLength) {
                        maxLength = k;
                        start = i;
                    }
                }
            }
        }
    
        return s.substring(start, start+maxLength);
    }
    public static void main(String[] args) {
      
        System.out.println(  longestPalindromicSubstring("abcmomapapalor"));
    }
}
