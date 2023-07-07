package ss05_access_modifier_static_property_static_method.practice;

public class StaticMethod {
    public static void main(String[] args) {
        Student student1 = new Student(2,"Chinh Dat");
        Student student2 = new Student(3,"Mark");
        System.out.println("Trước khi gọi đến phương thức static changeSchool của class Student; school = FPT");
        System.out.println("Name student 1: " + student1.getName() + "\n" + "School:" + Student.school);
        System.out.println("Name student 2: " + student2.getName() + "\n" + "School:" + Student.school);
        System.out.println("Sau khi gọi đến phương thức static changeSchool của class Student; school = Codegym");
        Student.changeSchool();
        System.out.println("Name student 1: " + student1.getName() + "\n" + "School:" + Student.school);
        System.out.println("Name student 2: " + student2.getName() + "\n" + "School:" + Student.school);
    }
    private static class Student  {
        int id;
        String name;
        // biến static school của class Student tham chiếu chung cho tất cả các đối tượng của class Student;
        static String school = "FPT";

        Student(int id, String name){
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
        // Phương thức static changeSchool có thể truy cập vào biến static school và thay đổi nó;
        private static void changeSchool () {
            school = "CodeGym";
        }
    }
}
