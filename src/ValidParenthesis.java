package src;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "{([])}";
        boolean isValid = isValid(s);
        System.out.println(isValid);
    }

    public static boolean isValid(String s) {
        boolean isValid = true;
        Stack<Character> stack = new Stack<>();
        char[] charArr = s.toCharArray();
        for(char c : charArr){
            if(c == '{' || c == '[' || c=='('){
                stack.push(c);
            } else {
                char top = stack.pop();
                if(!((c=='}' && top=='{') || (c==']' && top=='[') || (c==')' && top=='('))){
                    return false;
                }
            }
        }
        return isValid;
    }
}
