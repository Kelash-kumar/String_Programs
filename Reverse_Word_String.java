public class Reverse_Word_String {
   
   public static void  Reverse_Word_String(String str){
     String[] strArr=str.split(" ");
     
     for(int i=0;i<strArr.length;i++){
        String sb=new StringBuilder(strArr[i]).reverse().toString();
         System.out.print(" "+sb);
     }
    }
    public static void main(String[] args) {
         Reverse_Word_String("kelash kumar");
    }
}
