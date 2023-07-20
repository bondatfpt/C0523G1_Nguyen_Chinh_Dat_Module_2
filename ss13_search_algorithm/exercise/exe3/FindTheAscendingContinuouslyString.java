package ss13_search_algorithm.exercise.exe3;

import java.util.LinkedList;
import java.util.List;


public class FindTheAscendingContinuouslyString {
    public static void main(String[] args) {
        String string = "abcdefghkabcdklabcdefgasdkk";
        System.out.println(findTheAscendingContinuouslyString(string));

    }
    public static List findTheAscendingContinuouslyString(String string) {
        LinkedList<Character> maxList = new LinkedList();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> myList = new LinkedList();
            myList.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > myList.getLast()) {
                        myList.add(string.charAt(j));
                }
                else {
                    break;
                }
            }
            if(myList.size() > maxList.size()){
                maxList.clear();
                maxList.addAll(myList);
            }
        }
        return maxList;
    }

}

