package algorithm.repo;


import algorithm.model.Product;
import algorithm.common.Read;
import algorithm.common.Write;

import java.util.ArrayList;
import java.util.List;

public class Repository implements IRepo {
    private static final String FILE_PATH = "D:\\C0523G1_Nguyen_Chinh_Dat_Module_2\\algorithm\\data\\product.csv";
    public List<Product> getAllProduct(){
        List<String> strings = Read.readData(FILE_PATH);
        List <Product> productList = new ArrayList<>();
        String [] arrString = null;
        for (String infor:strings) {
            arrString = infor.split(",");
            Product product1 = new Product(arrString[0],arrString[1],Double.parseDouble(arrString[2]),arrString[3]);
            productList.add(product1);
        }
        return productList;
    }

    @Override
    public void add(Product product) {
        List<String> strings = new ArrayList<>();
        strings.add(product.getInforToCsv());
        Write.writeData(strings,FILE_PATH,true);
    }

    @Override
    public Product getProductById(String id) {
        List<Product> productList = getAllProduct();
        for (Product product :productList) {
            if(product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }

    @Override
    public Product getProductByName(String name) {
        List<Product> productList = getAllProduct();
        for (Product product:productList) {
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(Product product, String id) {
        List<Product> productList = getAllProduct();
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId().equals(id)){
                productList.set(i,product);
            }
        }
        List<String> strings = new ArrayList<>();
        for (Product product1: productList) {
            strings.add(product1.getInforToCsv());
        }
        Write.writeData(strings,FILE_PATH,false);
    }

    public void delete (String id){
        List <Product> productList = getAllProduct();
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId().equals(id)){
                productList.remove(i);
            }
        }
        List<String> list = new ArrayList<>();
        for (Product product:productList) {
            list.add(product.getInforToCsv());
        }
        Write.writeData(list,FILE_PATH,false);

    }
}
