package ss12_java_collection_frame_work.exercise.exe1.repository;

import ss12_java_collection_frame_work.exercise.exe1.Common.SortByPriceAscending;
import ss12_java_collection_frame_work.exercise.exe1.Common.SortByPriceDescending;
import ss12_java_collection_frame_work.exercise.exe1.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    private static List<Product> productArrayList = new ArrayList<Product>();

    static {
        Product product1 = new Product(1, "IPhone", 300);
        Product product2 = new Product(2, "SamSung", 250);
        Product product3 = new Product(3, "Nokia", 150);
        productArrayList.add(product1);
        productArrayList.add(product2);
        productArrayList.add(product3);
    }

    @Override
    public List<Product> getAllProduct() {
        return productArrayList;
    }

    @Override
    public void add(Product product) {
        productArrayList.add(product);
    }

    public Product setProduct(int id, Product product) {
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == id) {
                productArrayList.set(i, product).setName(productArrayList.get(i).getName());
                productArrayList.set(i, product).setPrice(productArrayList.get(i).getPrice());
            }
        }
        return product;
    }
    @Override
    public void removeProduct(int id) {
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == id) {
                productArrayList.remove(i);
            }
        }
    }
    @Override
    public void findProduct(String name) {
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getName().contains(name)) {
                System.out.println(productArrayList.get(i));
            }
        }
    }

    @Override
    public List<Product> sortByPriceAscending() {
        SortByPriceAscending sortByPriceAscending = new SortByPriceAscending();
        Collections.sort(productArrayList, sortByPriceAscending);
        return productArrayList;
    }

    @Override
    public List<Product> sortByPriceDescending() {
        SortByPriceDescending sortByPriceDescending = new SortByPriceDescending();
        Collections.sort(productArrayList, sortByPriceDescending);
        return productArrayList;
    }
}
