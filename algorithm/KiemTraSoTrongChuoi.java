package algorithm;

public class KiemTraSoTrongChuoi {
    private static final String REGEX_CHECK_NUMBER_IN_STRING = "^\\D+$";
    public static boolean checkNumberInString (String string){
        if (string.isEmpty()){
            System.out.println("String is empty");
        }
        else if(string.matches(REGEX_CHECK_NUMBER_IN_STRING)){
            return true;
        }
        return false;
    }
}
