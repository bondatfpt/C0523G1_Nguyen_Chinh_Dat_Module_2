package algorithm;

import java.util.HashMap;
import java.util.Map;

public class Main {
        public static void main (String[]sgr){
            String str = "";
            Map <Character,Integer> myMap = new HashMap<>();
            myMap = KiemTraKyTuXuatHienNhieuLanTrongChuoi.characterDuplicate(str);
            myMap.forEach((Character,Integer) -> {
                if (Integer > 1){
                    System.out.println(Character);
                }
            });
        }
}
