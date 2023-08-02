package algorithm;

public class DemNguyenAmVaPhuAmTrongChuoi {
    public static int demNguyenAm (String string){
        int demNguyenAm = 0;
        String[] list = string.split("");
        for (int i = 0; i < list.length; i++){
            String character = list[i];
            switch (character.toLowerCase()){
                case "u":
                case "e":
                case "o":
                case "a":
                case "i":
                    demNguyenAm++;
                    break;
            }
        }
        return demNguyenAm;
    }

    public static void main(String[] args) {
        String string = " ueoaadasdsadasddasdasdwewedjgldfjlglkjdfkldfgdfklgkdkgfdkglki";
        System.out.println("Số nguyên âm có trong chuỗi là :" + demNguyenAm(string));

    }
}
