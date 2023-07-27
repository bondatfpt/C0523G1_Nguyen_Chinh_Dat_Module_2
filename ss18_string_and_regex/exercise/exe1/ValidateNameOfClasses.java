package ss18_string_and_regex.exercise.exe1;

import java.util.Scanner;

public class ValidateNameOfClasses {
    private final static String REGEX_NAME_OF_CLASS = "^[CAP][0-9]{4}[GHIK]$";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name class");
        String nameClasses = input.nextLine();
        if(nameClasses.matches(REGEX_NAME_OF_CLASS)){
            System.out.println("Valid name class");
        }
        else {
            System.out.println("Invalid name class!");
        }
    }
}
