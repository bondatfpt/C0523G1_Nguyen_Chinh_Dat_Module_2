package case_study_module_2.furama_resort.model.person;

public class Customer extends Person implements Comparable<Customer> {
    private String type;
    private String address;

    public Customer(String id) {
        super(id);
    }

    public Customer(String id, String name, String date, String gender,
                    String phoneNumber, String identityNumber, String email)
    {super(id, name, date, gender, phoneNumber, identityNumber, email);}

    public Customer(String id, String name, String date, String gender, String phoneNumber,
                    String identityNumber, String email, String type, String address)
    {super(id, name, date, gender, phoneNumber, identityNumber, email);
        this.type = type;
        this.address = address;}

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

    public String getInforToDisplay(){
        return  "Id: "+this.getId()+ " " + ","+"Name: " + this.getName() +","+ " " + "Date: " + this.getDate() +"," +" "+
               "Gender: " +this.getGender() + ","+"Phone number: " + this.getPhoneNumber()+"\n " +"Identity number: "+
                this.getIdentityNumber() +","+" "+"Email: " + this.getEmail() + ","+ " " + "Type: "+
                this.getType() +"," + " "+ "Address: "+ this.getAddress() +"\n"
                +"--------------------------------------------------------------------------------------------------------";
    }
    public String getInforToCsv (){
        return this.getId()+","+this.getName()+","+this.getDate()+","+this.getGender()+","+this.getPhoneNumber()
                +","+this.getIdentityNumber()+","+this.getEmail()+","+this.getType()+","+this.getAddress();
    }
    @Override
    public String toString() {
        return super.toString()+"Customer{" +
                "type='" + type + '\'' +
                ", address='" + address + '\'' +
                "} ";
    }

    @Override
    public int compareTo(Customer o) {
        String id1 = this.getId().substring(3, this.getId().length());
        String id2 = o.getId().substring(3, o.getId().length());
        int idSub1 = Integer.valueOf(id1);
        int idSub2 = Integer.valueOf(id2);
        if (idSub1 > idSub2) {
            return 1;
        } else if (idSub1 == idSub2) {
            return 0;
        } else {
            return -1;
        }
    }
}
