package ss14_sort_algorithm.practice.exe3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int arr [] = {9,8,7,6,5,4,3,2,1};
        SelectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
