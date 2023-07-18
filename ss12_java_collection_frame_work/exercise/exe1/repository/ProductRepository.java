package ss12_java_collection_frame_work.exercise.exe1.repository;

import ss12_java_collection_frame_work.exercise.exe1.model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    private static ArrayList<Product> productArrayList = new ArrayList<Product>();

    static {
        Product product1 = new Product(1, "IPhone", 200);
        Product product2 = new Product(2, "SamSung", 200);
        Product product3 = new Product(3, "Nokia", 200);
        productArrayList.add(product1);
        productArrayList.add(product2);
        productArrayList.add(product3);
    }

    Scanner input = new Scanner(System.in);

}
