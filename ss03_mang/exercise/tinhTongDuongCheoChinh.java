package ss03_mang.exercise;

import java.util.Scanner;

public class tinhTongDuongCheoChinh {
    public static void main(String[] args) {
        // Khởi tạo mảng 2 chiều do người dùng nhập; Dùng do while lặp cho đến khi người dùng nhập số hàng và số cột bằng nhau;
        Scanner input = new Scanner(System.in);
        int row,col;
        do {
            System.out.println("Nhap vao chieu cao cua mang");
            row = input.nextInt();
            System.out.println("Nhap vao chieu dai cua mang");
            col = input.nextInt();
            if (row != col){
                System.out.println("Ma tran co chieu dai va chieu rong bang nhau");
            }
        }
        while (row != col);
        int array2D[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhap vao gia tri phan tu hang " + i + " cot " +j);
                array2D[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array2D[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j){        // Đường chéo của ma trận là khi hàng = cột;
                    sum += array2D[i][j];
                }
            }
        }
        System.out.println("Tong cua cac phan tu trong duong cheo chinh la: " + sum);
    }
}
