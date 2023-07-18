package ss12_java_collection_frame_work.exercise.exe1.service;

import ss12_java_collection_frame_work.exercise.exe1.repository.ProductRepository;
import ss12_java_collection_frame_work.exercise.exe1.repository.IProductRepository;
import ss12_java_collection_frame_work.exercise.exe1.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();

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
        System.out.println("Enter an id");
        int idAdd = Integer.parseInt(input.nextLine());
        System.out.println("Enter a name");
        String nameAdd = input.nextLine();
        System.out.println("Enter a price");
        double priceAdd = input.nextDouble();
        productRepository.add(new Product(idAdd, nameAdd, priceAdd));
    }

    @Override
    public void setProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an id of product you want to update");
        int idSet = Integer.parseInt(input.nextLine());
        System.out.println("Enter a new name");
        String newName = input.nextLine();
        System.out.println("Enter a new price");
        double newPrice = input.nextDouble();
        productRepository.setProduct(idSet);
    }

    @Override
    public void removeProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an id of product you want to remove");
        int idRemove = input.nextInt();
        productRepository.removeProduct(idRemove);
    }

    @Override
    public void findProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name");
        String nameSearch = input.nextLine();
        productRepository.findProduct(nameSearch);
    }

    @Override
    public void sortByPriceAscending() {
        List<Product> productList =productRepository.sortByPriceAscending();
        for (Product p: productList) {
            System.out.println(p);
        }
    }

    @Override
    public void sortByPriceDescending() {
        List<Product> productList = productRepository.sortByPriceDescending();
        for (Product p: productList){
            System.out.println(p);
        }
    }
}
