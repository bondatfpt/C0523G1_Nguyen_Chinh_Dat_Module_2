package case_study_module_2.furama_resort.service.employee_service;

import case_study_module_2.furama_resort.model.person.Employee;
import case_study_module_2.furama_resort.repository.employee_repository.IEmployeeRepository;
import case_study_module_2.furama_resort.repository.employee_repository.EmployeeRepository;
import case_study_module_2.furama_resort.common.validate.validate_person.ValidateInputPerson;
import case_study_module_2.furama_resort.common.validate.validate_person.ValidateIdEmployee;
import case_study_module_2.furama_resort.utils.exceptions.*;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private IEmployeeRepository employeeRepository = new EmployeeRepository();
    Scanner input = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("-------Fill in the following information to add a new employee------");
        System.out.println("Step 1. Enter an id in the following format NV-XXXX(X is number 0- 9)");
        String id = "";
        boolean checkIdAdd = false;
        do {
            id = input.nextLine();
            try {
                checkIdAdd = ValidateIdEmployee.validateIdEmployeeToAdd(id);
            } catch (IdAlreadyExistsException idAlreadyExistsException) {
                System.out.println(idAlreadyExistsException.getMessage());
            }
        } while (checkIdAdd == false);

        System.out.println("Step 2. Enter a name");
        String nameAdd = "";
        boolean checkNameAdd = false;
        do {
            nameAdd = input.nextLine();
            checkNameAdd = ValidateInputPerson.validateName(nameAdd);
        } while (checkNameAdd == false);

        System.out.println("Step 3. Enter date of birth in format yyyy/mm/dd");
        String date = ValidateInputPerson.validateDate();

        String gender = "";
        int choiceGender = 0;
        do {
            System.out.println("Step 4. Select gender");
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
            } catch (NumberFormatException e) {
                System.out.println("Enter a number to choice");
            }
        } while (gender.equals(""));

        System.out.println("Step 5. Enter a phone number");
        String phoneNumber = "";
        boolean checkPhoneNumber = false;
        do {
            phoneNumber = input.nextLine();
            try {
                checkPhoneNumber = ValidateInputPerson.validatePhoneNumber(phoneNumber);
            } catch (PhoneNumberAlreadyExistException phoneNumberAlreadyExistException) {
                System.out.println(phoneNumberAlreadyExistException.getMessage());
            }
        } while (checkPhoneNumber == false);

        System.out.println("6. Enter an identity number");
        String identityNumber = "";
        boolean checkIdentityNumber = false;
        do {
            identityNumber = input.nextLine();
            try {
                checkIdentityNumber = ValidateInputPerson.validateIdentityNumber(identityNumber);
            } catch (IdentityNumberAlreadyExistException identityNumberAlreadyExistException) {
                System.out.println(identityNumberAlreadyExistException.getMessage());
            }
        } while (checkIdentityNumber == false);

        System.out.println("Step 7. Enter an email");
        String email = "";
        boolean checkEmail = false;
        do {
            email = input.nextLine();
            try {
                checkEmail = ValidateInputPerson.validateEmail(email);
            } catch (EmailAlreadyExistException emailAlreadyExistException) {
                System.out.println(emailAlreadyExistException.getMessage());
            }
        } while (checkEmail == false);

        String level = "";
        int choiceLevel = 0;
        do {
            System.out.println("Step 8. Choose level");
            System.out.println("1.Intermediate");
            System.out.println("2.College");
            System.out.println("3.University");
            System.out.println("4.After university");
            try {
                choiceLevel = Integer.parseInt(input.nextLine());
                switch (choiceLevel) {
                    case 1:
                        level = "Intermediate";
                        break;
                    case 2:
                        level = "College";
                        break;
                    case 3:
                        level = "University";
                        break;
                    case 4:
                        level = "After university";
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter a number to choice");
            }
        } while (level.equals(""));

        String position = "";
        int choicePosition = 0;
        do {
            System.out.println("Step 9. Choose position");
            System.out.println("1.Receptionist");
            System.out.println("2.Serve");
            System.out.println("3.Expert");
            System.out.println("4.Monitor");
            System.out.println("5.Manage");
            System.out.println("6.Manager");
            try {
                choicePosition = Integer.parseInt(input.nextLine());
                switch (choicePosition) {
                    case 1:
                        position = "Receptionist";
                        break;
                    case 2:
                        position = "Serve";
                        break;
                    case 3:
                        position = "Expert";
                        break;
                    case 4:
                        position = "Monitor";
                        break;
                    case 5:
                        position = "Manage";
                        break;
                    case 6:
                        position = "Manager";
                        break;
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter a number to choice");
            }
        } while (position.equals(""));

        double salary = 0;
        do {
            System.out.println("Step 10. Enter salary");
            try {
                salary = Double.parseDouble(input.nextLine());
                if (salary <= 0) {
                    System.out.println("Salary must be greater than 0");
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Wrong format. Re-enter,please.");
            }
        } while (salary <= 0);

        employeeRepository.add(new Employee(id, nameAdd, date, gender, phoneNumber,
                identityNumber, email, level, position, salary));
        System.out.println("------Successfully added employee have id " + id+ "------");
        this.display();
    }

    @Override
    public void display() {
        List<Employee> employeeList;
        try {
            employeeList = employeeRepository.getAllEmployee();
            if (employeeList.isEmpty()) {
                throw new RuntimeException();
            } else {
                for (Employee employee : employeeList) {
                    System.out.println(employee.getInforToDisplay());
                }
            }
        } catch (RuntimeException runtimeException) {
            System.out.println("------List is empty!------");
        }
    }

    @Override
    public void delete() {
        System.out.println("------Enter an id (NV-XXXX) of employee you want to delete------");
        String id = "";
        boolean checkIdRemove = false;
        do {
            id = input.nextLine();
            try {
                checkIdRemove = ValidateIdEmployee.validateIdEmployeeToDeleteOrUpdate(id);
            } catch (IdNotFoundException idNotFoundException) {
                System.out.println(idNotFoundException.getMessage());
            }
        } while (checkIdRemove == false);
        int choiceDelete = 0;
        do {
            System.out.println("Do you really want to delete this employee?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            try {
                choiceDelete = Integer.parseInt(input.nextLine());
                switch (choiceDelete) {
                    case 1:
                        employeeRepository.delete(id);
                        System.out.println("------Successfully deleted customer have id " + id+"------");
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
    public void searchByName() {
        List<Employee> employeeList = null;
        System.out.println("------Enter a name of employee you want to search------");
        do {
            String nameSearch = input.nextLine();
            employeeList = employeeRepository.searchByName(nameSearch);
            if (employeeList.isEmpty()) {
                System.out.println("This employee's name is not available.Re-enter name,please.");
            } else {
                for (Employee e : employeeList) {
                    System.out.println(e.getInforToCsv());
                }
            }
        } while (employeeList.isEmpty());
    }

    @Override
    public void update() {
        System.out.println("------Enter an id (NV-XXXX) of employee you want to update------");
        String id = "";
        boolean checkIdUpdate = false;
        do {
            id = input.nextLine();
            try {
                checkIdUpdate = ValidateIdEmployee.validateIdEmployeeToDeleteOrUpdate(id);
            } catch (IdNotFoundException idNotFoundException) {
                System.out.println(idNotFoundException.getMessage());
            }
        } while (checkIdUpdate == false);

        System.out.println("------Fill in the following information to update a new employee------");
        System.out.println("Step 1. Enter a new name");
        String nameUpdate = "";
        boolean checkNameUpdate = false;
        do {
            nameUpdate = input.nextLine();
            checkNameUpdate = ValidateInputPerson.validateName(nameUpdate);
        } while (checkNameUpdate == false);

        System.out.println("Step 2. Enter date of birth in format yyyy/mm/dd");
        String date = ValidateInputPerson.validateDate();

        String gender = "";
        int choiceGender = 0;
        do {
            System.out.println("Step 3. Select new gender");
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
            } catch (NumberFormatException e) {
                System.out.println("Enter a number to choice");
            }
        } while (gender.equals(""));

        System.out.println("Step 4. Enter a new phone number");
        String phoneNumber = "";
        boolean checkPhoneNumber = false;
        do {
            phoneNumber = input.nextLine();
            try {
                checkPhoneNumber = ValidateInputPerson.validatePhoneNumber(phoneNumber);
            } catch (PhoneNumberAlreadyExistException phoneNumberAlreadyExistException) {
                System.out.println(phoneNumberAlreadyExistException.getMessage());
            }
        } while (checkPhoneNumber == false);

        System.out.println("Step 5. Enter an new identity number");
        String identityNumber = "";
        boolean checkIdentityNumber = false;
        do {
            identityNumber = input.nextLine();
            try {
                checkIdentityNumber = ValidateInputPerson.validateIdentityNumber(identityNumber);
            } catch (IdentityNumberAlreadyExistException identityNumberAlreadyExistException) {
                System.out.println(identityNumberAlreadyExistException.getMessage());
            }
        } while (checkIdentityNumber == false);

        System.out.println("Step 6. Enter an new email");
        String email = "";
        boolean checkEmail = false;
        do {
            email = input.nextLine();
            try {
                checkEmail = ValidateInputPerson.validateEmail(email);
            } catch (EmailAlreadyExistException emailAlreadyExistException) {
                System.out.println(emailAlreadyExistException.getMessage());
            }
        } while (checkEmail == false);

        String level = "";
        int choiceLevel = 0;
        do {
            System.out.println("Step 7. Choose new level");
            System.out.println("1.Intermediate");
            System.out.println("2.College");
            System.out.println("3.University");
            System.out.println("4.After university");
            try {
                choiceLevel = Integer.parseInt(input.nextLine());
                switch (choiceLevel) {
                    case 1:
                        level = "Intermediate";
                        break;
                    case 2:
                        level = "College";
                        break;
                    case 3:
                        level = "University";
                        break;
                    case 4:
                        level = "After university";
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter a number to choice");
            }
        } while (level.equals(""));

        String position = "";
        int choicePosition = 0;
        do {
            System.out.println("Step 8. Choose new position");
            System.out.println("1.Receptionist");
            System.out.println("2.Serve");
            System.out.println("3.Expert");
            System.out.println("4.Monitor");
            System.out.println("5.Manage");
            System.out.println("6.Manager");
            try {
                choicePosition = Integer.parseInt(input.nextLine());
                switch (choicePosition) {
                    case 1:
                        position = "Receptionist";
                        break;
                    case 2:
                        position = "Serve";
                        break;
                    case 3:
                        position = "Expert";
                        break;
                    case 4:
                        position = "Monitor";
                        break;
                    case 5:
                        position = "Manage";
                        break;
                    case 6:
                        position = "Manager";
                        break;
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter a number to choice");
            }
        } while (position.equals(""));

        double salary = 0;
        do {
            System.out.println("Step 9. Enter new salary");
            try {
                salary = Double.parseDouble(input.nextLine());
                if (salary <= 0) {
                    System.out.println("Salary must be greater than 0");
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Wrong format. Re-enter,please.");
            }
        } while (salary <= 0);
        Employee employee = new Employee(id, nameUpdate, date, gender, phoneNumber,
                                    identityNumber, email, level, position, salary);
        employeeRepository.updateEmployee(id, employee);
        System.out.println("------Successfully updated employee have id" + id + "------");
        this.display();
    }
}
