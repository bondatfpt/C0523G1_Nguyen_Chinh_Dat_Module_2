package ss15_exception_and_debug.practice.exe2;

public class CalculationExample {
    public void calculator(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng của 2 số là: " + a);
            System.out.println("Hiệu của 2 số là: " + b);
            System.out.println("Tích của 2 số là: " + c);
            System.out.println("Thương của 2 số là: " + d);
        }
        catch (NumberFormatException e) {
            System.out.println("Lỗi chia cho 0");
        }
    }
}
