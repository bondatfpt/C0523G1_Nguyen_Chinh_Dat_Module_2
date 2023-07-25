package ss16_io_text_file.practice.exe1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ReadFileExample readFileExample = new ReadFileExample();
        System.out.println("Enter a path file");
        String path = input.nextLine();
        readFileExample.readFileText(path);
    }
}
