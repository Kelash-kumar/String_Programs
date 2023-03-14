import java.util.Stack;

public class Minimum_Remove_to_Make_Valid_Parentheses {
    public static void MinimumRemoveToMakeValidParentheses(String str) {
        Stack <Character> stack=new Stack<>();
        for(char c:str.toCharArray()){
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
            }
        }
    }
}
