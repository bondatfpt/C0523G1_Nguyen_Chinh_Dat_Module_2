package case_study_module_2.furama_resort.common.validate.validate_person;

import case_study_module_2.furama_resort.model.person.Employee;
import case_study_module_2.furama_resort.repository.employee_repository.EmployeeRepository;
import case_study_module_2.furama_resort.repository.employee_repository.IEmployeeRepository;
import case_study_module_2.furama_resort.utils.exceptions.IdAlreadyExistsException;
import case_study_module_2.furama_resort.utils.exceptions.IdNotFoundException;


import java.util.Scanner;

public class ValidateIdEmployee {
    private static Scanner input = new Scanner(System.in);
    private static final String REGEX_ID_EMPLOYEE = "^NV-[0-9]{4}$";
    private static IEmployeeRepository employeeRepository = new EmployeeRepository();

    public static boolean validateIdEmployeeToAdd(String id) throws IdAlreadyExistsException {
        if (id.matches(REGEX_ID_EMPLOYEE)) {
            Employee employee = employeeRepository.getEmployeeById(id);
            if (employee == null) {
                return true;
            } else {
                throw new IdAlreadyExistsException("Id already exist.Re-enter id, please");
            }
        } else {
            System.out.println("Wrong format. Re-enter id,please.");
            return false;
        }
    }

    public static boolean validateIdEmployeeToDeleteOrUpdate(String id) throws IdNotFoundException {
                if (id.matches(REGEX_ID_EMPLOYEE)) {
                    Employee employee = employeeRepository.getEmployeeById(id);
                    if (employee == null) {
                        throw new IdNotFoundException("Id not found.Re-enter id, please");
                    } else {
                        return true;
                    }
                } else {
                    System.out.println("Wrong format. Re-enter id,please.");
                    return false;
                }
            }

    }

