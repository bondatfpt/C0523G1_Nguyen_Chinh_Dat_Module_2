package ss02_vonglap.exercise;

import java.util.Scanner;

public class hienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Hinh Tam Giac");
        System.out.println("2. Hinh Chu Nhat");
        System.out.println("3. Hinh Tam giac Nguoc");
        System.out.println("0. Ket Thuc");
        int choice;
        do {
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*" + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print("*" + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i ; j++) {
                            System.out.print("*" + " " + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    break;
            }
        }
        while (choice != 0);
    }
}
