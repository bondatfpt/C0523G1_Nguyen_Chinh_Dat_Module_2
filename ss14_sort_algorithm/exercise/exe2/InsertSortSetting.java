package ss14_sort_algorithm.exercise.exe2;

public class InsertSortSetting {
    public static void insertSort(int arr[]) {
        int x, pos;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (pos > 0 && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
        }
    }
}
