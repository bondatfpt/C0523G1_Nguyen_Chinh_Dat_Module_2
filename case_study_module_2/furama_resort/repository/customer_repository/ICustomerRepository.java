package case_study_module_2.furama_resort.repository.customer_repository;


import case_study_module_2.furama_resort.model.person.Customer;
import case_study_module_2.furama_resort.repository.IRepository;

import java.util.List;

public interface ICustomerRepository extends IRepository {
    void add (Customer customer);
    List <Customer> getAllCustomer();
    Customer getCustomerById(String id);
    void delete(String id);
    void updateCustomer(String id, Customer customer);
    List<Customer> searchByName(String name);
}
