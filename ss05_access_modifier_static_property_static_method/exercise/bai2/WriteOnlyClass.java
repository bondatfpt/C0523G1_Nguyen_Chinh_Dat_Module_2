package ss05_access_modifier_static_property_static_method.exercise.bai2;

public class WriteOnlyClass {
     String name = "John";
     String classes = "C02";
    WriteOnlyClass(){}; // Constructor không tham số; access modifier là default;
    String setName(String name){
        return this.name = name;
    }
    String setClasses (String classes){
         return this.classes = classes;
    }

}
