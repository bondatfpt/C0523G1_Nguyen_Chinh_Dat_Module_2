package case_study_module_2.service.impl;

import case_study_module_2.common.ReadAndWriteData;
import case_study_module_2.model.person.Employee;
import case_study_module_2.repository.IEmployeeRepository;
import case_study_module_2.repository.impl.EmployeeRepository;
import case_study_module_2.service.IEmployeeService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private final static String REGEX_DATE = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
    private IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void add() {
        Scanner input = new Scanner(System.in);
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
        double salaray = Double.parseDouble(input.nextLine());
        employeeRepository.add(new Employee(id, name, date, gender, phoneNumber, identityNumber, email, level, position, salaray));

    }

    @Override
    public void display() {
        List<String> employeeList = new ArrayList<>();
        employeeList = employeeRepository.getAllEmployee();
        for (String string : employeeList) {
            System.out.println(string);
        }
    }
}
