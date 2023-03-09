public class ReverseString {
    public static void main(String[] args) {
        String str1="Make This String Reverse";
        String reverse="";
        String[] f=str1.split(" ");

        for(int i=f.length-1;i>=0;i--){
            reverse+=f[i]+" ";
        }

        System.out.println(reverse);


        //way 02; to reverse each character :
        String sb=new StringBuilder(str1).reverse().toString();
        System.out.println(sb);
    }
}
