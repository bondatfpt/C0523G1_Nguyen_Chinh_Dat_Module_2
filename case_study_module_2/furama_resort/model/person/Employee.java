package case_study_module_2.furama_resort.model.person;

public class Employee extends Person {
    private String level;
    private String position;
    private double salary;

    public Employee(String id) {
        super(id);
    }

    public Employee(String id, String name, String date, String gender,
                    String phoneNumber, String identityNumber, String email)
    {super(id, name, date, gender, phoneNumber, identityNumber, email);}
    public Employee(String id, String name, String date, String gender, String phoneNumber,
                    String identityNumber, String email, String level, String position, double salary)
    {super(id, name, date, gender, phoneNumber, identityNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;}
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getInforToDisplay(){
        return "Id: " + this.getId() + ","+" " + "Name: " +  this.getName() + ","+" " + "Date of birth: " + this.getDate()
                + "," +" "+ "Gender: " + this.getGender() + ","+ " " + "Phone number: " + this.getPhoneNumber() + "\n" +
                "Identity number: "+ this.getIdentityNumber() + "," +" " + "Email: " + this.getEmail() +","+" "
                +"Level: " +this.level + ","+ " " + "Position: " + this.position + ","+" " + "Salary: " + this.salary +"$"+"\n"
                +"--------------------------------------------------------------------------------------------------------";
    }
    public String getInforToCsv (){
        return this.getId()+","+this.getName()+","+this.getDate()+","+this.getGender()+","+this.getPhoneNumber()
                +","+this.getIdentityNumber()+","+this.getEmail()+","+this.getLevel()+","+this.getPosition()+","+this.getSalary();
    }
    @Override
    public String toString() {
        return super.toString()+"Employee{" +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                "} ";
    }
}
