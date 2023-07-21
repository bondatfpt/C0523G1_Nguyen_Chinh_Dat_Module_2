package ss14_sort_algorithm.practice.exe1;

import java.util.Arrays;

public class BubbleSortAlgorithmSettings {
    public static void sortAscending(int [] arr){
        boolean check = true;
        for (int i = 1; i < arr.length ; i++) {
            check = false;
            for (int j = 0; j < arr.length - i; j++) {
                System.out.println("Swap: " + j + " with: " + (j + 1));
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1 ];
                    arr[j + 1] = temp;
                    check = true;
                 }
            }
            if(check == false){
                System.out.println("Array may be sorted, not need loop, just need " + i + " loop to sorted" );
            }
            System.out.println("Array after sorted: " + Arrays.toString(arr));
        }
    }
    public static void sortAscending1 (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1 ] = temp;
                }
            }
        }
    }
}
