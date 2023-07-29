package case_study_module_2.service.customer_service;

import case_study_module_2.model.person.Customer;
import case_study_module_2.repository.customer_repository.CustomerRepository;
import case_study_module_2.repository.customer_repository.ICustomerRepository;
import case_study_module_2.utils.validate.validate_input.ValidateInput;
import case_study_module_2.utils.validate.validate_input_customer.ValidateInputCustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static Scanner input = new Scanner(System.in);
    ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void display() {
        List<Customer> customers;
        try {
            customers = customerRepository.getAllCustomer();
            if (customers.isEmpty()) {
                throw new RuntimeException();
            } else {
                for (Customer customer : customers) {
                    System.out.println(customer.getInforToCsv());
                }
            }
        } catch (RuntimeException runtimeException) {
            System.out.println("List is empty !");
        }
    }

    @Override
    public void add() {
        System.out.println("Enter an id");
        String id = ValidateInputCustomer.validateIdCustomerToAdd();

        System.out.println("Enter a name");
        String name = ValidateInput.validateName();

        System.out.println("Enter date of birth in format yyyy/mm/dd");
        String date = ValidateInput.validateDate();

        String gender = "";
        int choiceGender = 0;
        do {
            System.out.println("Select gender");
            System.out.println("1.Male");
            System.out.println("2.Female");
            System.out.println("3.Other");
            try {
                choiceGender = Integer.parseInt(input.nextLine());
                switch (choiceGender) {
                    case 1:
                        gender = "Male";
                        break;
                    case 2:
                        gender = "Female";
                        break;
                    case 3:
                        gender = "Other";
                        break;
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter a number to choice.");
            }
        } while (gender.equals(""));

        System.out.println("Enter phone number");
        String phoneNumber = ValidateInput.validatePhoneNumber();

        System.out.println("Enter identity number");
        String identityNumber = ValidateInput.validateIdentityNumber();

        System.out.println("Enter email");
        String email = ValidateInput.validateEmail();

        String type = "";
        int choiceType = 0;
        do {
            System.out.println("Select type");
            System.out.println("1.Sliver");
            System.out.println("2.Gold");
            System.out.println("3.Diamond");
            try {
                choiceType = Integer.parseInt(input.nextLine());
                switch (choiceType) {
                    case 1:
                        type = "Sliver";
                        break;
                    case 2:
                        type = "Gold";
                        break;
                    case 3:
                        type = "Diamond";
                        break;
                }

            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter a number to choice");
            }
        }
        while (type.equals(""));

        System.out.println("Enter an address");
        String address = input.nextLine();

        Customer customer = new Customer(id, name, date, gender, phoneNumber, identityNumber, email, type, address);
        customerRepository.add(customer);
    }

    @Override
    public void delete() {
        System.out.println("Enter an id of customer you want to delete.");
        String id = ValidateInputCustomer.validateIdCustomerToRemoveOrUpdate();
        customerRepository.delete(id);
    }

    @Override
    public void update() {
        System.out.println("Enter an id of employee you want to update");
        String id = ValidateInputCustomer.validateIdCustomerToRemoveOrUpdate();

        System.out.println("Enter a new name");
        String name = ValidateInput.validateName();

        System.out.println("Enter new date of birth in format yyyy/mm/dd");
        String date = ValidateInput.validateDate();

        String gender = "";
        int choiceGender = 0;
        do {
            System.out.println("Select new gender");
            System.out.println("1.Male");
            System.out.println("2.Female");
            System.out.println("3.Other");
            try {
                choiceGender = Integer.parseInt(input.nextLine());
                switch (choiceGender) {
                    case 1:
                        gender = "Male";
                        break;
                    case 2:
                        gender = "Female";
                        break;
                    case 3:
                        gender = "Other";
                        break;
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter a number to choice.");
            }
        } while (gender.equals(""));

        System.out.println("Enter new phone number");
        String phoneNumber = ValidateInput.validatePhoneNumber();

        System.out.println("Enter new identity number");
        String identityNumber = ValidateInput.validateIdentityNumber();

        System.out.println("Enter new email");
        String email = ValidateInput.validateEmail();

        String type = "";
        int choiceType = 0;
        do {
            System.out.println("Select new type");
            System.out.println("1.Sliver");
            System.out.println("2.Gold");
            System.out.println("3.Diamond");
            try {
                choiceType = Integer.parseInt(input.nextLine());
                switch (choiceType) {
                    case 1:
                        type = "Sliver";
                        break;
                    case 2:
                        type = "Gold";
                        break;
                    case 3:
                        type = "Diamond";
                        break;
                }

            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter a number to choice");
            }
        }
        while (type.equals(""));

        System.out.println("Enter an new address");
        String address = input.nextLine();
        Customer customer = new Customer(id, name, date, gender, phoneNumber, identityNumber, email, type, address);
        customerRepository.updateCustomer(id, customer);
    }

    @Override
    public void searchByName() {
        System.out.println("Enter a name of employee you want to search");
        try {
            String name = input.nextLine();
            List<Customer> customerList = customerRepository.searchByName(name);
            for (Customer customer : customerList) {
                System.out.println(customer.getInforToCsv());
            }
        } catch (RuntimeException runtimeException) {
            System.out.println("Name not found");
        }
    }
}
