package case_study_module_2.furama_resort.repository.employee_repository;

import case_study_module_2.furama_resort.model.person.Employee;
import case_study_module_2.furama_resort.repository.IRepository;

import java.util.List;

public interface IEmployeeRepository extends IRepository {
    void add(Employee employee);
    List <Employee> getAllEmployee();
    void delete(String id);
    List<Employee> searchByName(String name);
    void updateEmployee(String id,Employee employee);
    Employee getEmployeeById(String id);
}
