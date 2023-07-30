package case_study_module_2.furama_resort.utils.validate.validate_input_customer;

import case_study_module_2.furama_resort.model.person.Customer;
import case_study_module_2.furama_resort.repository.customer_repository.CustomerRepository;
import case_study_module_2.furama_resort.repository.customer_repository.ICustomerRepository;
import case_study_module_2.furama_resort.utils.exceptions.EmailAlreadyExistException;
import case_study_module_2.furama_resort.utils.exceptions.IdAlreadyExistsException;
import case_study_module_2.furama_resort.utils.exceptions.IdNotFoundException;
import case_study_module_2.furama_resort.utils.exceptions.PhoneNumberAlreadyExistException;

import java.util.Scanner;

public class ValidateInputCustomer {
    private static Scanner input = new Scanner(System.in);
    private static final String REGEX_ID_CUSTOMER = "^KH-[0-9]{4}";
    private static final String REGEX_EMAIL = "^[a-zA-Z0-9]\\w{5,31}@[a-z]{1,11}\\.[a-z]{1,11}(\\.[a-z]{1,11})?$";
    private static final String REGEX_PHONE_NUMBER = "^0\\d{9}$";
    private static final String REGEX_IDENTITY_NUMBER = "^\\d{9}$|^\\d{12}$";
    private static ICustomerRepository customerRepository = new CustomerRepository();

    public static String validateIdCustomerToAdd() {
        do {
            try {
                String id = input.nextLine();
                if (id.matches(REGEX_ID_CUSTOMER)) {
                    Customer customer = customerRepository.getCustomerById(id);
                    if (customer == null) {
                        return id;
                    } else {
                        throw new IdAlreadyExistsException("Id already exist.Re-enter id, please");
                    }
                } else {
                    System.out.println("Wrong format. Re-enter id,please.");
                }
            } catch (IdAlreadyExistsException idAlreadyExistsException) {
                System.out.println(idAlreadyExistsException.getMessage());
            }
        } while (true);
    }

    public static String validateIdCustomerToRemoveOrUpdate() {
        do {
            try {
                String id = input.nextLine();
                if (id.matches(REGEX_ID_CUSTOMER)) {
                    Customer customer = customerRepository.getCustomerById(id);
                    if (customer == null) {
                        throw new IdNotFoundException("Id not found.Re-enter id, please");
                    } else {
                        return id;
                    }
                } else {
                    System.out.println("Wrong format. Re-enter id,please.");
                }
            } catch (IdNotFoundException idNotFoundException) {
                System.out.println(idNotFoundException.getMessage());
            }
        } while (true);
    }

    public static String validateEmailCustomer() {
        do {
            try {
                String email = input.nextLine();
                if (email.matches(REGEX_EMAIL)) {
                    Customer customer = customerRepository.getCustomerByEmail(email);
                    if (customer == null) {
                        return email;
                    } else {
                        throw new EmailAlreadyExistException("Email already exits. Re-enter email,please.");
                    }
                } else {
                    System.out.println("Wrong format. Re-enter, please.");
                }
            } catch (EmailAlreadyExistException emailAlreadyExistException) {
                System.out.println(emailAlreadyExistException.getMessage());
            }
        }
        while (true);
    }

    public static String validatePhoneNumberCustomer() {
        do {
            try {
                String phoneNumber = input.nextLine();
                if (phoneNumber.matches(REGEX_PHONE_NUMBER)) {
                    Customer customer = customerRepository.getCustomerByPhoneNumber(phoneNumber);
                    if (customer == null) {
                        return phoneNumber;
                    }else {
                        throw  new PhoneNumberAlreadyExistException("Phone number already exist. Re-enter phone number,please.");
                    }
                } else {
                    System.out.println("Wrong format.Re-enter,please.");
                }
            } catch (PhoneNumberAlreadyExistException phoneNumberAlreadyExistException){
                System.out.println(phoneNumberAlreadyExistException.getMessage());
            }
        } while (true);
    }
}
