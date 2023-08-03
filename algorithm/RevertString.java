package algorithm;

public class RevertString {
    public static void main(String[] args) {
        String s = "Chinh Dat Nguyen";
        System.out.println(revertString(s));
    }

    public static String revertString(String string) {
        String result = "";
        string.trim();
        String[] strings = string.split(" ");
            for (int i = strings.length - 1; i >= 0; i--) {
                result = result.concat(strings[i]+" ");
            }
        return result.trim();
    }
}
