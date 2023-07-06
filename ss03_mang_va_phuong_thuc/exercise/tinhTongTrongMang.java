package ss03_mang_va_phuong_thuc.exercise;

import java.util.Scanner;

public class tinhTongTrongMang {
    public static void main(String[] args) {
        // Khởi tạo mảng 2 chiều;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao chieu cao cua mang");
        int row = input.nextInt();
        System.out.println("Nhap vao chieu rong cua mang");
        int col = input.nextInt();
        int array2D[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhap vao phan tu hang " + i + " cot " + j);
                array2D[i][j] = input.nextInt();
            }
        }
        // In ra màn hình mảng 2 chiều;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Nhap vao vi tri cot ban muon tinh tong");
        // Cho phép người dùng nhập cột muốn tính tổng trong mảng;
        int index = input.nextInt();
        int sum = 0;
        // 2 vòng lặp lồng nhau duyệt mảng 2 chiều, nếu chạy đến cột bằng với vị trí cột do người dùng nhập trừ 1 thì cộng dồn các phần tử lại;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j == index -1){         // index = col - 1 vì indexcol chạy từ 0 mà người dùng nhập từ 1;
                    sum += array2D[i][j];
                }
            }
        }
        // In ra màn hình tổng các giá trị phần tử trong cột người dùng muốn tính;
        System.out.println("Tong cot " + index + " la: " + sum);
    }
}
