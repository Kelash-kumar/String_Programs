public class MostCommonCharacterString {

    public static void MostCommon_Character_String(String str) {
        StringBuffer sb = new StringBuffer();
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            sb.append(" ");
            for (int j = 0; j < charArr.length; j++) {
                if (charArr[j] == charArr[i]) {
                    sb.append(charArr[i]);
                }
            }
        }
        System.out.println(sb);

    }

    public static void main(String[] args) {
        MostCommon_Character_String("kelashkumar");
    }
}
