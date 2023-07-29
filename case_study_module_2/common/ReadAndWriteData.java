package case_study_module_2.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteData {
    // Phương thức ghi dữ liệu vào file CSV;
    public static void writeToCsv(String filePath, List<String> strings, boolean append) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : strings) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    // Phương thức đọc dữ liệu từ file CSV;
    public static List<String> readFromCSV(String filePath) {
        List<String> contentList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
             fileReader = new FileReader(filePath);
             bufferedReader = new BufferedReader(fileReader);
            String line ="";
            while ((line = bufferedReader.readLine()) != null){
                contentList.add(line);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
                fileReader.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        return contentList;
    }
}
