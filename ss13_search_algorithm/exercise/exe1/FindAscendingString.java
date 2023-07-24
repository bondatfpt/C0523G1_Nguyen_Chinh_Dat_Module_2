package ss13_search_algorithm.exercise.exe1;

public class FindAscendingString {
    public static String findTheAscendingString(String string) {
        String arrString[] = string.split("");
        String result = arrString[0];
        for (int j = 0; j < arrString.length; j++) {
                String maxChar = arrString[j];
                String stringMaxChar = arrString[j];
            for (int i = j + 1; i < arrString.length; i++) {
                if (maxChar.charAt(0) < arrString[i].charAt(0)) {
                    maxChar = arrString[i];
                    stringMaxChar += maxChar;
                }
            }
            if(result.length() < stringMaxChar.length()){
                result = stringMaxChar;
            }
        }
        return result;
    }
}


