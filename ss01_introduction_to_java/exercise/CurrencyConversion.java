package ss01_introduction_to_java.exercise;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap USD");
        float usd = sc.nextFloat();
        float vnd = usd * 23000;
        System.out.println(usd + " USD = " + vnd + " VND");
    }
}
