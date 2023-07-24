package ss14_sort_algorithm.practice.exe1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {100, 99, 88, 77, 66, 55, 44, 33, 22, 11};
        BubbleSortAlgorithmSettings.sortAscending1(arr);
        System.out.println(Arrays.toString(arr));
    }

}
