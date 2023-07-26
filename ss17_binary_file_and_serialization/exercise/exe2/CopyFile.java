package ss17_binary_file_and_serialization.exercise.exe2;

import java.io.File;
import java.util.List;

public class CopyFile {
    public void copyFile (String filePathCopy,String filePathRead){
        File fileRead = new File(filePathRead);
        File fileCopy = new File(filePathCopy);
        ReadAndWriteData readAndWriteData = new ReadAndWriteData();
        List<String> stringList = readAndWriteData.readDataFromFile(filePathRead);
        readAndWriteData.writeDataToFile(stringList,fileCopy);
    }
}
