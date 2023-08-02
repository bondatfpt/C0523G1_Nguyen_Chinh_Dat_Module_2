package algorithm;

import java.util.HashMap;
import java.util.Map;

public class KiemTraKyTuXuatHienNhieuLanTrongChuoi {
    public static Map<Character, Integer> characterDuplicate(String string) {
        if (string.equals(null) || string.equals(" ")){
            System.out.println("String is empty or have value null !!!");
        }
        Map<Character, Integer> myMap = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
                if(myMap.containsKey(string.charAt(i))){
                    myMap.compute(string.charAt(i),(key,val) -> val + 1);
                }
                else {
                    myMap.put(string.charAt(i),1);
                }
        }

        return myMap;
    }
}
