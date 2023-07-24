package ss12_java_collection_frame_work.exercise.exe1.service;
import ss12_java_collection_frame_work.exercise.exe1.repository.ProductRepository;
import ss12_java_collection_frame_work.exercise.exe1.repository.IProductRepository;
import ss12_java_collection_frame_work.exercise.exe1.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();

    private int checkId(int id) {
        for (int i = 0; i < productRepository.getAllProduct().size(); i++) {
            if (productRepository.getAllProduct().get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    private int checkName(String name) {
        for (int i = 0; i < productRepository.getAllProduct().size(); i++) {
            if (productRepository.getAllProduct().get(i).getName().contains(name)) {
                return 1;
            }
        }
        return -1;
    }

    @Override
    public void disPlayAll() {
        List<Product> productList = productRepository.getAllProduct();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void add() {
        Scanner input = new Scanner(System.in);
        int idAdd = 0;
        do {
            System.out.println("Enter an id");
            idAdd = Integer.parseInt(input.nextLine());
            if (checkId(idAdd) != -1) {
                System.out.println("Id: " + idAdd + " already exist - Please re-enter");
            }
        } while (checkId(idAdd) != -1);
        System.out.println("Enter a name");
        String nameAdd = input.nextLine();
        System.out.println("Enter a price");
        double priceAdd = input.nextDouble();
        productRepository.add(new Product(idAdd, nameAdd, priceAdd));
    }

    @Override
    public void setProduct() {
        Scanner input = new Scanner(System.in);
        int idSet = 0;
        do {
            System.out.println("Enter an id you want to update");
            idSet = Integer.parseInt(input.nextLine());
            if (checkId(idSet) == -1) {
                System.out.println("Not found product have id: " + idSet + " - " + "Please re-enter");
            }
        } while (checkId(idSet) == -1);
        System.out.println("Enter a new name");
        String newName = input.nextLine();
        System.out.println("Enter a new price");
        double newPrice = input.nextDouble();
        Product product = new Product(idSet, newName, newPrice);
        productRepository.setProduct(idSet, product);
    }

    @Override
    public void removeProduct() {
        Scanner input = new Scanner(System.in);
        int idRemove = 0;
        do {
            System.out.println("Enter an id of product you want to remove");
            idRemove = input.nextInt();
            if (checkId(idRemove) == -1) {
                System.out.println("Not found product have id: " + idRemove + " - " + "Please re-enter.");
            }
        } while (checkId(idRemove) == -1);
        productRepository.removeProduct(idRemove);
    }

    @Override
    public void findProduct() {
        Scanner input = new Scanner(System.in);
        String nameSearch;
        do {
            System.out.println("Enter a name");
            nameSearch = input.nextLine();
            if(checkName(nameSearch) == -1){
                System.out.println("Not found product");
            }
        }while (checkName(nameSearch) == -1);
        productRepository.findProduct(nameSearch);
    }

    @Override
    public void sortByPriceAscending() {
        List<Product> productList = productRepository.sortByPriceAscending();
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    @Override
    public void sortByPriceDescending() {
        List<Product> productList = productRepository.sortByPriceDescending();
        for (Product p : productList) {
            System.out.println(p);
        }
    }
}
