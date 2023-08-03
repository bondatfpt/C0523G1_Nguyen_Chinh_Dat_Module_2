package algorithm.service;

import algorithm.common.validate.ValidateProduct;
import algorithm.model.Product;
import algorithm.repo.IRepo;
import algorithm.repo.Repository;
import algorithm.utils.exception.IdAlreadyExistException;
import algorithm.utils.exception.IdNotFoundException;
import algorithm.utils.exception.NameProductAlreadyExistException;

import java.util.List;
import java.util.Scanner;

public class Service implements IService {
    private static Scanner input = new Scanner(System.in);
    private static IRepo repo = new Repository();

    @Override
    public void add() {
        System.out.println("Enter an id");
        String id = "";
        boolean checkId = false;
        do {
            id = input.nextLine();
            try {
                checkId = ValidateProduct.validateIdToAdd(id);
            } catch (IdAlreadyExistException e) {
                System.out.println(e.getMessage());
            }

        } while (!checkId);

        System.out.println("Enter a name");
        String name = "";
        boolean checkName = false;
        do {
            try {
                name = input.nextLine();
                checkName = ValidateProduct.validateName(name);
            } catch (NameProductAlreadyExistException nameProductAlreadyExistException) {
                System.out.println(nameProductAlreadyExistException.getMessage());
            }
        } while (!checkName);

        System.out.println("Enter price");
        double price = 0;
        do {
            try {
                price = Double.parseDouble(input.nextLine());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Price must be a real number.");
            }
        } while (price <= 0);
        String place = "";
        int choicePlace = 0;
        do {
            System.out.println("Choose place");
            System.out.println("1. Da Nang");
            System.out.println("2. Sai Gon");
            System.out.println("3. Ha Noi");
            choicePlace = Integer.parseInt(input.nextLine());
            switch (choicePlace) {
                case 1:
                    place = "Da Nang";
                    break;
                case 2:
                    place = "Sai Gon";
                    break;
                case 3:
                    place = "Sai Gon";
                    break;
            }
        } while (place.equals(""));

        Product product = new Product(id, name, price, place);
        repo.add(product);
        System.out.println("Successfully added product have id: " + id);
        display();
    }

    @Override
    public void display() {
        List<Product> productList;
        try {
            productList = repo.getAllProduct();
            if (productList.isEmpty()) {
                System.out.println("List is empty");
            } else {
                for (Product product : productList) {
                    System.out.println(product.getInforToCsv());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void update() {
        System.out.println("Enter an id");
        String id = "";
        boolean checkId = false;
        do {
            id = input.nextLine();
            try {
                checkId = ValidateProduct.validateIdToRemoveOrUpDate(id);
            } catch (IdNotFoundException e) {
                System.out.println(e.getMessage());
            }
        } while (!checkId);

        System.out.println("Enter a name");
        String name = "";
        boolean checkName = false;
        do {
            name = input.nextLine();
            try {
                checkName = ValidateProduct.validateName(name);
            } catch (NameProductAlreadyExistException e) {
                System.out.println(e.getMessage());
            }
        } while (!checkName);

        System.out.println("Enter price");
        double price = 0;
        do {
            try {
                price = Double.parseDouble(input.nextLine());
                if (price <= 0) {
                    System.out.println("Price must be greater than 0");
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Price must be a real number");
            }
        } while (price <= 0);

        String place = "";
        int choicePlace = 0;
        do {
            System.out.println("Choose place");
            System.out.println("1. Da Nang");
            System.out.println("2. Sai Gon");
            System.out.println("3. Ha Noi");
            choicePlace = Integer.parseInt(input.nextLine());
            switch (choicePlace) {
                case 1:
                    place = "Da Nang";
                    break;
                case 2:
                    place = "Sai Gon";
                    break;
                case 3:
                    place = "Sai Gon";
                    break;
            }
        } while (place.equals(""));

        Product product = new Product(id, name, price, place);
        repo.update(product, id);
        System.out.println("Successfully updated product have id " + id);
        display();
    }

    public void delete (){
        System.out.println("Enter an id");
        String id = "";
        boolean checkId = false;
        do {
            id = input.nextLine();
            try {
                checkId = ValidateProduct.validateIdToRemoveOrUpDate(id);
            } catch (IdNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }while (!checkId);
        int choiceDelete = 0;
        do {
            System.out.println("Do you really want to delete this product?");
            System.out.println("1. Yes");
            System.out.println("1. No");
            choiceDelete = Integer.parseInt(input.nextLine());
            switch (choiceDelete){
                case 1:
                    repo.delete(id);
                    System.out.println("Successfully delete product have id " + id);
                    display();
                    break;
                case 2:
                    break;
            }
        }while (choiceDelete != 1 && choiceDelete !=2);
    }
}
