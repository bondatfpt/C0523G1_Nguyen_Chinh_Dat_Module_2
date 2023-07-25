package ss16_io_text_file.exercise.exe2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    public  List <Country> readCountryCSV(String filePath) {
        List <Country> countryList = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!= null){
               String [] wordArr = line.split(" ");
               String id = wordArr[0];
               String code = wordArr[1];
               String name = wordArr[2];

               Country country = new Country(id,code,name);
               countryList.add(country);
            }

        }catch (FileNotFoundException e){
            System.out.println("File not found !");
        }catch (IOException e){
            System.out.println("Error content !");
        }
        return countryList;
    }
}
