package ss04_class_and_object.exercise;

import java.util.Arrays;

public class TestStopWatch {
    // Phương thức tạo ra 1 mảng gồm 10000 số ngẫu nhiên;
    public static long[] randomArrayNumber(){
        long arrayNumber[] = new long[100000];
        for (int i = 0; i < 100000; i++) {
            arrayNumber[i] = Math.round(Math.random()*100000);
        }
        return arrayNumber;
    }
    // Phương thức sắp xếp các giá trị phần tử trong mảng tăng dần;
    public static long[] sortArrayNumber(long arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] > arr[j]){
                    long temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        // Khởi tạo đối tượng stopWatch thuộc lớp StopWatch;
        StopWatch stopWatch = new StopWatch();
        // Gọi phương thức start() trước khi vòng lặp thực hiện để lấy thời gian bắt đầu;
        stopWatch.start();
        // Bắt đầu sắp xếp các số trong mảng;
        System.out.println(Arrays.toString(sortArrayNumber(randomArrayNumber())));
        // Gọi phương thức stop() để lấy thời gian kết thúc vòng lặp;
        stopWatch.stop();
        // In ra màn hình thời gian kết thúc trừ đi thời gian bắt đầu; đổi milisecond ra sec;
        System.out.println("About: " +stopWatch.getElapsedTime()/1000 + " sec");
    }
}
