package algorithm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Write {
    private static final String FILE_PATH = "D:\\C0523G1_Nguyen_Chinh_Dat_Module_2\\algorithm\\product.csv";
    public static void writeData (List <String> strings, String filePath, boolean append){
        File file = new File(FILE_PATH);
        try {
            FileWriter fileWriter = new FileWriter(file,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String string: strings) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"Dell1",5000,"Da nang"));
        productList.add(new Product(2,"Dell2",5000,"Da nang"));
        productList.add(new Product(3,"Dell3",5000,"Da nang"));
        productList.add(new Product(4,"Dell4",5000,"Da nang"));
        List <String> strings = new ArrayList<>();
        for (Product product:productList) {
            strings.add(product.getInforToCsv());
        }
        writeData(strings,FILE_PATH,false);

    }
}
