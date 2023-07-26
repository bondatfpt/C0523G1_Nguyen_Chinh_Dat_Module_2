package ss17_binary_file_and_serialization.practice.exe2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ByteStream {
    private final static String FILE_PATH = "D:\\C0523G1_Nguyen_Chinh_Dat_Module_2\\ss17_binary_file_and_serialization\\practice\\exe2\\student.dat";

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Dat", "Quang Tri"));
        studentList.add(new Student(2, "Mac", "Quang Tri"));
        studentList.add(new Student(3, "Duc", "Quang Tri"));
        studentList.add(new Student(4, "Phom", "Quang Tri"));
        studentList.add(new Student(5, "Heo", "Quang Tri"));
//        writeDataToFile(filePath, studentList);
        List <Student> students = new ArrayList<>();
        students = readDataFromFile(FILE_PATH);
        for (Student student: students) {
            System.out.println(student);
        }
    }

    public static void writeDataToFile(String filePath, List<Student> studentList) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found !");
        } catch (IOException e) {
            System.out.println("Error content");
        }
    }

    public static List<Student> readDataFromFile(String filePath) {
        List<Student> studentList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            studentList = (List<Student>) ois.readObject();
            ois.close();

        }catch (FileNotFoundException e){
            System.out.println("File not found !");
        }catch (IOException e){
            System.out.println("Error content !");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return studentList;
    }
}
