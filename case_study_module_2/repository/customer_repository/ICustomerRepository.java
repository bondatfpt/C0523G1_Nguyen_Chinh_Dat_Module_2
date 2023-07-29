package case_study_module_2.repository.customer_repository;


import case_study_module_2.model.person.Customer;

import java.util.List;

public interface ICustomerRepository {
    void add (Customer customer);
    List <Customer> getAllCustomer();
    Customer getCustomerById(String id);
    void delete(String id);
    void updateCustomer(String id, Customer customer);
    List<Customer> searchByName(String name);
}
