package ss16_io_text_file.practice.exe1;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            int sum = 0;
            boolean flag = false;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                try {
                    sum += Integer.parseInt(line);
                } catch (NumberFormatException e) {
                    System.err.println("Error entering number into letters");
                    flag = true;
                }
            }
            bufferedReader.close();
            if (!flag) {
                System.out.println("Sum: " + sum);
            }
        } catch (IOException e) {
            System.err.println("File not found !");
        }
    }
}
