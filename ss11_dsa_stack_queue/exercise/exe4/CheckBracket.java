package ss11_dsa_stack_queue.exercise.exe4;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        String string = "{}()[)]";
        String string1 = "{}()[()]";
        System.out.println(checkBrackets(string));
        System.out.println(checkBrackets(string1));
    }
    public static boolean checkBrackets(String expression){
        Stack <Character>bracketStack = new Stack();
        for (int i = 0; i < expression.length(); i++) {
            char bracket = expression.charAt(i);
            if(bracket == '('|| bracket == '{' || bracket == '['){
                bracketStack.push(bracket);
            }else if(bracket == ')'){
                if(bracketStack.isEmpty() || bracketStack.pop() != '('){
                    return false;
                }
            } else if (bracket == '}') {
                if(bracketStack.isEmpty() || bracketStack.pop() != '{'){
                    return false;
                }
            } else if (bracket == ']') {
                if(bracketStack.isEmpty() || bracketStack.pop() != '['){
                    return false;
                }
            }
        }
        return bracketStack.isEmpty();
    }
}
