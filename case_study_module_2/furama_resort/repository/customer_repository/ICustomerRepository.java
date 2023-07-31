package case_study_module_2.furama_resort.repository.customer_repository;


import case_study_module_2.furama_resort.model.person.Customer;

import java.util.List;

public interface ICustomerRepository  {
    void add (Customer customer);
    List <Customer> getAllCustomer();
    Customer getCustomerById(String id);
    Customer getCustomerByEmail(String email);
    Customer getCustomerByPhoneNumber(String phoneNumber);
    Customer getCustomerByIdentityNumber(String identityNumber);
    void delete(String id);
    void updateCustomer(String id, Customer customer);
    List<Customer> searchByName(String name);

}
