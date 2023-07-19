package ss12_java_collection_frame_work.exercise.exe2;

public class Test {
    public static void main(String[] args) {
        String string = "qua,";
        if (string.contains(",")) {
            string.substring(0, string.length() - 1);
        }
        System.out.println(string);
    }
}
