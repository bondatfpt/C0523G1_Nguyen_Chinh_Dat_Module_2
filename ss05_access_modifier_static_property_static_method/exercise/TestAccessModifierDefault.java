package ss05_access_modifier_static_property_static_method.exercise;

public class TestAccessModifierDefault {
    public static void main(String[] args) {
        WriteOnlyClass writeOnlyClass = new WriteOnlyClass();
        System.out.println(writeOnlyClass.setName("Name: Chinh Dat"));
        System.out.println(writeOnlyClass.setClasses("Classes: C0523G1"));
    }
}
