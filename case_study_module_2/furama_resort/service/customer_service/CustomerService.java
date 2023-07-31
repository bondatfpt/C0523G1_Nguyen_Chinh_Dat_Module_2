package case_study_module_2.furama_resort.service.customer_service;

import case_study_module_2.furama_resort.model.person.Customer;
import case_study_module_2.furama_resort.repository.customer_repository.CustomerRepository;
import case_study_module_2.furama_resort.repository.customer_repository.ICustomerRepository;
import case_study_module_2.furama_resort.common.validate.validate_person.ValidateInputPerson;
import case_study_module_2.furama_resort.common.validate.validate_person.ValidateIdCustomer;


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
        System.out.println("Fill in the following information to add a new employee");
        System.out.println("Enter an id");
        String id = ValidateIdCustomer.validateIdCustomerToAdd();

        System.out.println("Enter a name");
        String name = ValidateInputPerson.validateName();

        System.out.println("Enter date of birth in format yyyy/mm/dd");
        String date = ValidateInputPerson.validateDate();

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
        String phoneNumber = ValidateInputPerson.validatePhoneNumber();

        System.out.println("Enter identity number");
        String identityNumber = ValidateInputPerson.validateIdentityNumber();

        System.out.println("Enter email");
        String email = ValidateInputPerson.validateEmail();

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

        String address = "";
        int choiceAddress = 0;
        do {
            System.out.println("Choice address:");
            System.out.println("1.Hà Nội");
            System.out.println("2.Quảng Trị");
            System.out.println("3.Đà Nẵng");
            System.out.println("4.Sài Gòn");
            try {
                choiceAddress = Integer.parseInt(input.nextLine());
                switch (choiceAddress){
                    case 1:
                        address ="Hà Nội";
                        break;
                    case 2:
                        address ="Quảng Trị";
                        break;
                    case 3:
                        address ="Đà Nẵng";
                        break;
                    case 4:
                        address ="Sài Gòn";
                        break;
                }
            }catch (NumberFormatException numberFormatException){
                System.out.println("Enter a number to choice");
            }
        } while (address.equals(""));
        Customer customer = new Customer(id, name, date, gender, phoneNumber, identityNumber, email, type, address);
        customerRepository.add(customer);
        System.out.println("Successfully added customer have id " + id);
        this.display();
    }

    @Override
    public void delete() {
        System.out.println("Enter an id of customer you want to delete.");
        String id = ValidateIdCustomer.validateIdCustomerToRemoveOrUpdate();
        customerRepository.delete(id);
        System.out.println("Successfully deleted customer have id " + id);
        this.display();
    }

    @Override
    public void update() {

        System.out.println("Enter an id of employee you want to update");
        String id = ValidateIdCustomer.validateIdCustomerToRemoveOrUpdate();

        System.out.println("Fill in the following information to update a new employee");
        System.out.println("Enter a new name");
        String name = ValidateInputPerson.validateName();

        System.out.println("Enter new date of birth in format yyyy/mm/dd");
        String date = ValidateInputPerson.validateDate();

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
        String phoneNumber = ValidateInputPerson.validatePhoneNumber();

        System.out.println("Enter new identity number");
        String identityNumber = ValidateInputPerson.validateIdentityNumber();

        System.out.println("Enter new email");
        String email = ValidateInputPerson.validateEmail();

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

        String address = "";
        int choiceAddress = 0;
        do {
            System.out.println("Choice address:");
            System.out.println("1.Hà Nội");
            System.out.println("2.Quảng Trị");
            System.out.println("3.Đà Nẵng");
            System.out.println("4.Sài Gòn");
            try {
                address = input.nextLine();
                choiceAddress = Integer.parseInt(input.nextLine());
                switch (choiceAddress){
                    case 1:
                        address ="Hà Nội";
                        break;
                    case 2:
                        address ="Quảng Trị";
                        break;
                    case 3:
                        address ="Đà Nẵng";
                        break;
                    case 4:
                        address ="Sài Gòn";
                        break;
                }
            }catch (NumberFormatException numberFormatException){
                System.out.println("Enter a number to choice");
            }
        } while (address.equals(""));

        Customer customer = new Customer(id, name, date, gender, phoneNumber, identityNumber, email, type, address);
        customerRepository.updateCustomer(id, customer);
        System.out.println("Successfully updated customer have id " + id);
        this.display();
    }

    @Override
    public void searchByName() {
        List<Customer> customerList = null;
        System.out.println("Enter a name of customer you want to search");
        do {
            String name = input.nextLine();
            customerList = customerRepository.searchByName(name);
            if (customerList.isEmpty()) {
                System.out.println("This customer's name is not available.Re-enter name,please.");
            } else {
                for (Customer customer : customerList) {
                    System.out.println(customer.getInforToCsv());
                }
            }
        } while (customerList.isEmpty());
    }
}

