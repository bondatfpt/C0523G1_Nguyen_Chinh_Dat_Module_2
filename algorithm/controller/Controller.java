package algorithm.controller;


import algorithm.service.IService;
import algorithm.service.Service;

import java.util.Scanner;

public class Controller {
    private static IService service = new Service();
    private static Scanner input = new Scanner(System.in);
    public static void showMenu() {
        int select = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. Display");
            System.out.println("2. Add");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            try {
                select = Integer.parseInt(input.nextLine());
                switch (select) {
                    case 1:
                        service.display();
                        break;
                    case 2:
                        service.add();
                        break;
                    case 3:
                        service.update();
                        break;
                    case 4:
                        service.delete();
                        break;
                    case 5:
                        System.exit(5);
                }
            }catch (NumberFormatException numberFormatException){
                System.out.println("Enter a number to choice");
            }
        }while (true);
    }
}
