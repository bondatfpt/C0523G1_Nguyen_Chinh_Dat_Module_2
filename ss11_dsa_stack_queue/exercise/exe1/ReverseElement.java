package ss11_dsa_stack_queue.exercise.exe1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ReverseElement {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        System.out.println("String reversed: " + reverseString(string));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(15);
        arrayList.add(16);
        arrayList.add(17);
        arrayList.add(18);
        System.out.print("Numbers reversed: " + reverseNumber(arrayList));
    }
    public static String reverseString(String string){
        String result ="";
        Stack myStack = new Stack();
        for (int i = 0; i < string.length(); i++) {
            myStack.push(string.charAt(i));
        }
        int length = myStack.size();
        for (int i = 0; i < length ; i++) {
            result += myStack.pop();
        }
        return result;
    }
    public static ArrayList<Integer> reverseNumber(ArrayList<Integer>arrayList){
        Stack<Integer> myStack = new Stack();
        for (int i = 0; i < arrayList.size(); i++) {
            myStack.push(arrayList.get(i));
        }
        int length = myStack.size();
        for (int i = 0; i < length; i++) {
            arrayList.set(i,myStack.pop());
        }
        return arrayList;
    }
}
