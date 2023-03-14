import java.util.Stack;

public class Valid_Paranthesis_String {
    public static boolean ValidParanthesisString(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        // String s="(){}[]";
        String s = "[{()}]";

        System.out.println(ValidParanthesisString(s));
    }
}
