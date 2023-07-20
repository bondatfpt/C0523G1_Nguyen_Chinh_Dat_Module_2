package ss13_search_algorithm.exercise.exe1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String string  = input.nextLine();
        System.out.println("The ascending substring is: " + FindAscendingString.findTheAscendingString(string));
    }
}
