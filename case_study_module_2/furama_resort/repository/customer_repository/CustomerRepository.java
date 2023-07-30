package case_study_module_2.furama_resort.repository.customer_repository;

import case_study_module_2.furama_resort.common.ReadAndWriteData;
import case_study_module_2.furama_resort.model.person.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String FILE_PATH_CUSTOMER = "D:\\C0523G1_Nguyen_Chinh_Dat_Module_2\\case_study_module_2\\furama_resort\\data\\customer.csv";

    @Override
    public void add(Customer customer) {
        List <String> stringList = new ArrayList<>();
        stringList.add(customer.getInforToCsv());
        ReadAndWriteData.writeToCsv(FILE_PATH_CUSTOMER,stringList,true);
    }

    @Override
    public List<Customer> getAllCustomer() {
        List <String> stringList = ReadAndWriteData.readFromCSV(FILE_PATH_CUSTOMER);
        List <Customer> customerList = new ArrayList<>();
        String array [] = null;
        for (String string : stringList ) {
            array = string.split(",");
            Customer customer = new Customer(array[0],array[1],array[2],array[3],array[4],array[5],array[6],array[7],array[8]);
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public Customer getCustomerById(String id) {
        List <Customer> customers = getAllCustomer();
        for (Customer customer: customers) {
            if(customer.getId().equals(id)){
                return customer;
            }
        }
        return null;
    }
    public Customer getCustomerByEmail(String email){
        List <Customer> customers = getAllCustomer();
        for (Customer customer:customers) {
            if(customer.getEmail().equals(email)){
                return customer;
            }
        }
        return null;
    }

    @Override
    public void delete(String id) {
        List<Customer> customerList = getAllCustomer();
        for (int i = 0; i < customerList.size(); i++) {
            if(customerList.get(i).getId().equals(id)){
                customerList.remove(i);
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Customer customer: customerList ) {
            stringList.add(customer.getInforToCsv());
        }
        ReadAndWriteData.writeToCsv(FILE_PATH_CUSTOMER,stringList,false);
    }

    @Override
    public void updateCustomer(String id, Customer customer) {
        List<Customer> customers = getAllCustomer();
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getId().equals(id)){
                customers.set(i,customer).setName(customer.getName());
                customers.set(i,customer).setDate(customer.getDate());
                customers.set(i,customer).setGender(customer.getGender());
                customers.set(i,customer).setPhoneNumber(customer.getPhoneNumber());
                customers.set(i,customer).setIdentityNumber(customer.getIdentityNumber());
                customers.set(i,customer).setEmail(customer.getEmail());
                customers.set(i,customer).setType(customer.getType());
                customers.set(i,customer).setAddress(customer.getAddress());
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Customer customer1: customers) {
            stringList.add(customer1.getInforToCsv());
        }
        ReadAndWriteData.writeToCsv(FILE_PATH_CUSTOMER,stringList,false);
    }

    @Override
    public List<Customer> searchByName(String name) {
        List <Customer> customerList = getAllCustomer();
        List<Customer> customerSearch = new ArrayList<>();
        for (int i = 0; i < customerList.size(); i++) {
            if(customerList.get(i).getName().contains(name)){
            customerSearch.add(customerList.get(i));
            }
        }
        return customerSearch;
    }

    @Override
    public Customer getCustomerByPhoneNumber(String phoneNumber) {
        List <Customer> customers = getAllCustomer();
        for (Customer customer:customers) {
            if(customer.getPhoneNumber().equals(phoneNumber)){
                return customer;
            }
        }
        return null;
    }

    @Override
    public Customer getCustomerByIdentityNumber(String identityNumber) {
        List <Customer> customers = getAllCustomer();
        for (Customer customer:customers) {
            if(customer.getIdentityNumber().equals(identityNumber)){
                return customer;
            }
        }
        return null;
    }
}
