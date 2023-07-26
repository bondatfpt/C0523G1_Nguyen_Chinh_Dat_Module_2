package ss16_io_text_file.exercise.exe1;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    private String filePathRead;
    private String filePathCopy;
    public List<String> readFile(String filePathRead){
        BufferedReader bufferedReader = null;
        List <String> listContentOfFile = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePathRead);
            bufferedReader = new BufferedReader(fileReader);
            String line ="";
            int count = 0;
            while ((line = bufferedReader.readLine())!= null){
                listContentOfFile.add(line);
                count += line.length();
            }
            listContentOfFile.add("Character in file is: " +count);
            bufferedReader.close();
        }catch (FileNotFoundException e){
            System.err.println("File not found !");
        }
        catch (IOException e){
            System.out.println("Can not read that !");
        }
        return listContentOfFile;
    }

    public void copyFileText(String filePathCopy, String filePathRead){
        try{
            File file = new File(filePathCopy);
            if (file.exists()){
                System.out.println("File already exists");
                return;
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (String item:readFile(filePathRead)) {
                bufferedWriter.write(item);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (IOException e) {
            System.out.println("Error content");
        }
    }
}
