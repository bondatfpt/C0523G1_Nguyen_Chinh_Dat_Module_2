package case_study_module_2.controller;

import case_study_module_2.service.employee_service.IEmployeeService;
import case_study_module_2.service.employee_service.EmployeeService;

import java.util.Scanner;

public class FuramaController {
    private static IEmployeeService employeeService = new EmployeeService();

    public static void showMenu() {
        int select;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Menu: ");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            System.out.println("Enter your select");
            select = Integer.parseInt(input.nextLine());
            switch (select) {
                case 1:
                    int choiceEmployee;
                    do {
                        System.out.println("1.Display list employees");
                        System.out.println("2.Add new employee");
                        System.out.println("3.Edit employee");
                        System.out.println("4.Delete employee");
                        System.out.println("5.Search by name employee");
                        System.out.println("6.Return main menu");
                        System.out.println("Enter your choice");
                        choiceEmployee = Integer.parseInt(input.nextLine());
                        switch (choiceEmployee) {
                            case 1:
                                employeeService.display();
                                break;
                            case 2:
                                employeeService.add();
                                break;
                            case 3:
                                employeeService.update();
                                break;
                            case 4:
                                employeeService.delete();
                                break;
                            case 5:
                                employeeService.searchByName();
                                break;
                            case 6:
                                break;
                        }
                    } while (choiceEmployee != 6);
                    break;
                case 2:
                    int choiceCustomer;
                    do {
                        System.out.println("1.Display list customer");
                        System.out.println("2.Add new customer");
                        System.out.println("3.Edit customer");
                        System.out.println("4.Delete customer");
                        System.out.println("5.Search by name customer");
                        System.out.println("6.Return main menu");
                        System.out.println("Enter your choice");
                        choiceCustomer = Integer.parseInt(input.nextLine());
                        switch (choiceCustomer) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                        }
                    } while (choiceCustomer != 6);
                    break;
                case 3:
                    int choiceFacility;
                    do {
                        System.out.println("1.Display list facility");
                        System.out.println("2.Add new facility");
                        System.out.println("3.Display list facility maintenance");
                        System.out.println("4.Delete facility");
                        System.out.println("5.Return main menu");
                        System.out.println("Enter your choice");
                        choiceFacility = Integer.parseInt(input.nextLine());
                        switch (choiceFacility) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                        }
                    } while (choiceFacility != 5);
                    break;
                case 4:
                    int choiceBooking;
                    do {
                        System.out.println("1.\tAdd new booking");
                        System.out.println("2.\tDisplay list booking");
                        System.out.println("3.\tCreate new contracts");
                        System.out.println("4.\tDisplay list contracts");
                        System.out.println("5.\tEdit contracts");
                        System.out.println("6.\tReturn main menu");
                        System.out.println("Enter your choice");
                        choiceBooking = Integer.parseInt(input.nextLine());
                        switch (choiceBooking) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                        }
                    } while (choiceBooking != 6);
                    break;
                case 5:
                    int choicePromotion;
                    do {
                        System.out.println("1.\tDisplay list customers use service");
                        System.out.println("2.\tDisplay list customers get voucher");
                        System.out.println("3.\tReturn main menu");
                        choicePromotion = Integer.parseInt(input.nextLine());
                        switch (choicePromotion) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                    } while (choicePromotion != 3);
                    break;
                case 6:
                    System.exit(0);
            }
        } while (select != 6);
    }
}
