package model_view_controller.customer_management.service;
import java.util.ArrayList;
import model_view_controller.customer_management.model.Customer;

public interface ICustomerService {
    ArrayList<Customer> displayAll();
    void add(Customer e);
    void remove(int id);
    void findCustomer(String name);
}
