package case_study_module_2.model;

import java.util.Date;

public abstract class Person {
    private int id;
    private String name;
    private Date date;
    private boolean gender;
    private String phoneNumber;
    private String identityNumber;
    private String email;

    public Person(int id, String name, Date date, boolean gender, String phoneNumber, String identityNumber, String email) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.identityNumber = identityNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
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
