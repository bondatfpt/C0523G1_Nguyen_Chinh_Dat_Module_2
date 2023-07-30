package case_study_module_2.furama_resort.service.employee_service;

import case_study_module_2.furama_resort.model.person.Employee;
import case_study_module_2.furama_resort.repository.employee_repository.IEmployeeRepository;
import case_study_module_2.furama_resort.repository.employee_repository.EmployeeRepository;
import case_study_module_2.furama_resort.utils.validate.validate_input_person.ValidateInputPerson;
import case_study_module_2.furama_resort.utils.validate.validate_id_employee.ValidateIdEmployee;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private IEmployeeRepository employeeRepository = new EmployeeRepository();
    Scanner input = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Enter an id");
        String id = ValidateIdEmployee.validateIdEmployeeToAdd();

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
            } catch (NumberFormatException e) {
                System.out.println("Enter a number to choice");
            }
        } while (gender.equals(""));

        System.out.println("Enter a phone number");
        String phoneNumber = ValidateInputPerson.validatePhoneNumber();

        System.out.println("Enter an identity number");
        String identityNumber = ValidateInputPerson.validateIdentityNumber();

        System.out.println("Enter an email");
        String email = ValidateInputPerson.validateEmail();

        String level = "";
        int choiceLevel = 0;
        do {
            System.out.println("Choose level");
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
            System.out.println("Choose position");
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
            System.out.println("Enter salary");
            try {
                salary = Double.parseDouble(input.nextLine());
                if (salary <= 0) {
                    System.out.println("Salary must be greater than 0");
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Wrong format. Re-enter,please.");
            }
        } while (salary <= 0);

        employeeRepository.add(new Employee(id, name, date, gender, phoneNumber, identityNumber, email, level, position, salary));
        System.out.println("Successfully added employee have id " + id);
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
                    System.out.println(employee.getInforToCsv());
                }
            }
        } catch (RuntimeException e) {
            System.out.println("List is empty !");
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter an id of employee you want to delete.");
        String id = ValidateIdEmployee.validateIdEmployeeToDeleteOrUpdate();
        employeeRepository.delete(id);
        System.out.println("Successfully deleted employee have id " + id);
        this.display();
    }

    @Override
    public void searchByName() {
        List<Employee> employeeList = null;
        System.out.println("Enter a name of employee you want to search");
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
        System.out.println("Enter an id of employee you want to update");
        String id = ValidateIdEmployee.validateIdEmployeeToDeleteOrUpdate();
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
            } catch (NumberFormatException e) {
                System.out.println("Enter a number to choice");
            }
        } while (gender.equals(""));

        System.out.println("Enter a phone number");
        String phoneNumber = ValidateInputPerson.validatePhoneNumber();

        System.out.println("Enter an identity number");
        String identityNumber = ValidateInputPerson.validateIdentityNumber();

        System.out.println("Enter a email");
        String email = ValidateInputPerson.validateEmail();

        String level = "";
        int choiceLevel = 0;
        do {
            System.out.println("Choose level");
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
            System.out.println("Choose position");
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
            System.out.println("Enter salary");
            try {
                salary = Double.parseDouble(input.nextLine());
                if (salary <= 0) {
                    System.out.println("Salary must be greater than 0");
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Wrong format. Re-enter,please.");
            }
        } while (salary <= 0);
        Employee employee = new Employee(id, name, date, gender, phoneNumber, identityNumber, email, level, position, salary);
        employeeRepository.updateEmployee(id, employee);
        System.out.println("Successfully updated employee have id " + id);
        this.display();
    }
}
