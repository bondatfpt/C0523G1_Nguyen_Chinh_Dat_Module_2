package case_study_module_2.furama_resort.service.customer_service;

import case_study_module_2.furama_resort.model.person.Customer;
import case_study_module_2.furama_resort.repository.customer_repository.CustomerRepository;
import case_study_module_2.furama_resort.repository.customer_repository.ICustomerRepository;
import case_study_module_2.furama_resort.common.validate.validate_person.ValidateInputPerson;
import case_study_module_2.furama_resort.common.validate.validate_person.ValidateIdCustomer;
import case_study_module_2.furama_resort.utils.exceptions.*;


import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private final static Scanner input = new Scanner(System.in);
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
                    System.out.println(customer.getInforToDisplay());
                }
            }
        } catch (RuntimeException runtimeException) {
            System.out.println("List is empty !");
        }
    }

    @Override
    public void add() {
        System.out.println("------Fill in the following information to add a new customer-----");
        boolean checkIdAdd = false;
        String id;
        System.out.println("Enter an id in the following format KH-XXXX (X is number 0-9)");
        do {
            id = input.nextLine();
            try {
                checkIdAdd = ValidateIdCustomer.validateIdCustomerToAdd(id);
            } catch (IdAlreadyExistsException idAlreadyExistsException) {
                System.out.println(idAlreadyExistsException.getMessage());
            }
        } while (!checkIdAdd);

        System.out.println("Step 1: Enter a name");
        String nameAdd ;
        boolean checkNameAdd;
        do {
            nameAdd = input.nextLine();
            checkNameAdd = ValidateInputPerson.validateName(nameAdd);
        } while (!checkNameAdd);

        System.out.println("Step 2: Enter date of birth in format yyyy/mm/dd");
        String date = ValidateInputPerson.validateDate();

        String gender = "";
        int choiceGender;
        do {
            System.out.println("Step 3: Select gender");
            System.out.println("1.Male");
            System.out.println("2.Female");
            System.out.println("3.Other");
            try {
                choiceGender = Integer.parseInt(input.nextLine());
                switch (choiceGender) {
                    case 1 -> gender = "Male";
                    case 2 -> gender = "Female";
                    case 3 -> gender = "Other";
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter a number to choice.");
            }
        } while (gender.equals(""));

        System.out.println("Step 4: Enter phone number");
        String phoneNumber;
        boolean checkPhoneNumber = false;
        do {
            phoneNumber = input.nextLine();
            try {
                checkPhoneNumber = ValidateInputPerson.validatePhoneNumber(phoneNumber);
            } catch (PhoneNumberAlreadyExistException phoneNumberAlreadyExistException) {
                System.out.println(phoneNumberAlreadyExistException.getMessage());
            }
        } while (!checkPhoneNumber);

        System.out.println("Step 5: Enter identity number");
        String identityNumber;
        boolean checkIdentityNumber = false;
        do {
            identityNumber = input.nextLine();
            try {
                checkIdentityNumber = ValidateInputPerson.validateIdentityNumber(identityNumber);
            } catch (IdentityNumberAlreadyExistException identityNumberAlreadyExistException) {
                System.out.println(identityNumberAlreadyExistException.getMessage());
            }
        } while (!checkIdentityNumber);

        System.out.println("Step 6: Enter email");
        String email;
        boolean checkEmail = false;
        do {
            email = input.nextLine();
            try {
                checkEmail = ValidateInputPerson.validateEmail(email);
            } catch (EmailAlreadyExistException emailAlreadyExistException) {
                System.out.println(emailAlreadyExistException.getMessage());
            }
        } while (!checkEmail);

        String type = "";
        int choiceType;
        do {
            System.out.println("Step 7: Select type customer");
            System.out.println("1.Member");
            System.out.println("2.Sliver");
            System.out.println("3.Gold");
            System.out.println("4.Plantium");
            System.out.println("5.Diamond");
            try {
                choiceType = Integer.parseInt(input.nextLine());
                switch (choiceType) {
                    case 1 -> type = "Member";
                    case 2 -> type = "Sliver";
                    case 3 -> type = "Gold";
                    case 4 -> type = "Plantium";
                    case 5 -> type = "Diamond";
                }

            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter a number to choice");
            }
        }
        while (type.equals(""));

        String address = "";
        int choiceAddress;
        do {
            System.out.println("Step 8: Choice address:");
            System.out.println("1.Ha Noi");
            System.out.println("2.Quang Tri");
            System.out.println("3.Da Nang");
            System.out.println("4.Sai Gon");
            try {
                choiceAddress = Integer.parseInt(input.nextLine());
                switch (choiceAddress) {
                    case 1 -> address = "Ha Noi";
                    case 2 -> address = "Quang Tri";
                    case 3 -> address = "Da Nang";
                    case 4 -> address = "Sai Gon";
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter a number to choice");
            }
        } while (address.equals(""));
        Customer customer = new Customer(id, nameAdd, date, gender, phoneNumber,
                        identityNumber, email, type, address);
        customerRepository.add(customer);
        System.out.println("------Successfully added customer have id " + id +"------");
        this.display();
    }

    @Override
    public void delete() {
        System.out.println("------Enter an id (KH-XXXX) of customer you want to delete------");
        String id;
        boolean checkIdRemove = false;
        do {
            id = input.nextLine();
            try {
                checkIdRemove = ValidateIdCustomer.validateIdCustomerToRemoveOrUpdate(id);
            } catch (IdNotFoundException idNotFoundException) {
                System.out.println(idNotFoundException.getMessage());
            }
        } while (!checkIdRemove);
        int choiceDelete = 0;
        do {
            System.out.println("Do you really want to delete this employee?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            try {
                choiceDelete = Integer.parseInt(input.nextLine());
                switch (choiceDelete) {
                    case 1:
                        customerRepository.delete(id);
                        System.out.println("------Successfully deleted customer have id " + id +"------");
                        this.display();
                        break;
                    case 2:
                        break;
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter a number to choice");
            }
        } while (choiceDelete != 1 && choiceDelete != 2);
    }

    @Override
    public void update() {

        System.out.println("-----Enter an id (KH-XXXX) of customer you want to update------");
        String id;
        boolean checkIdUpdate = false;
        do {
            id = input.nextLine();
            try {
                checkIdUpdate = ValidateIdCustomer.validateIdCustomerToRemoveOrUpdate(id);
            } catch (IdNotFoundException idNotFoundException) {
                System.out.println(idNotFoundException.getMessage());
            }

        } while (!checkIdUpdate);

        System.out.println("------Fill in the following information to update a customer------");
        System.out.println("Step 1: Enter a new name");
        String nameUpdate;
        boolean checkNameUpdate;
        do {
            nameUpdate = input.nextLine();
            checkNameUpdate = ValidateInputPerson.validateName(nameUpdate);
        } while (!checkNameUpdate);
        System.out.println("Step 2: Enter new date of birth in format yyyy/mm/dd");
        String date = ValidateInputPerson.validateDate();

        String gender = "";
        int choiceGender;
        do {
            System.out.println("Step 3: Select new gender");
            System.out.println("1.Male");
            System.out.println("2.Female");
            System.out.println("3.Other");
            try {
                choiceGender = Integer.parseInt(input.nextLine());
                switch (choiceGender) {
                    case 1 -> gender = "Male";
                    case 2 -> gender = "Female";
                    case 3 -> gender = "Other";
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter a number to choice.");
            }
        } while (gender.equals(""));

        System.out.println("Step 4: Enter new phone number");
        String phoneNumber;
        boolean checkPhoneNumber = false;
        do {
            phoneNumber = input.nextLine();
            try {
                checkPhoneNumber = ValidateInputPerson.validatePhoneNumber(phoneNumber);
            } catch (PhoneNumberAlreadyExistException phoneNumberAlreadyExistException) {
                System.out.println(phoneNumberAlreadyExistException.getMessage());
            }
        } while (!checkPhoneNumber);

        System.out.println("Step 5: Enter new identity number");
        String identityNumber;
        boolean checkIdentityNumber = false;
        do {
            identityNumber = input.nextLine();
            try {
                checkIdentityNumber = ValidateInputPerson.validateIdentityNumber(identityNumber);
            } catch (IdentityNumberAlreadyExistException identityNumberAlreadyExistException) {
                System.out.println(identityNumberAlreadyExistException.getMessage());
            }
        } while (!checkIdentityNumber);

        System.out.println("Step 6: Enter new email");
        String email;
        boolean checkEmail = false;
        do {
            email = input.nextLine();
            try {
                checkEmail = ValidateInputPerson.validateEmail(email);
            } catch (EmailAlreadyExistException emailAlreadyExistException) {
                System.out.println(emailAlreadyExistException.getMessage());
            }
        } while (!checkEmail);

        String type = "";
        int choiceType;
        do {
            System.out.println("Step 7: Select type customer");
            System.out.println("1.Member");
            System.out.println("2.Sliver");
            System.out.println("3.Gold");
            System.out.println("4.Plantium");
            System.out.println("5.Diamond");
            try {
                choiceType = Integer.parseInt(input.nextLine());
                switch (choiceType) {
                    case 1 -> type = "Member";
                    case 2 -> type = "Sliver";
                    case 3 -> type = "Gold";
                    case 4 -> type = "Plantium";
                    case 5 -> type = "Diamond";
                }

            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter a number to choice");
            }
        }
        while (type.equals(""));

        String address = "";
        int choiceAddress;
        do {
            System.out.println("Step 8: Choice address:");
            System.out.println("1.Ha Noi");
            System.out.println("2.Quang Tri");
            System.out.println("3.Da Nang");
            System.out.println("4.Sai Gon");
            try {
                choiceAddress = Integer.parseInt(input.nextLine());
                switch (choiceAddress) {
                    case 1 -> address = "Ha Noi";
                    case 2 -> address = "Quang Tri";
                    case 3 -> address = "Da Nang";
                    case 4 -> address = "Sai Gon";
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter a number to choice");
            }
        } while (address.equals(""));

        Customer customer = new Customer(id, nameUpdate, date, gender, phoneNumber,
                                            identityNumber, email, type, address);
        customerRepository.updateCustomer(id, customer);
        System.out.println("------Successfully updated customer have id " + id+"------");
        this.display();
    }

    @Override
    public void searchByName() {
        List<Customer> customerList;
        System.out.println("------Enter a name of customer you want to search------");
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

