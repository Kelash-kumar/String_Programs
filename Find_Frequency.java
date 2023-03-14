public class Find_Frequency {
   
    public static void Find_Frequency_EachCharacter(String str) {
        int[] freq=new int[256];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                System.out.println((char) i + " occurs " + freq[i] + " times.");
            }
        }
    }
    public static void main(String[] args) {
        String str="kelash kuamr Bheel";;
    Find_Frequency_EachCharacter(str);
    }
}
