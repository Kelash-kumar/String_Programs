import javax.sound.sampled.SourceDataLine;

public class DeleteAlternateCharacter {
    public static void main(String[] args) {

        // delete odd index character:
        String str = "kelash";
        String str2 = "";
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (i % 3 == 0) {
                continue;
            }
            str2 += charArr[i];
        }
        System.out.println(str2);
    }

}
