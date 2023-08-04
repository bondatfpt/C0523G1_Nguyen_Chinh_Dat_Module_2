package case_study_module_2.furama_resort.common.comparator;

import case_study_module_2.furama_resort.model.person.Customer;

import java.util.Comparator;

public class SortCustomerByIdAscending implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        String id1 = c1.getId().substring(3, c1.getId().length());
        String id2 = c2.getId().substring(3, c2.getId().length());
        int idSub1 = Integer.valueOf(id1);
        int idSub2 = Integer.valueOf(id2);
        if (idSub1 > idSub2) {
            return 1;
        } else if (idSub1 == idSub2) {
            return 0;
        } else {
            return -1;
        }
    }
}
