package ss01_introduction_to_java.exercise;

import java.util.Scanner;

public class ShowGreeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban iu nhap ten");
        String name = sc.nextLine();
        System.out.println("Xin chao ban " + name);
    }
}
