package ss15_exception_and_debug.practice.exe2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        CalculationExample calculationExample = new CalculationExample();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x");
        int x = input.nextInt();
        System.out.println("Enter y");
        int y = input.nextInt();
        calculationExample.calculator(x,y);
    }
}
