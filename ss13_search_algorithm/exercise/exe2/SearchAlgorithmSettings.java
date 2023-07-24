package ss13_search_algorithm.exercise.exe2;

import java.util.Arrays;
import java.util.Scanner;

public class SearchAlgorithmSettings {
    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (array[middle] == value) {
            return middle;
        } else if (value > array[middle]) {
            left = middle + 1;
        } else {
            right = middle - 1;
        }
        if (left <= right) {
            return binarySearch(array, left, right, value);
        }
        return -1;
    }

}
