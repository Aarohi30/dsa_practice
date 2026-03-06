package src;

import java.util.Stack;

public class ValidParenthesis_IM100 {
    //java solution using stack
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else{
                char top = stack.pop();
                if(!isMatching(top, c))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public boolean isMatching(char open, char close){
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');    
            }
}
