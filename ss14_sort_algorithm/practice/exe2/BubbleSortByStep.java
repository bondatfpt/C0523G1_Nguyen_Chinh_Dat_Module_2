package ss14_sort_algorithm.practice.exe2;
import java.util.Scanner;
import ss14_sort_algorithm.practice.exe1.BubbleSortAlgorithmSettings;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 0;
        do {
            System.out.println("Enter size of array");
            size = Integer.parseInt(input.nextLine());
            if(size <= 0 ){
                System.out.println("Illegal");
            }
        }while (size <= 0);
        int arr [] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a value of element have index: " + (i + 1));
            arr[i] = Integer.parseInt(input.nextLine());
        }
        System.out.print("Your arr: ");
        for (int number:arr) {
            System.out.print(number + " ");
        }
        System.out.println();
        BubbleSortAlgorithmSettings.sortAscending(arr);
    }
}
