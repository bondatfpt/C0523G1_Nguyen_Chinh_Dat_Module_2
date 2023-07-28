package ss19_ooad_and_solid.practice;

public class Test {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Chinh Dat");
        StringBuilder stringBuilder1 = stringBuilder;
        System.out.println(stringBuilder);
        System.out.println(stringBuilder1);
    }
}
