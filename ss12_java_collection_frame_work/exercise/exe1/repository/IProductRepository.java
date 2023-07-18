package ss12_java_collection_frame_work.exercise.exe1.repository;

import ss12_java_collection_frame_work.exercise.exe1.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductRepository {
    List<Product> getAllProduct();
    void add(Product product);
    Product setProduct(int id,Product product);
    void removeProduct(int id);
    void findProduct(String name);
    List<Product> sortByPriceAscending();
    List<Product> sortByPriceDescending();

}
