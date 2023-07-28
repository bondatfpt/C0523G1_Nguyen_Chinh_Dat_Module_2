package case_study_module_2.repository;

import case_study_module_2.model.person.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository {
    void add(Employee employee);
    List <String> getAllEmployee();
    void delete(int id);
}
