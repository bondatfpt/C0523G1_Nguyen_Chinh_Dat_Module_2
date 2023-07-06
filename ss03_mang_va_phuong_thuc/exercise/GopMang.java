package ss03_mang_va_phuong_thuc.exercise;

public class GopMang {
    public static void main(String[] args) {
        int mangSoNguyen[] = {1,2,3,4,5,6,19,20};
        int mangSoNguyen1[] = {7,8,9,10,11,12};
        int mangSoNguyen2[] = new int[mangSoNguyen.length + mangSoNguyen1.length];
        // In ra màn hình mangSoNguyen;
        for (int value: mangSoNguyen) {
            System.out.print(value + " ");
        }
        System.out.println(""); // Xuống dòng;
        //In ra màn hình mangSoNguyen1;
        for (int value: mangSoNguyen1) {
            System.out.print(value + " ");
        }
        System.out.println("");
        //  vòng lặp gán giá trị phần tử mangSoNguyen[i] cho mangSoNguyen2[i];
        for (int i = 0; i < mangSoNguyen.length; i++) {
            mangSoNguyen2[i] = mangSoNguyen[i];
        }
        // vòng lặp gán giá trị phần tử mangSoNguyen1[i] cho mangSoNguyen2[i - mangSoNguyen.length];
        for (int i = mangSoNguyen.length; i < mangSoNguyen2.length; i++) {
                        mangSoNguyen2[i] = mangSoNguyen1[i - mangSoNguyen.length];
        }
        // In ra màn hình mangSoNguyen2;
        for (int i = 0; i < mangSoNguyen2.length; i++) {
            System.out.print(mangSoNguyen2[i] + " ");
        }
    }
}
