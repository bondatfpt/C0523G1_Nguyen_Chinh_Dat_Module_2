package algorithm;

public class Ok {
    public static void main(String[] args) {
        String string = "   cHinh  dAt       nguYen";
        System.out.println(chuanHoaChuoi(string));
    }
    public static String chuanHoaChuoi (String string){
        string = string.trim().toLowerCase();
        String arr [] = string.split("");
        boolean checkKyTuDau = true;
        int demKhoangTrang = 0;
        String result = "";
        for (String s : arr) {
            if (s.equals(" ")) {
                demKhoangTrang++;
                checkKyTuDau = true;
            } else {
                if (checkKyTuDau) {
                    result = result.concat(s.toUpperCase());
                } else {
                    result = result.concat(s);
                }
                checkKyTuDau = false;
                demKhoangTrang = 0;
            }
            if (demKhoangTrang == 1) {
                result = result.concat(" ");
            }
        }
        return result;
    }
}
