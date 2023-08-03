package algorithm.common;

import algorithm.model.Product;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Write {
    private static final String FILE_PATH = "D:\\C0523G1_Nguyen_Chinh_Dat_Module_2\\algorithm\\data\\product.csv";
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

}
