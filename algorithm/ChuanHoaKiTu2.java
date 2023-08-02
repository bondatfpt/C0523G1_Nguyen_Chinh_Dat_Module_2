package algorithm;

public class ChuanHoaKiTu2 {
    public  static  String chuanHoa (String str){
        str = str.trim().toLowerCase();
        str = str.replaceAll("\\s+", " ");
        return str;
    }
    public static String chuanHoaDanhTuRieng (String str){
        str = chuanHoa(str);
        String temp[] = str.split(" ");
        str = ""; // ? ^-^
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1) // ? ^-^
                str += " ";
        }
        return str;
    }

}
