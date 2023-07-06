package ss03_array_and_method.exercise;

import java.util.Scanner;

public class CountTheNumberOfOccurrencesOfACharacterInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ky tu muon tim kiem");
        // anh Chánh bày;
        char character = input.nextLine().charAt(0);
        String string = "Chinh Dat Chao Tat Ca Moi Nguoi";
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (character == string.charAt(i)){ // hàm charAt(i) trả về ký tự ở vị trí i;
                count++;
            }
        }
        System.out.println("Ky tu " + character + " xuat hien " + count + " lan trong chuoi " + string );
    }
}
