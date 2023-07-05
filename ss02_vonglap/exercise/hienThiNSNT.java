package ss02_vonglap.exercise;

import java.util.Scanner;

public class hienThiNSNT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so luong so nguyen to can in ra");
        int soLuongSnt = input.nextInt();
        if (soLuongSnt <= 0) {
            System.out.println("Khong hop le! Moi nhap lai");
        } else {
            int soKiemtra = 2;
            int dem = 0;
            while (dem < soKiemtra) {
                int khongPhaiSnt = 0;
                for (int i = 2; i < soKiemtra; i++) {
                    if (soKiemtra % i == 0) {
                        khongPhaiSnt++;
                    }
                }
                if (khongPhaiSnt == 0) {
                    System.out.println(soKiemtra);
                    dem++;
                }
                if (dem >= soLuongSnt) {
                        break;
                }
                soKiemtra++;
            }
        }
    }
}
