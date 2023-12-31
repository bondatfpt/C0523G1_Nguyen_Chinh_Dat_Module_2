package ss13_search_algorithm.exercise.exe2;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 1;
        do {
            System.out.println("Enter a size of array");
            n = Integer.parseInt(input.nextLine());
            if (n <= 0) {
                System.out.println("Please re-enter");
            }
        } while (n <= 0);
        int arrInteger[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a value of element have index: " + (i + 1));
            arrInteger[i] = Integer.parseInt(input.nextLine());
        }
        for (int i = 0; i < arrInteger.length; i++) {
            for (int j = i + 1; j < arrInteger.length; j++) {
                if (arrInteger[i] > arrInteger[j]) {
                    int temp = arrInteger[i];
                    arrInteger[i] = arrInteger[j];
                    arrInteger[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrInteger));
        System.out.println("Enter a value you want to search");
        int valueSearch = Integer.parseInt(input.nextLine());
        System.out.println(SearchAlgorithmSettings.binarySearch(arrInteger, 0, arrInteger.length - 1, valueSearch));
    }
}