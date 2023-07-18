package ss12_java_collection_frame_work.exercise.exe2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text");
        String text = input.nextLine();
        System.out.println(countOccurrences(text).toString());
    }
    public static Map countOccurrences(String string){
        Map<String,Integer> myMap = new HashMap<>();
        String arrString [] = string.toLowerCase().split(" ");

        for (String word: arrString){
            if(myMap.containsKey(word)){
                Integer value = myMap.get(word);
                value++;
                myMap.replace(word,value);
            }
            else {
                myMap.put(word,1);
            }
        }
        return myMap ;
    }
}
