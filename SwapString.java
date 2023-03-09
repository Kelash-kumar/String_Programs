public class SwapString{
    public static void main(String[] args){
        System.out.println("Swap String without using third variable");

        String str1="cup";
        String str2="kake";
        System.out.println("String before Swap \n string1 +  string2 = "+str1+" "+str2);
        str1=str1+str2;
        str2=str1.substring(0,(str1.length()-str2.length()));
        str1=str1.substring(str2.length());
        System.out.println("String before Swap \n string1 +  string2 = "+str1+" "+str2);
    }
}