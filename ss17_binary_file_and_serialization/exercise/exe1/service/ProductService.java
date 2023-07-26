package ss17_binary_file_and_serialization.exercise.exe1.service;

import ss17_binary_file_and_serialization.exercise.exe1.model.Product;
import ss17_binary_file_and_serialization.exercise.exe1.repository.IProductRepository;
import ss17_binary_file_and_serialization.exercise.exe1.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService{
    public final static String FILE_PATH = "D:\\C0523G1_Nguyen_Chinh_Dat_Module_2\\ss17_binary_file_and_serialization\\exercise\\exe1\\data\\product.dat";

    private IProductRepository productRepository = new ProductRepository();
    @Override
    public void display() {
        List <Product> productList = productRepository.getAll();
        for (Product product: productList) {
            System.out.println(product);
        }
    }
    @Override
    public void add() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a id");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Enter a name");
        String name = input.nextLine();
        System.out.println("Enter a price");
        double price = Double.parseDouble(input.nextLine());
        System.out.println("Enter a manufacturer");
        String manu = input.nextLine();
        Product product = new Product(id,name,price,manu);
        productRepository.add(product);
    }

    @Override
    public void search() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name of product you want to search.");
        String name = input.nextLine();
        productRepository.searchByName(name);
    }

    @Override
    public void remove() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an id of product you want to delete.");
        int id = Integer.parseInt(input.nextLine());
        productRepository.remove(id);
    }
}
