package algorithm.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Read {
    public static List <String> readData (String filePath){
        List <String> productList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while (true){
                try {
                    if (((line = bufferedReader.readLine())== null)) break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                productList.add(line);
            }
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }

}
