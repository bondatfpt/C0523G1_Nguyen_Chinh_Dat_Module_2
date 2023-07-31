package case_study_module_2.furama_resort.common.validate.validate_person;

import case_study_module_2.furama_resort.model.person.Customer;
import case_study_module_2.furama_resort.model.person.Employee;
import case_study_module_2.furama_resort.repository.customer_repository.CustomerRepository;
import case_study_module_2.furama_resort.repository.customer_repository.ICustomerRepository;
import case_study_module_2.furama_resort.repository.employee_repository.EmployeeRepository;
import case_study_module_2.furama_resort.repository.employee_repository.IEmployeeRepository;
import case_study_module_2.furama_resort.utils.exceptions.EmailAlreadyExistException;
import case_study_module_2.furama_resort.utils.exceptions.IdentityNumberAlreadyExistException;
import case_study_module_2.furama_resort.utils.exceptions.PhoneNumberAlreadyExistException;

import java.time.LocalDate;
import java.util.Scanner;

public class ValidateInputPerson {
    private static Scanner input = new Scanner(System.in);
    private static final String REGEX_NAME = "^[A-Z][a-z]+\\s[A-Z][a-z]+\\s[A-Z]\\w+$";
    private static final String REGEX_DATE = "^((19|20)\\d\\d)/(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])$";
    private static final String REGEX_IDENTITY_NUMBER = "^\\d{9}$|^\\d{12}$";
    private static final String REGEX_PHONE_NUMBER = "^0\\d{9}$";
    private static final String REGEX_EMAIL = "^[a-zA-Z0-9]\\w{5,31}@[a-z]{1,11}\\.[a-z]{1,11}(\\.[a-z]{1,11})?$";
    private static ICustomerRepository customerRepository = new CustomerRepository();
    private static IEmployeeRepository employeeRepository = new EmployeeRepository();

    public static boolean validateName(String name) {
        if (name.matches(REGEX_NAME)) {
            return true;
        } else {
            System.out.println("First letter of last name, middle name, first name must be capitalized. Do not include special characters, numbers. Re-enter name,please.");
            return false;
        }
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
                } else if (Integer.parseInt(dateArray[2]) - localDate.getDayOfMonth() < 0) {
                    System.out.println("Under 18 years old. Re-enter,please.");
                } else {
                    return date;
                }
            } else if (localDate.getYear() - Integer.parseInt(dateArray[0]) > 18) {
                return date;
            } else {
                System.out.println("Under 18 years old.Re-enter date of birth,please.");
            }
        } while (true);
    }

    public static boolean validateIdentityNumber(String identityNumber) throws IdentityNumberAlreadyExistException {
        if (identityNumber.matches(REGEX_IDENTITY_NUMBER)) {
            Customer customer = customerRepository.getCustomerByIdentityNumber(identityNumber);
            Employee employee = employeeRepository.getEmployeeByIdentityNumber(identityNumber);
            if (customer == null && employee == null) {
                return true;
            } else {
                throw new IdentityNumberAlreadyExistException("Identity number already exist. Re-enter identity number,please");
            }
        } else {
            System.out.println("Wrong format. Re-enter identity number,please.");
            return false;
        }
    }


    public static boolean validatePhoneNumber(String phoneNumber) throws PhoneNumberAlreadyExistException {
        if (phoneNumber.matches(REGEX_PHONE_NUMBER)) {
            Employee employee = employeeRepository.getEmployeeByPhoneNumber(phoneNumber);
            Customer customer = customerRepository.getCustomerByPhoneNumber(phoneNumber);
            if (employee == null && customer == null) {
                return true;
            } else {
                throw new PhoneNumberAlreadyExistException("Phone number already exist. Re-enter phone number,please.");
            }
        } else {
            System.out.println("Wrong format.Re-enter phone number,please.");
            return false;
        }
    }


    public static boolean validateEmail(String email) throws EmailAlreadyExistException {
        if (email.matches(REGEX_EMAIL)) {
            Employee employee = employeeRepository.getEmployeeByEmail(email);
            Customer customer = customerRepository.getCustomerByEmail(email);
            if (employee == null && customer == null) {
                return true;
            } else {
                throw new EmailAlreadyExistException("Email already exits. Re-enter email,please.");
            }
        } else {
            System.out.println("Wrong format. Re-enter email, please.");
            return false;
        }
    }

}

