public class palindromeString {
    public static boolean IsPalindrome_String(String str){

        String s=new StringBuilder(str).reverse().toString();
     
        if(s.equals(str))return true;

        return false;

    }

    public static void main(String[] args) {
        
        String str="mamam";
System.out.println(IsPalindrome_String(str));
    }
}
