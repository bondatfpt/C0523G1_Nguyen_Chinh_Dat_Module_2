package case_study_module_2.furama_resort.model.person;

public class Customer extends Person {
    private String type;
    private String address;
    public Customer(String id, String name, String date, String gender, String phoneNumber, String identityNumber, String email) {
        super(id, name, date, gender, phoneNumber, identityNumber, email);
    }

    public Customer(String id, String name, String date, String gender, String phoneNumber, String identityNumber, String email, String type, String address) {
        super(id, name, date, gender, phoneNumber, identityNumber, email);
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInforToCsv(){
        return this.getId() + "," + this.getName() +"," + this.getDate() +"," + this.getGender() + "," + this.getPhoneNumber()+"," + this.getIdentityNumber() + "," + this.getEmail() + "," + this.getType() +","+ this.getAddress();
    }
    @Override
    public String toString() {
        return super.toString()+"Customer{" +
                "type='" + type + '\'' +
                ", address='" + address + '\'' +
                "} ";
    }
}