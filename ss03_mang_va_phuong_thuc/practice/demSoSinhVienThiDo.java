package ss03_mang_va_phuong_thuc.practice;

import java.util.Scanner;

public class demSoSinhVienThiDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhap vao so luong diem cua sinh vien");
            size = input.nextInt();
            if (size <= 0 || size > 30) {
                System.out.println("Lop co toi da 30 nguoi");
            }
        }
        while (size <= 0 || size > 30);
        double listMark[] = new double[size];
        for (int i = 0; i < size; i++) {
            do {
                System.out.println("Nhap diem cua tung sinh vien.Sinh vien thu " + (i + 1));
                listMark[i] = input.nextDouble();
                if(listMark[i] < 0 || listMark[i] > 10){
                    System.out.println("Diem toi thieu la 0 va diem toi da la 10");
                }
            }
            while (listMark[i] < 0 || listMark[i] > 10);
        }
        int countPass = 0;
        int countFail = 0;
        for (int i = 0; i < size; i++) {
            if( listMark[i] >= 5 && listMark[i] <= 10){
                countPass++;
            }
            else {
                countFail++;
            }
        }
        System.out.println("So luong sinh vien da thi do ky thi la: " + countPass);
        System.out.println("So luong sinh vien da thi truot ky thi la: " + countFail);
    }
}
