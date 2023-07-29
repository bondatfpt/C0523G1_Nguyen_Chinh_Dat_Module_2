package case_study_module_2.repository.employee_repository;

import case_study_module_2.common.ReadAndWriteData;
import case_study_module_2.model.person.Employee;


import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private final String FILE_PATH_EMPLOYEE = "D:\\C0523G1_Nguyen_Chinh_Dat_Module_2\\case_study_module_2\\data\\employee.csv";

    @Override
    public void add(Employee employee) {
        List<String> employeeList = new ArrayList<>();
        employeeList.add(employee.getInforToCsv());
        ReadAndWriteData.writeToCsv(FILE_PATH_EMPLOYEE, employeeList, true);
    }

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = ReadAndWriteData.readFromCSV(FILE_PATH_EMPLOYEE);
        String[] array = null;
        for (String string : stringList) {
            array = string.split(",");
            Employee employee = new Employee(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8], Double.parseDouble(array[9]));
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public void delete(String id) {
        List<Employee> employeeList = getAllEmployee();
        for (int i = 0; i < employeeList.size(); i++) {
            if(employeeList.get(i).getId().equals(id)){
                employeeList.remove(i);
            }
        }
        List <String> stringList = new ArrayList<>();
        for (Employee employee:employeeList) {
            stringList.add(employee.getInforToCsv());
        }
        ReadAndWriteData.writeToCsv(FILE_PATH_EMPLOYEE,stringList,false);
    }

    @Override
    public List <Employee> searchByName(String name) {
        List <Employee> employeeList = getAllEmployee();
        List <Employee> employees = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            if(employeeList.get(i).getName().contains(name)){
                employees.add(employeeList.get(i));
            }
        }
        return employeeList;
    }

    @Override
    public void updateEmployee(String id, Employee employee) {
        List <Employee> employeeList = getAllEmployee();
        for (int i = 0; i < employeeList.size(); i++) {
            if(employeeList.get(i).getId().equals(employee.getId())){
               employeeList.set(i,employee).setName(employeeList.get(i).getName());
               employeeList.set(i,employee).setDate(employeeList.get(i).getDate());
               employeeList.set(i,employee).setGender(employeeList.get(i).getGender());
               employeeList.set(i,employee).setPhoneNumber(employeeList.get(i).getPhoneNumber());
               employeeList.set(i,employee).setIdentityNumber(employeeList.get(i).getIdentityNumber());
               employeeList.set(i,employee).setEmail(employeeList.get(i).getEmail());
               employeeList.set(i,employee).setLevel(employeeList.get(i).getLevel());
               employeeList.set(i,employee).setPosition(employeeList.get(i).getPosition());
               employeeList.set(i,employee).setLevel(employeeList.get(i).getLevel());
            }
        }
        List <String> stringList = new ArrayList<>();
        for (Employee employee1: employeeList) {
            stringList.add(employee1.getInforToCsv());
        }
        ReadAndWriteData.writeToCsv(FILE_PATH_EMPLOYEE,stringList,false);
    }

    @Override
    public Employee getEmployeeById(String id) {
        List <Employee> employeeList = getAllEmployee();
        for (Employee employee:employeeList) {
            if(employee.getId().equals(id)){
                return employee;
            }
        }
        return null;
    }
}


