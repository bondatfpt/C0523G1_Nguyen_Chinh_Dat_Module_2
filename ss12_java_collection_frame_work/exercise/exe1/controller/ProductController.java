package ss12_java_collection_frame_work.exercise.exe1.controller;

import ss12_java_collection_frame_work.exercise.exe1.service.IProductService;
import ss12_java_collection_frame_work.exercise.exe1.service.ProductService;

import java.util.Scanner;

public class ProductController {

    public static void showMenu(){
        IProductService productService = new ProductService();
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("----- Product Manager ------");
            System.out.println("1. List");
            System.out.println("2. Create");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
        choice = input.nextInt();
        switch (choice){
            case 1:
                productService.disPlayAll();
                break;
            case 2:
                productService.add();
                break;
            case 3:
                productService.removeProduct();
                break;
            case 4:
                productService.setProduct();
                break;
            case 0:
                System.exit(0);
                break;
        }
        }while (choice != 0);
    }
}
