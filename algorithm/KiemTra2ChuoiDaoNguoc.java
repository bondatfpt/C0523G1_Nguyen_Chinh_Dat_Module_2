package algorithm;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class KiemTra2ChuoiDaoNguoc {
    public boolean kiemTra2ChuoiDaoNguoc (String str1, String str2){
        Stack <String> myStack = new Stack<>();
        Queue <String> myQueue = new ArrayDeque<>();
        String [] strings1 = str1.trim().split("");
        String [] strings2 = str2.trim().split("");
        for (int i = 0; i < strings1.length ; i++) {
                myStack.push(strings1[i]);
        }
        for (int i = 0; i < strings2.length; i++) {
            myQueue.offer(strings2[i]);
        }
    return false;
    }
}
