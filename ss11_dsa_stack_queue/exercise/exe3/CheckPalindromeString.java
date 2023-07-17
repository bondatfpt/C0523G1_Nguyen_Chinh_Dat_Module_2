package ss11_dsa_stack_queue.exercise.exe3;

import java.util.*;

public class CheckPalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = input.nextLine();
        Stack<String> myStack = new Stack();
        String arr[] = string.split(" ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            myStack.push(arr[i]);
        }
//        System.out.println(myStack);
//        for (int i = 0; i < arr.length; i++) {
//            myQueue.add(arr[i]);
//        }
//        System.out.println(myQueue);
    }
}
