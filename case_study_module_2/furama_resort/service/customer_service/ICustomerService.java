package case_study_module_2.furama_resort.service.customer_service;


import case_study_module_2.furama_resort.service.IService;

public interface ICustomerService extends IService {
    void display();
    void add();
    void delete();
    void update();
    void searchByName();
}
