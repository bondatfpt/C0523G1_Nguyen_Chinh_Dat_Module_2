package case_study_module_2.furama_resort.utils.validate.validate_input_person;

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
}
