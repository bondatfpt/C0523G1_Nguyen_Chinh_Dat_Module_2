package ss14_sort_algorithm.exercise.exe1;

public class IllustrationInsertSort {
    public static void insertSort(int arr []){
        int x,pos;
        for (int i = 1; i < arr.length ; i++) {
            x = arr[i];
            pos = i;
            System.out.println("Gia tri cua x: " + x + " co vi tri " + pos);
            while (pos > 0 && x < arr[pos - 1]){
                System.out.println("Hoan doi phan tu thu: " + pos + " voi phan tu thu: " + (pos- 1));
                arr[pos] = arr[pos - 1];
                pos --;
            }
            arr[pos] = x;
            System.out.println("gia tri cua phan tu co vi tri " + pos + " dc gan lai voi gia tri: " + x);
        }
    }
}
