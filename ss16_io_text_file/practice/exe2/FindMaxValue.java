package ss16_io_text_file.practice.exe2;

import java.util.List;

public class FindMaxValue {
    public int findMaxValue(List <Integer> list){
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }
}
