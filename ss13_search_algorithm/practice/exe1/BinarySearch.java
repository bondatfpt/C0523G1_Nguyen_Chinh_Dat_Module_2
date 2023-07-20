package ss13_search_algorithm.practice.exe1;

public class BinarySearch {
    static int list [] = {2,4,5,7,9,10,20,40,45,49,56,60,62,72};
    public static void main(String[] args) {
        System.out.println(binarySearch(60,list));
    }
    public  static int binarySearch(int key, int list[]){
        int low = 0;
        int high = list.length - 1;
        while (high >= low){
            int mid = (low + high) / 2;
            if(key < list[mid]){
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            }else {
                low = mid + 1 ;
            }
        }
        return -1;
    }

}

