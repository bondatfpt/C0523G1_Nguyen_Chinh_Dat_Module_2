package ss17_binary_file_and_serialization.exercise.exe1.repository;

import ss17_binary_file_and_serialization.exercise.exe1.model.Product;

import java.util.List;

public interface IProductRepository {
     List <Product> getAll();
     void add(Product product);
     Product  searchByName (String name);
      void remove(int id);
}
