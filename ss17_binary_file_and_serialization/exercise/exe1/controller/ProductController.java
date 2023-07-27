package ss17_binary_file_and_serialization.exercise.exe1.controller;
import ss17_binary_file_and_serialization.exercise.exe1.service.IProductService;
import ss17_binary_file_and_serialization.exercise.exe1.service.ProductService;

import java.util.Scanner;

public class ProductController {

    public static void showMenu1(){
        IProductService productService = new ProductService();
        Scanner input = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1.Display list");
        System.out.println("2.Add");
        System.out.println("3.Find");
        System.out.println("4.Delete");
        System.out.println("0.Exit");
        int select;
        do {
            System.out.println("Enter your choice");
            select = Integer.parseInt(input.nextLine());
            switch (select){
                case 1:
                    productService.display();
                    break;
                case 2:
                    productService.add();
                    break;
                case 3:
                    productService.search();
                    break;
                case 4:
                    productService.remove();
                    break;
                case 0:
                    System.exit(0);
            }
        }while (select != 0);
    }
}
