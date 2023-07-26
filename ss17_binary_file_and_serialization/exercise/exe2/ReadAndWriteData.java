package ss17_binary_file_and_serialization.exercise.exe2;

import javax.imageio.IIOException;
import java.io.*;
import java.util.List;

public class ReadAndWriteData {
    public List <String> readDataFromFile(String filePath){
        List <String> stringList = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            stringList = (List<String>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found !");
        }catch (IOException e){
            System.out.println("Error content !");
        }catch (ClassNotFoundException e){
            System.out.println("Class not found !");
        }
        return stringList;
    }

    public void writeDataToFile (List<String> stringList, File file){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(stringList);
            objectOutputStream.close();
            fileOutputStream.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found !");
        }catch (IOException e){
            System.out.println("Error content !");
        }
    }
}
