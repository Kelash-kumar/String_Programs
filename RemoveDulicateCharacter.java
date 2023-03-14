
import java.util.*;

public class RemoveDulicateCharacter {
    
 public static String RemoveDulicateCharacterInString(String str) {
 
    LinkedHashSet<Character> charcString=new LinkedHashSet<>();
    for(int i=0;i<str.length();i++){
    charcString.add(str.charAt(i));
    }

   return charcString.toString();
 }

 //method two 
 public static String RemoveDulicateCharacterString(String str) {
boolean[] flag=new boolean[256];
StringBuffer sb=new StringBuffer();
for(int i=0;i<str.length();i++){
    char c=str.charAt(i);
    if(!flag[c]){
        sb.append(c);
        flag[c]=true;
    }
}
return sb.toString();
 }
    public static void main(String[] args) {
        System.out.println(RemoveDulicateCharacterInString("hello world"));
System.out.println(RemoveDulicateCharacterString("hello world"));
    }
}
