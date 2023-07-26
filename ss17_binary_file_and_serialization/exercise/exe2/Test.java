package ss17_binary_file_and_serialization.exercise.exe2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String filePath = "D:\\C0523G1_Nguyen_Chinh_Dat_Module_2\\ss17_binary_file_and_serialization\\exercise\\exe2\\";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a file name you want to copoy");
        String fileNameCopy =filePath + input.nextLine();
        System.out.println("Enter a file name you want to paste");
        String fileNamePaste =filePath + input.nextLine();
        CopyFile copyFile = new CopyFile();
        copyFile.copyFile(fileNamePaste,fileNameCopy);
        ReadAndWriteData readAndWriteData = new ReadAndWriteData();
    }
}
