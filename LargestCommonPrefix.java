public class LargestCommonPrefix {


    void peciseNumber(double aa,double bb){
        double a = aa;
        double b = bb;
        double result = a / b;
        System.out.format("%.3f\n", result);
    }

    static String commonPrefixUtil(String str1, String str2) {
        String result = "";
        int n1 = str1.length(), 
        n2 = str2.length();
 
        // Compare str1 and str2
        for (int i = 0, j = 0; i <= n1 - 1 && j <= n2 - 1; i++, j++) {
            if (str1.charAt(i) != str2.charAt(j)) {
                break;
            }
            result += str1.charAt(i);
        }
 
        return (result);
    }
 
// A Function that returns the longest common prefix
// from the array of strings
    static String commonPrefix(String arr[], int n) {
        String prefix = arr[0];
 
        for (int i = 1; i <= n - 1; i++) {
            prefix = commonPrefixUtil(prefix, arr[i]);
        }
 
        return (prefix);
    }

    public static void main(String[] args) {
        
    }
}
