package ss14_sort_algorithm.exercise.exe1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4};
        IllustrationInsertSort.insertSort(arr);
        System.out.println("Mang da duoc sap xep: " + Arrays.toString(arr));
    }
}
