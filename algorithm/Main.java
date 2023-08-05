package algorithm;

import algorithm.model.Product;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
   public static String chuanHoaChuoi (String string){
       string = string.trim().toLowerCase();
       String result = "";
       int countSpace = 0;
       boolean checkKyTuDau = true;
       String arr [] = string.split("");
       for (int i = 0; i < arr.length; i++) {
           if(arr[i].equals(" ")){
               countSpace++;
               checkKyTuDau = true;
           }else {
               if(checkKyTuDau){
                   result = result.concat(arr[i].toUpperCase());
               }
               else {
                   result = result.concat(arr[i]);
               }
               checkKyTuDau = false;
               countSpace = 0;
           }
           if(countSpace == 1){
               result = result.concat(" ");
           }
       }
       return result;
   }

    public static void main(String[] args) {
        System.out.println(chuanHoaChuoi("   ngUYEN     cHinh    dAt"));
    }
}
