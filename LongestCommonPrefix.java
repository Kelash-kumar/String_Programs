import java.util.Arrays;

 public class LongestCommonPrefix {
//     //way 1
//     public static String longestCommonPrefix(String str) {
//            String[] strArr=str.split(" ");
           
//            if(strArr==null || strArr.length==0 )return "";
           
//            String prefix = strArr[0];
//            for (int i = 1; i < strArr.length; i++) {
//                while (strArr[i].indexOf(prefix) != 0) {
//                 prefix = prefix.substring(0, prefix.length() - 1);
//                 if (prefix.isEmpty()) {
//                     return "";
//                 }
//             }
//         }
//         return prefix;
//     }
//way 2

public static String longest_Common_Prefix(String str) {
    String[] strArr=str.split(" ");
    Arrays.sort(strArr);
    StringBuffer prefix=new StringBuffer();
    char[] firstString=strArr[0].toCharArray();
    char[] secondString=strArr[strArr.length-1].toCharArray();
    
    for (int i = 0; i < firstString.length; i++) {
      if(firstString[i]!=secondString[i])break;
      prefix.append(firstString[i]);
     }
 
 return prefix.toString();
}



 // way  1
    public static String longestCommonSuffix(String str) {
        String[] strs=str.split(" ");
        if (strs == null || strs.length == 0) {
            return "";
        }
        String suffix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].endsWith(suffix)) {
                suffix = suffix.substring(1);
                if (suffix.isEmpty()) {
                    return "";
                }
            }
        }
        return suffix;
    }

    //way 2:
    //incomplete task 
public static String longest_Common_sufix(String str) {
    String[] strArr=str.split(" ");
    Arrays.sort(strArr);
    StringBuffer  sufix=new StringBuffer();
    char[] firstString=strArr[0].toCharArray();
    char[] secondString=strArr[strArr.length-1].toCharArray();
    
    for (int i = firstString.length-1; i >=0; i--) {
      if(firstString[i]!=secondString[i])break;
      sufix.append(firstString[i]);
     }
 
 return sufix.toString();
}
    
    public static void main(String[] args) {
        
        String str="flowerly flowly flowerly";
      
        System.out.println(longest_Common_Prefix(str));
        System.out.println(longest_Common_sufix(str));

        // String LongestCommonPrefix=longestCommonPrefix(str);
        // String LongestCommonSuffix=longestCommonSuffix(str);
        // System.out.println(LongestCommonPrefix);
        // System.out.println(LongestCommonSuffix);
    }
}
