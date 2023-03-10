
import java.util.*;

public class RemoveDulicateCharacter {
    
 public static String RemoveDulicateCharacterInString(String str) {
 
    LinkedHashSet<Character> charcString=new LinkedHashSet<>();
    for(int i=0;i<str.length();i++){
    charcString.add(str.charAt(i));
    }

   return charcString.toString();
 }
    public static void main(String[] args) {
        System.out.println(RemoveDulicateCharacterInString("hello"));
    }
}
