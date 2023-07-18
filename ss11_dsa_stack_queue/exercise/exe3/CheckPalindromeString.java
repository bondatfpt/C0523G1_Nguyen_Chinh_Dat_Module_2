package ss11_dsa_stack_queue.exercise.exe3;


import java.util.*;

public class CheckPalindromeString {

    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        string = scanner.nextLine();
        String [] arrString = string.trim().toLowerCase().split("");

        Stack myStack = new Stack<>();
        Queue myQueue = new LinkedList();

        for (int i = 0; i < arrString.length; i++) {
            myStack.push(arrString[i]);
            myQueue.offer(arrString[i]);
        }
        boolean check = true;
        for (int i = 0; i < arrString.length; i++) {
            if(!myStack.pop().equals(myQueue.poll())){
                check = false;
            }
        }
        if(check){
            System.out.println(string + " is palindrome String");
        }
        else {
            System.out.println(string + " is not palindrome String");
        }

    }
}