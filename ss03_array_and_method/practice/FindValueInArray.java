package ss03_array_and_method.practice;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String myNames [] = {"Chính Đạt","Quốc Tuấn","Văn Đức","Thanh Tú"};
        System.out.println("Nhập tên 2 chữ");
        String inputName = input.nextLine();
        boolean isExit = false ;
        for (int i = 0; i < myNames.length; i++) {
            if(inputName.equals(myNames[i])){
                isExit = true;
                System.out.println("Vị trí của " + inputName + " là: " + i);
            }
        }
        if (!isExit){
            System.out.println(inputName + " không tìm thấy");
        }
    }
}
