package ss17_binary_file_and_serialization.exercise.exe1.common;
import ss17_binary_file_and_serialization.exercise.exe1.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteData {
    public static void writeDataToFile(String filePath, List<Product> productList){
        try{
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
            fos.close();
            oos.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found !");
        }catch (IOException e){
            System.out.println("Error content !!!");
        }
    }

    public static List<Product> readDataFromFile(String filePath){
        List <Product> productList = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found !");
        }catch (IOException e){
            System.out.println("Error content !");
        }catch (ClassNotFoundException e){
            System.out.println("Class not found !");
        }
        return productList;
    }
}
