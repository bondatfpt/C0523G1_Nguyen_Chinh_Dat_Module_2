package ss13_search_algorithm.exercise;
import java.util.*;

public class FindTheAscendingString {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a string");
       String string  = input.nextLine();
       System.out.println("The ascending substring is: " + findTheAscendingString(string));
    }
    public static String findTheAscendingString(String string){
        String arrString[] = string.split("");
        String maxChar = arrString[0];
        String text = maxChar;
        for (int i = 0; i < arrString.length; i++) {
            if(maxChar.charAt(0) < arrString[i].charAt(0)){
                maxChar = arrString[i];
                text += maxChar;
            }
        }
        return text;
    }
}


