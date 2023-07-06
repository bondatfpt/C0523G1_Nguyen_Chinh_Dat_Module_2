package ss03_mang_va_phuong_thuc.exercise;

import java.util.Scanner;

public class TimMaxTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao chieu cao cua mang");
        // Cho phép người dùng nhập số hàng từ bàn phím;
        int row = input.nextInt();
        System.out.println("Nhap vao chieu rong cua mang");
        // Cho phép người dùng nhập số cột từ bàn phím;
        int col =input.nextInt();
        // Khởi tạo mảng 2 chiều có độ dài hàng và cột do người dùng nhập từ bàn phím;
        int array2D[][] = new int[row][col];
        // 2 vòng lặp lồng nhau để người dùng nhập vào giá trị các phần tử;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhap gia tri phan tu hang " + i + " cot " + j);
                array2D[i][j] = input.nextInt();
            }
        }
        // Vòng lặp in mảng 2 chiều ra màn hình;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
        // Gán giá trị phần tử hàng 0 cột 0 cho max;
        int max = array2D[0][0];
        // Vòng lặp duyệt tất cả các phần tử trong mảng, nếu phần tử nào lớn hơn max thì gán cho max;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (array2D[i][j] > max){
                    max = array2D[i][j];
                }
            }
        }
        // In ra màn hình max;
        System.out.println("Phan tu co gia tri lon nhat la: " + max);
    }
}
