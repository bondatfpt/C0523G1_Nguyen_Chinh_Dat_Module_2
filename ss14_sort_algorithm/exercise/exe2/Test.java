package ss14_sort_algorithm.exercise.exe2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int arr [] = {10,9,8,7,6,5,4,3,2,1};
        InsertSortSetting.insertSort(arr);
        System.out.println("Mang da duoc sap xep: " + Arrays.toString(arr));
    }
}
