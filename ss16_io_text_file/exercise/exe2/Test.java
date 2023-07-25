package ss16_io_text_file.exercise.exe2;

public class Test {
    public static void main(String[] args) {
        final String filePath = "D:\\C0523G1_Nguyen_Chinh_Dat_Module_2\\ss16_io_text_file\\exercise\\exe2\\country.csv";
        FileUtil fileUtil = new FileUtil();
        for (Country country:fileUtil.readCountryCSV(filePath)) {
            System.out.println(country);
        }
    }
}
