package algorithm;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class KiemTra2ChuoiDaoNguoc {
    public  static  boolean kiemTra2ChuoiDaoNguoc (String str1, String str2){
        if(str1 == null || str2 == null){
            return false;
        }
        if(str1.length() != str2.length()){
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == str2.charAt(str1.length() - i - 1)){
                return true;
            }
        }
        return false;
    }

}
