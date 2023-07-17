package ss11_dsa_stack_queue.exercise.exe4;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        char leftBrackets = '(';
        char rightBrackets = ')';
        int countRightBrackets = 0;
        Stack bracketStack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your expression");
        String expression = input.nextLine();
        for (int i = 0; i < expression.length(); i++) {
            if(leftBrackets == expression.charAt(i)){
                bracketStack.push(expression.charAt(i));
            }
        }
        for (int i = 0; i < expression.length(); i++) {
            if(rightBrackets == expression.charAt(i)){
                countRightBrackets++;
            }
        }
        if(countRightBrackets == bracketStack.size()){
            System.out.println("Your expression is true");
        }
        else {
            System.out.println("Your expression is false");

        }
    }
}
