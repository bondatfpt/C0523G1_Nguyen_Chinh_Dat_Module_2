package case_study_module_2.utils.validate.validate_input;

import java.time.LocalDate;
import java.util.Scanner;

public class ValidateInput {
    private static Scanner input = new Scanner(System.in);
    private static final String REGEX_NAME = "^[A-Z][a-z]+\\s[A-Z][a-z]+\\s[A-Z]\\w+$";
    private static final String REGEX_DATE = "^((19|20)\\d\\d)/(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])$";
    private static final String REGEX_PHONE_NUMBER = "^0\\d{9}$";
    private static final String REGEX_IDENTITY_NUMBER = "^\\d{9}$|^\\d{12}$";
    private static final String REGEX_EMAIL = "^[a-zA-Z0-9]\\w{5,31}@[a-z]{1,11}\\.[a-z]{1,11}(\\.[a-z]{1,11})?$";


    public static String validateName() {
        do {
            String name = input.nextLine();
            if (name.matches(REGEX_NAME)) {
                return name;
            } else {
                System.out.println("First letter of last name, middle name, first name must be capitalized. Do not include special characters, numbers. Re-enter,please.");
            }
        } while (true);
    }

    public static String validateDate() {
        String date;
        LocalDate localDate = LocalDate.now();
        do {
            do {
                date = input.nextLine();
                if (date.matches(REGEX_DATE)) {
                    break;
                } else {
                    System.out.println("Wrong format. Re-enter,please.");
                }
            } while (true);
            String[] dateArray = new String[2];
            for (int i = 0; i < date.length(); i++) {
                dateArray = date.split("/");
            }
            if (localDate.getYear() - Integer.parseInt(dateArray[0]) == 18) {
                if (Integer.parseInt(dateArray[1]) - localDate.getMonthValue() > 0) {
                    System.out.println("Under 18 years old. Re-enter,please.");
                } else if (Integer.parseInt(dateArray[2]) - localDate.getDayOfMonth() <= 0) {
                    System.out.println("Under 18 years old. Re-enter,please.");
                } else {
                    return date;
                }
            } else if (localDate.getYear() - Integer.parseInt(dateArray[0]) > 18) {
                return date;
            } else {
                System.out.println("Under 18 years old.Re-enter.please.");
            }
        } while (true);
    }

    public static String validatePhoneNumber() {
        do {
            String phoneNumber = input.nextLine();
            if (phoneNumber.matches(REGEX_PHONE_NUMBER)) {
                return phoneNumber;
            } else {
                System.out.println("Wrong format.Re-enter,please.");
            }
        } while (true);
    }

    public static String validateIdentityNumber() {
        do {
            String identityNumber = input.nextLine();
            if (identityNumber.matches(REGEX_IDENTITY_NUMBER)) {
                return identityNumber;
            } else {
                System.out.println("Wrong format. Re-enter,please.");
            }
        }while (true);
    }
    public static String validateEmail(){
        do {
            String email =input.nextLine();
            if(email.matches(REGEX_EMAIL)){
                return email;
            }
            else {
                System.out.println("Wrong format. Re-enter, please.");
            }
        }while (true);
    }
}
