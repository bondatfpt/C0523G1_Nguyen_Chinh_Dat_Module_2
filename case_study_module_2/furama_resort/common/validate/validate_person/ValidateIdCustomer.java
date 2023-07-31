package case_study_module_2.furama_resort.common.validate.validate_person;

import case_study_module_2.furama_resort.model.person.Customer;
import case_study_module_2.furama_resort.repository.customer_repository.CustomerRepository;
import case_study_module_2.furama_resort.repository.customer_repository.ICustomerRepository;
import case_study_module_2.furama_resort.utils.exceptions.IdAlreadyExistsException;
import case_study_module_2.furama_resort.utils.exceptions.IdNotFoundException;

import java.util.Scanner;

public class ValidateIdCustomer {
    private static Scanner input = new Scanner(System.in);
    private static final String REGEX_ID_CUSTOMER = "^KH-[0-9]{4}";
    private static ICustomerRepository customerRepository = new CustomerRepository();

    public static boolean validateIdCustomerToAdd(String id) throws IdAlreadyExistsException {
        if (id.matches(REGEX_ID_CUSTOMER)) {
            Customer customer = customerRepository.getCustomerById(id);
            if (customer == null) {
                return true;
            } else {
                throw new IdAlreadyExistsException("Id already exist.Re-enter id, please");
            }
        } else {
            System.out.println("Wrong format, Re-enter id, please.");
            return false;
        }
    }

    public static boolean validateIdCustomerToRemoveOrUpdate(String id) throws IdNotFoundException {
        if (id.matches(REGEX_ID_CUSTOMER)) {
            Customer customer = customerRepository.getCustomerById(id);
            if (customer == null) {
                throw new IdNotFoundException("Id not found.Re-enter id, please");
            } else {
                return true;
            }
        } else {
            System.out.println("Wrong format, Re-enter id, please.");
            return false;
        }
    }
}

