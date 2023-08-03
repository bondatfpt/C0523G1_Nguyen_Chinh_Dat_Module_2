package algorithm;

public class Practice {
    public static void main(String[] args) {
        String string = "       dAT    dEp   traI    nHaT     qua dAt                   ";
        System.out.println(perfectString(string));
    }
    public static String perfectString (String string){
        string = string.trim().toLowerCase();
        String result = "";
        String [] arr = string.split("");
        boolean isStart = true;
        int countSpace = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(" ")){
                countSpace++;
                isStart = true;
            }else {
                if(isStart){
                    result = result.concat( arr[i].toUpperCase());
                }
                else {
                   result = result .concat(arr[i]);
                }
                isStart = false;
                countSpace = 0;
            }
            if(countSpace == 1){
                result = result.concat(" ");
            }
        }
        return result;
    }
}
