package ss15_exception_and_debug.practice.exe1;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int [] arrNumber = arrayExample.creatRandomNumberArray();
        System.out.println(Arrays.toString(arrNumber));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an index you want to search");
        int indexSearch = Integer.parseInt(input.nextLine());
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + indexSearch + " là " +arrNumber[indexSearch]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
