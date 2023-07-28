package case_study_module_2.repository.employee_repository;

import case_study_module_2.model.person.Employee;
import case_study_module_2.repository.interface_repository.IRepository;

import java.util.List;

public interface IEmployeeRepository extends IRepository {
    void add(Employee employee);
    List <Employee> getAllEmployee();
    void delete(int id);
    List<Employee> searchByName(String name);
    void updateEmployee(int id,Employee employee);
}
