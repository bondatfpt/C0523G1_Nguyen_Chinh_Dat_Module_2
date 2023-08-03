package algorithm.repo;


import algorithm.model.Product;

import java.util.List;

public interface IRepo {
    void add(Product product);
    List<Product> getAllProduct();
    Product getProductById(String id);
    void update(Product product,String id);
    void delete(String id);
    Product getProductByName(String name);
}
