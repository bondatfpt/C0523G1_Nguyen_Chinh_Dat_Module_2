package case_study_module_2.furama_resort.service.employee_service;

import case_study_module_2.furama_resort.service.IService;

public interface IEmployeeService extends IService {
    void add();
    void display();
    void delete();
    void searchByName();
    void update();

}
