package case_study_module_2.service.employee_service;

import case_study_module_2.model.person.Employee;
import case_study_module_2.service.interface_service.IService;

import java.util.List;

public interface IEmployeeService extends IService {
    void add();
    void display();
    void delete();
    void searchByName();
    void update();
}
