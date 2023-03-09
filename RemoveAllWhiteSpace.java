public class RemoveAllWhiteSpace {
   
    public static String RemoveAllWhiteSpaceString(String str) {
        
       return str.replaceAll(" ", "");
    }
   
    public static void main(String[] args) {
    
        String str="Hello World";
        System.out.println( RemoveAllWhiteSpaceString(str));
   } 
}
