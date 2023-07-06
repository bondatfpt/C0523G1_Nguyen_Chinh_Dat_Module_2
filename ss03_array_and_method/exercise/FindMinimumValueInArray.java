package ss03_array_and_method.exercise;

import java.util.Scanner;

public class FindMinimumValueInArray {
    // Tương tự bài tìm max nhưng là mảng 1 chiều;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu cua mang");
        int amount = input.nextInt();
        int array[] = new int[amount];
        for (int i = 0; i < amount; i++) {
            System.out.println("Nhap vao gia tri phan tu thu " + (i + 1) );
            array[i] = input.nextInt();
        }
        for (int i = 0; i < amount; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        int min = array[0];
        for (int i = 0; i < amount; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Phan tu co gia tri nho nhat la: " + min);
    }
}
