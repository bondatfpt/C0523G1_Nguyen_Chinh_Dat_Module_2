package ss12_java_collection_frame_work.exercise.exe1.repository;

import ss12_java_collection_frame_work.exercise.exe1.model.Product;

import java.util.ArrayList;
import java.util.List;
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
    @Override
    public List<Product> getAllProduct() {
        return productArrayList;
    }
    @Override
    public void add(Product product) {
        productArrayList.add(product);
    }
    @Override
    public void setProduct(int id,Product p) {
        for (Product product:productArrayList) {
            if(product.getId() == id){
                product.setName(product.getName());
                product.setPrice(product.getPrice());
                break;
            }
        }
    }
    @Override
    public void removeProduct(int id) {
        for (Product product1:productArrayList) {
            if(product1.getId() == id){
                productArrayList.remove(product1);
            }
        }
    }
    @Override
    public void findProduct(String name) {
        for (int i = 0; i < productArrayList.size(); i++) {
            if(productArrayList.get(i).getName().contains(name)){
                productArrayList.get(i);
            }
        }
    }
}
