package ss16_io_text_file.practice.exe2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\C0523G1_Nguyen_Chinh_Dat_Module_2\\ss16_io_text_file\\practice\\exe2\\numbers.txt");
        FindMaxValue findMaxValue = new FindMaxValue();
        int maxValue = findMaxValue.findMaxValue(numbers);
        readAndWriteFile.writeFile("D:\\C0523G1_Nguyen_Chinh_Dat_Module_2\\ss16_io_text_file\\practice\\exe2\\result1.txt",maxValue);
    }
}
