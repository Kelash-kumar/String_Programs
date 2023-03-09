
public class CapitalizedEachWordString {
 
public static void CapitalizedEach_WordString(String str){
    
String[] strArr=str.split(" ");
StringBuffer sb=new StringBuffer();
for(int i=0;i<strArr.length;i++){
    char firstCharacter= Character.toUpperCase(strArr[i].charAt(0));
  strArr[i]=strArr[i].replace(strArr[i].charAt(0), firstCharacter);
  sb.append(strArr[i]+" ");
    
}

System.out.println(sb);
}

    public static void main(String[] args) {
     String s="aelash eumar";
     System.out.println(s);
     CapitalizedEach_WordString(s);
    
    }
}
