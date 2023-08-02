package algorithm;

public class DaoNguocChuoi {
    public static StringBuilder daoNguocChuoi(String str){
        if(str.length() == 1){
            System.out.println(str);
        }
        if(str.isEmpty()){
            System.out.println("String is empty");
        }
        StringBuilder stringBuilder = new StringBuilder();
        char[] stringArr = str.toCharArray();
        for (int i = stringArr.length - 1; i >= 0 ; i--) {
            stringBuilder.append(stringArr[i]);
        }
        return stringBuilder;
    }
}
