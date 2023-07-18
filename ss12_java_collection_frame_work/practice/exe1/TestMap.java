package ss12_java_collection_frame_work.practice.exe1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        //HashMap;
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Mac",20);
        hashMap.put("Dat",20);
        hashMap.put("Duc",20);
        hashMap.put("Phom",20);
        hashMap.put("Heo",20);
        hashMap.put("Ba",20);
//        System.out.println("Display entry in HashMap");
//        System.out.println(hashMap + "\n");
        System.out.println(hashMap.size());
        //TreeMap;
//        Map<String,Integer>treeMap = new TreeMap<>(hashMap);
//        System.out.println("Display entry in TreeMap");
//        System.out.println(treeMap);
//        //LinkedHashMap;
//        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
//        linkedHashMap.put("Smith", 30);
//        linkedHashMap.put("Anderson", 31);
//        linkedHashMap.put("Lewis", 29);
//        linkedHashMap.put("Cook", 29);
//        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
