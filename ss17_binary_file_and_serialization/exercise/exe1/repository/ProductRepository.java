package ss17_binary_file_and_serialization.exercise.exe1.repository;

import ss17_binary_file_and_serialization.exercise.exe1.common.ReadAndWriteData;
import ss17_binary_file_and_serialization.exercise.exe1.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    public final static String FILE_PATH = "D:\\C0523G1_Nguyen_Chinh_Dat_Module_2\\ss17_binary_file_and_serialization\\exercise\\exe1\\data\\product.dat";

    @Override
    public List<Product> getAll() {
        List<Product> productList = new ArrayList<>();
        productList = ReadAndWriteData.readDataFromFile(FILE_PATH);
        return productList;
    }

    @Override
    public void add(Product product) {
        List<Product> productList = null;
        productList = getAll();
        productList.add(product);
        ReadAndWriteData.writeDataToFile(FILE_PATH, productList);
    }

    @Override
    public Product searchByName(String name) {
        List<Product> productList = getAll();
        Product product = null;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().contains(name)) {
               product = productList.get(i);
            }
        }
        return product;
    }
    @Override
    public void remove(int id) {
        List <Product> productList = getAll();
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId() == id){
                productList.remove(i);
            }
        }
        ReadAndWriteData.writeDataToFile(FILE_PATH,productList);
    }
}
