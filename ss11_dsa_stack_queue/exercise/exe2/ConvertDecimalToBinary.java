package ss11_dsa_stack_queue.exercise.exe2;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = input.nextInt();
        System.out.println("Binary of " + x + " is: "+ convertDecimalToBinary(x));
    }
    public static String convertDecimalToBinary(Integer decimal){
        String result = "";
        Stack myStack = new Stack();

        while (decimal != 0){
            int surplus = Math.abs(decimal % 2);
            myStack.push(surplus);
            decimal = decimal/2;
        }
        int length = myStack.size();
        for (int i = 0; i < length; i++) {
            result += myStack.pop();
        }
        return result;
    }
}
