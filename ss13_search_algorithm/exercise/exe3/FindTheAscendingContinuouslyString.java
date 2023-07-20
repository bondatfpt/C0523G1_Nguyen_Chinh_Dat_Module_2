package ss13_search_algorithm.exercise.exe3;

import java.util.LinkedList;
import java.util.List;


public class FindTheAscendingContinuouslyString {
    public static void main(String[] args) {
        String string = "Chinh Dat";
        System.out.println(findTheAscendingContinuouslyString(string));
    }

    public static List findTheAscendingContinuouslyString(String string) {
        List<Character> myList = new LinkedList();
        List<Character> maxList = new LinkedList();
        for (int i = 0; i < string.length(); i++) {
            if (myList.size() > 1 && string.charAt(i) <= myList.get(myList.size() - 1) && myList.contains(string.charAt(i))) {
                    myList.clear();
            }
            myList.add(string.charAt(i));
            if(myList.size() > maxList.size()){
                maxList.clear();
                maxList.addAll(myList);
            }
        }
            return maxList;
        }

    }

