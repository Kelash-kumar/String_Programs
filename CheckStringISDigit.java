public class CheckStringISDigit {

    public static void DigitOnlyMethod(String s) {
        if(s.matches("\\d+")) System.out.println("Digit Only String ::"+s);
          else{
            System.out.println("not matches");
          }
        
    }
    public static void main(String[] args) {
        
        String s="123d";
        String s1="1230er";
        String s2="123";
        DigitOnlyMethod(s);
        DigitOnlyMethod(s1);
        DigitOnlyMethod(s2);
    }
}
