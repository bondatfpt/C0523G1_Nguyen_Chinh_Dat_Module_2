package algorithm;

public class ChuanHoaKiTu {
    private static String chuoiCanChuanHoa = "   ngU y En       c H I n h    dat";

    public static String getChuoiCanChuanHoa(String chuoi) {
        String result = "";
        chuoi = chuoi.trim().toLowerCase();
        String [] mangChuoi = chuoi.split("");
        int demKhoangTrang = 0;
        boolean checkKyTuDau = true;
        for (int i = 0; i < mangChuoi.length; i++) {
            if(mangChuoi[i].equals(" ")){
                demKhoangTrang ++;
                checkKyTuDau = true;
            }
            else {
                if(checkKyTuDau){
                    result += mangChuoi[i].toUpperCase();
                }
                else {
                    result += mangChuoi[i];
                }
                checkKyTuDau = false;
                demKhoangTrang = 0;

            }
            if(demKhoangTrang == 1){
                result += " ";
            }
        }
        return result;
    }
}
