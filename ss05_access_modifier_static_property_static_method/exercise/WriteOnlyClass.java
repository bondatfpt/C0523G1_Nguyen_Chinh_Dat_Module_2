package ss05_access_modifier_static_property_static_method.exercise;

public class WriteOnlyClass {
    private String name = "John";
    private String classes = "C02";

    WriteOnlyClass(){}; // Constructor không tham số; access modifier là default;

    // Phương thức main ở class TestAccessModifierDefault nên 2 method dưới đây để access modifier là default;
    String setName(String name){
        return this.name = name;
    }
    String setClasses (String classes){
         return this.classes = classes;
    }

}
