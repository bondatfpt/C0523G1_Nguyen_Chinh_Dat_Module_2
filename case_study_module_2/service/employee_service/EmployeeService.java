package case_study_module_2.service.employee_service;

import case_study_module_2.model.person.Employee;
import case_study_module_2.repository.employee_repository.IEmployeeRepository;
import case_study_module_2.repository.employee_repository.EmployeeRepository;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private final static String REGEX_DATE = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
    private IEmployeeRepository employeeRepository = new EmployeeRepository();
    Scanner input = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Enter a id");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Enter a name");
        String name = input.nextLine();
        System.out.println("Enter a date");
        String date = input.nextLine();
        System.out.println("Enter gender");
        String gender = input.nextLine();
        System.out.println("Enter a phone number");
        String phoneNumber = input.nextLine();
        System.out.println("Enter a identity number");
        String identityNumber = input.nextLine();
        System.out.println("Enter a email");
        String email = input.nextLine();
        System.out.println("Enter level");
        String level = input.nextLine();
        System.out.println("Enter position");
        String position = input.nextLine();
        System.out.println("Enter salary");
        double salary = Double.parseDouble(input.nextLine());
        employeeRepository.add(new Employee(id, name, date, gender, phoneNumber, identityNumber, email, level, position, salary));

    }

    @Override
    public void display() {
        List<Employee> employeeList = employeeRepository.getAllEmployee();
        for (Employee employee : employeeList) {
            System.out.println(employee.getInforToCsv());
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter a id of employee you want to delete.");
        int id = Integer.parseInt(input.nextLine());
        employeeRepository.delete(id);
    }

    @Override
    public void searchByName() {
        System.out.println("Enter a name you want to search");
        String nameSearch = input.nextLine();
        try {
            List<Employee> employeeList = employeeRepository.searchByName(nameSearch);
            for (Employee e : employeeList) {
                System.out.println(e.getInforToCsv());
            }
        } catch (RuntimeException e) {
            System.out.println("Name not found !");
        }
    }

    @Override
    public void update() {
        System.out.println("Enter an id you want to update");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Enter a new name");
        String name = input.nextLine();
        System.out.println("Enter a new date");
        String date = input.nextLine();
        System.out.println("Enter a new gender");
        String gender = input.nextLine();
        System.out.println("Enter a new phone number");
        String phoneNumber = input.nextLine();
        System.out.println("Enter a new identity number");
        String identityNumber = input.nextLine();
        System.out.println("Enter a new email");
        String email = input.nextLine();
        System.out.println("Enter a new level");
        String level = input.nextLine();
        System.out.println("Enter a new position");
        String position = input.nextLine();
        System.out.println("Enter a new salary");
        double salary = Double.parseDouble(input.nextLine());
        Employee employee = new Employee(id,name,date,gender,phoneNumber,identityNumber,email,level,position,salary);
        employeeRepository.updateEmployee(id,employee);
    }
}
