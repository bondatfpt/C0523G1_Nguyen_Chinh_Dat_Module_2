package ss03_mang.exercise;

import java.util.Scanner;

public class timMaxTrongMang2Chieu {
    public static void main(String[] args) {
        int mang2d [][] = new int[2][4];
        mang2d[0][0]=1;
        for (int[] value : mang2d) {
            System.out.println(" ");
            for (int i : value) {
                System.out.print(i);
            }
        }
        Scanner input = new Scanner(System.in);

    }
}
