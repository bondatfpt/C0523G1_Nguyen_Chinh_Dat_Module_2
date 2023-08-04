package case_study_module_2.furama_resort.common.comparator;

import case_study_module_2.furama_resort.model.person.Employee;

import java.util.Comparator;

public class SortEmployeeByIdAscending implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        String id1 = e1.getId().substring(3,e1.getId().length());
        String id2 = e2.getId().substring(3,e2.getId().length());
        int idSub1 = Integer.valueOf(id1);
        int idSub2 = Integer.valueOf(id2);
        if(idSub1 > idSub2 ){
            return 1;
        }else if(idSub1 == idSub2){
            return 0;
        }else {
            return -1;
        }
    }
}
