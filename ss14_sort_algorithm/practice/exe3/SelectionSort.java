package ss14_sort_algorithm.practice.exe3;

public class SelectionSort {
    public static void selectionSort(int arr []){
        for (int i = 0; i < arr.length - 1; i++) {
            int minElement = arr[i];
            int indexMinElement = i;
            for (int j = i + 1; j < arr.length ; j++) {
                if(minElement > arr[j]){
                    minElement = arr[j];
                    indexMinElement = j;
                }
            }
            if(indexMinElement != i){
                arr[indexMinElement] = arr[i];
                arr[i] = minElement;
            }
        }
    }
}
