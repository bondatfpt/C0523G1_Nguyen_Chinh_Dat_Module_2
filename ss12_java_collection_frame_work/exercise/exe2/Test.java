package ss12_java_collection_frame_work.exercise.exe2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text");
        String string = input.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ',') {
                string = RemoveChar.removeChar(i,string);
            }
        }
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '.') {
                string = RemoveChar.removeChar(i,string);
            }
        }
        System.out.println(string);
        System.out.println(CountOccurrences.countOccurrences(string));
    }
}
