public class LongestCommonPrefix {
    
    public static String longestCommonPrefix(String str) {
           String[] strArr=str.split(" ");

        if(strArr==null || strArr.length==0 )return "";

        String prefix = strArr[0];
        for (int i = 1; i < strArr.length; i++) {
            while (strArr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
    
    public static void main(String[] args) {
        
        String str="flower flow flight";
        String LongestCommonPrefix=longestCommonPrefix(str);
        System.out.println(LongestCommonPrefix);
    }
}
