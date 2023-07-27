package ss18_string_and_regex.exercise.exe2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidatePhoneNumber {
    private final static String REGEX_PHONE_NUMBER = "^[(]\\d{2}[)]-[(]0\\d{9}[)]$";
    public static void main(String[] args) {
        List<String> listPhoneNumber = new ArrayList<>();
        listPhoneNumber.add("(84)-(0978489648)");
        listPhoneNumber.add("(a8)-(22222222)");
        listPhoneNumber.add("(84)-(22b22222)");
        listPhoneNumber.add("(84)-(9978489648)");
        for (String phoneNumber:listPhoneNumber) {
            if(phoneNumber.matches(REGEX_PHONE_NUMBER)){
                System.out.println("Valid phone number: " +phoneNumber);
            }
            else {
                System.out.println("Invalid phone number: " +phoneNumber);
            }
        }
    }
}
