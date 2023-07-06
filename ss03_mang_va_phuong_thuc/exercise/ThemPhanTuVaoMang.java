package ss03_mang_va_phuong_thuc.exercise;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao gia tri phan tu duoc them");
        int giaTriphanTuDuocThem = input.nextInt();
        System.out.println("Nhap vao vi tri");
        int viTriphanTuDuocThem = input.nextInt();
        int mangSoNguyen[] = {1,2,3,4,6};
        int mangSoNguyenMoi[] = new int[6];
        // vòng lặp duyệt các phần tử từ vị trí 0 đến vị trí phần tử được thêm trừ 1;
        for (int i = 0; i <= viTriphanTuDuocThem - 1 ; i++) {
                    mangSoNguyenMoi[i] = mangSoNguyen[i];
        }
        // vòng lặp duyệt các phần tử từ vị trí phần tử được thêm + 1 đến độ dài của mảng số nguyên được thêm;
        for (int i = viTriphanTuDuocThem + 1; i < mangSoNguyenMoi.length; i++) {
                    mangSoNguyenMoi[i] = mangSoNguyen[i-1];
        }
        // gán giá trị được thêm vào vị trí do người dùng nhập;
        mangSoNguyenMoi[viTriphanTuDuocThem] = giaTriphanTuDuocThem;
        //in mảng ra màn hình;
        for (int value:mangSoNguyenMoi) {
            System.out.println(value);
        }
    }
}
