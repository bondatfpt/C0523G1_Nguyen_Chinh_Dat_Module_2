package model_view_controller.customer_management.repository;
import model_view_controller.customer_management.model.Customer;
import java.util.ArrayList;

public interface ICustomerRepo {
    ArrayList<Customer> displayAll();
    void add(Customer e);
    void remove(int id);
    void findCustomer(String name);
}
