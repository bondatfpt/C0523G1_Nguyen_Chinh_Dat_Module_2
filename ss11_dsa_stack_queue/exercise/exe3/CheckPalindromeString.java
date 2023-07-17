package ss11_dsa_stack_queue.exercise.exe3;


import java.util.*;

public class CheckPalindromeString {

    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        string = scanner.nextLine();
        String stringToLowerCase = string.toLowerCase();
        for (int i = 0; i < stringToLowerCase.length(); i++) {
                if(stringToLowerCase.charAt(i) == stringToLowerCase.charAt(stringToLowerCase.length()-i-1)){
                    System.out.println(string +" is palindrome string");
                    break;
                }
                else {
                    System.out.println(string +" is not palindrome string");
                    break;
                }
        }

    }
}