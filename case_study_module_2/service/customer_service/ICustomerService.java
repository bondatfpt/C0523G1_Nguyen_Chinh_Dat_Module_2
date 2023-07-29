package case_study_module_2.service.customer_service;


import case_study_module_2.model.person.Customer;

import java.util.List;
import java.util.function.LongConsumer;

public interface ICustomerService {
    void display();
    void add();
    void delete();
    void update();
    void searchByName();
}
