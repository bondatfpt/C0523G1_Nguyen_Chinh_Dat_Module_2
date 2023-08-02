package case_study_module_2.furama_resort.model.person;

public abstract class Person {
    private String id;
    private String name;
    private String date;
    private String gender;
    private String phoneNumber;
    private String identityNumber;
    private String email;

    public Person(String id){
        this.id = id;
    }

    public Person(String id, String name, String date, String gender, String phoneNumber, String identityNumber, String email) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.identityNumber = identityNumber;
        this.email = email;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", gender=" + gender +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", identityNumber='" + identityNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
