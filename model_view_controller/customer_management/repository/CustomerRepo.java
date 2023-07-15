package model_view_controller.customer_management.repository;

import java.util.ArrayList;
import java.util.Arrays;
import model_view_controller.customer_management.model.Customer;

public class CustomerRepo implements ICustomerRepo {
    private static ArrayList<Customer> customerArrayList = new ArrayList<>(10);
    private static int size;
    static {
        Customer customer1 = new Customer(1,"Mark",24,"VIP");
        Customer customer2 = new Customer(2,"Duc",24,"VIP");
        Customer customer3 = new Customer(3,"Dat",24,"VIP");
        Customer customer4 = new Customer(4,"Phom",24,"VIP");
        Customer customer5 = new Customer(5,"Loc",24,"VIP");
        customerArrayList.add(0,customer1);
        customerArrayList.add(1,customer2);
        customerArrayList.add(2,customer3);
        customerArrayList.add(3,customer4);
        customerArrayList.add(4,customer5);
        size = 5;
    }
    @Override
    public ArrayList<Customer> displayAll() {
        return customerArrayList;
    }
    @Override
    public void add(Customer e) {
        customerArrayList.add(e);
    }
    @Override
    public void remove(int id) {
        for (int i = 0; i < customerArrayList.size(); i++) {
         if (customerArrayList.get(i).getId() == id){
                customerArrayList.remove(i);
                break;
         }
        }
    }
    @Override
    public void indexOf(String name) {
        for (int i = 0; i < customerArrayList.size(); i++) {
            if(customerArrayList.get(i).getName().contains(name)){
                System.out.println(customerArrayList.get(i));
            }
        }
    }
}
