package case_study_module_2.repository.impl;

import case_study_module_2.common.ReadAndWriteData;
import case_study_module_2.model.person.Employee;
import case_study_module_2.repository.IEmployeeRepository;

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
    public List<String> getAllEmployee() {
        List<String> result = new ArrayList<>();
        result = ReadAndWriteData.readFromCSV(FILE_PATH_EMPLOYEE);
        return result;
    }

    @Override
    public void delete(int id) {
        List<String> stringList = new ArrayList<>();
        stringList = getAllEmployee();
        for (int i = 0; i < stringList.size(); i++) {
            
        }
    }
}

