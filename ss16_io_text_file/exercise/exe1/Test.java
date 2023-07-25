package ss16_io_text_file.exercise.exe1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a target file");
        String targetFile = input.nextLine();
        final String filePathRead = "D:\\C0523G1_Nguyen_Chinh_Dat_Module_2\\ss16_io_text_file\\exercise\\exe1\\source_file.csv" ;
        final String filePathCopy = "D:\\C0523G1_Nguyen_Chinh_Dat_Module_2\\ss16_io_text_file\\exercise\\exe1\\" + targetFile ;
        CopyFileText copyFileText = new CopyFileText();
        copyFileText.copyFileText(filePathCopy,filePathRead);
    }
}

