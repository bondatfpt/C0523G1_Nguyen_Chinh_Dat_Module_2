package ss03_mang.exercise;

import java.util.Scanner;

public class xoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao gia tri phan tu can xoa");
        int phanTuCanXoa = input.nextInt();
        int mangSoNguyen[] = {1,2,3,4,5,6,7,8};
        int index = -1;
        // vòng lặp lấy vị trí của phần tử muốn xóa;
        for (int i = 0; i < mangSoNguyen.length; i++) {
            if (phanTuCanXoa == mangSoNguyen[i]){
                index = i;
                break;
            }
        }
        // vòng lặp đẩy phần tử cần xóa ra cuối cùng mảng;
        for (int j = index; j < mangSoNguyen.length - 1 ; j++) {
            mangSoNguyen[j] = mangSoNguyen [j + 1];
        }
        // gán cho phần tử cuối cùng của mảng bằng 0;
        mangSoNguyen[mangSoNguyen.length-1] = 0;
        // duyệt mảng in ra màn hình;
        for (int i = 0; i < mangSoNguyen.length; i++) {
            System.out.print(mangSoNguyen[i]+ ",");
        }
    }
}
