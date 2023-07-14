package model_view_controller.customer_management.service;
import java.util.ArrayList;
import java.util.Arrays;
import model_view_controller.customer_management.repository.CustomerRepo;
import model_view_controller.customer_management.repository.ICustomerRepo;
import model_view_controller.customer_management.model.Customer;

public class CustomerService implements ICustomerService {
    private ICustomerRepo repository = new CustomerRepo();

    @Override
    public ArrayList<Customer> displayAll() {
        return repository.displayAll();
    }

    @Override
    public void add(Customer e) {
        repository.add(e);
    }

    @Override
    public void remove(int id) {
        repository.remove(id);
    }

    @Override
    public void indexOf(String name) {
        repository.indexOf(name);
    }
}
