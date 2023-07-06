package ss02_loop.practice;

import java.util.Scanner;

public class CalculateBankInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double loanAmount, interest;
        int months;
        double sumMoney = 0.0;
        System.out.println("Enter loanAmount");
        loanAmount = input.nextDouble();
        System.out.println("Enter interest");
        interest = input.nextDouble();
        System.out.println("Enter months");
        months = input.nextInt();
        for (int i = 0; i < months; i++) {
             sumMoney += loanAmount * (interest / 100) / 12 * months;
        }
        System.out.println("Sum Money is: " + sumMoney);
    }
}
