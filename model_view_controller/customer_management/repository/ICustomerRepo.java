package model_view_controller.customer_management.repository;
import model_view_controller.customer_management.model.Customer;
import java.util.ArrayList;
import java.util.Arrays;

public interface ICustomerRepo {
    ArrayList<Customer> displayAll();
    void add(Customer e);
    void remove(int id);
    void indexOf(String name);
}
