package ss15_exception_and_debug.practice.exe1;

import java.util.Random;

public class ArrayExample {
    public int [] creatRandomNumberArray(){
        Random rd = new Random();
        int arrNumber[] = new int[100];
        for (int i = 0; i < 100; i++) {
            arrNumber[i] = rd.nextInt(5);
        }
        return arrNumber;
    }
}
