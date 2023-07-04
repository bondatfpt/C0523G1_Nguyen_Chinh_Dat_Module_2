package ss01_introduction_to_java.practice;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao mot so nguyen tu 2 den 7");
        int day = sc.nextInt();
        switch (day) {
            case 2:
                System.out.println("Hom nay la thu 2");
                break;
            case 3:
                System.out.println("Hom nay la thu 3");
                break;
            case 4:
                System.out.println("Hom nay la thu 4");
                break;
            case 5:
                System.out.println("Hom nay la thu 5");
                break;
            case 6:
                System.out.println("Hom nay la thu 6");
                break;
            case 7:
                System.out.println("Hom nay la thu 7");
                break;
            default:
                System.out.println("Hom nay la chu nhat");
        }
    }

}
