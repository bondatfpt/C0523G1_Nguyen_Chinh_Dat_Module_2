package ss02_loop.practice;

import java.util.Scanner;

public class FindGreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a ;
        int b ;
        System.out.println("Enter a");
        a = input.nextInt();
        System.out.println("Enter b");
        b = input.nextInt();
        int greatestCommon = 1;
        if (a > b) {
            for (int i = 1; i <= b; i++) {
                if (a % i == 0 && b % i ==0){
                    greatestCommon = i;
                }
            }
        }
        if (b < a){
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i ==0){
                    greatestCommon = i;
                }
            }
        }
        if (a == 0 || b == 0){
            System.out.println("No greatest common factor");
        }
        System.out.println("Greatest common factor is: " + greatestCommon);
    }
}