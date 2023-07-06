package ss02_loop.exercise;

import java.util.Scanner;

public class PrimeNumberDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so luong so nguyen to can in ra");
        int soLuongSnt = input.nextInt();
        if (soLuongSnt <= 0) {
            System.out.println("Khong hop le! Moi nhap lai");
        } else {
            int soKiemTra = 2;
            int dem = 0;
            while (dem < soKiemTra) {
                int khongPhaiSnt = 0;
                for (int i = 2; i < soKiemTra; i++) {
                    if (soKiemTra % i == 0) {
                        khongPhaiSnt++;
                    }
                }
                if (khongPhaiSnt == 0) {
                    System.out.println(soKiemTra);
                    dem++;
                }
                if (dem >= soLuongSnt) {
                        break;
                }
                soKiemTra++;
            }
        }
    }
}
