package algorithm;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class KiemTra2ChuoiDaoNguoc {
    public static void main(String[] args) {
        String s = "able was I ere";
        String s1 = "ere I saw elba";
        System.out.println(kiemTra2ChuoiDaoNguoc(s,s1));
    }
    public static boolean kiemTra2ChuoiDaoNguoc(String str1, String str2) {
        boolean flag = false;
        if (str1 == null || str2 == null) {
           flag = false;
        } else if (str1.length() != str2.length()) {
            flag = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == str2.charAt(str1.length() - i - 1)) {
                    flag = true;
                }
            }
        }
        return flag;
    }
}
