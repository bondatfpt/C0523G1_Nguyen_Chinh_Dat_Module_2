package ss10_dsa_list.exercise.arrayList;


public class Student {
    private int id;
    private String name ;
    private int date ;
    private float mediumScore ;
    public Student(int id){
        this.id = id;
    }

    public Student(int id, String name, int date, float mediumScore) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.mediumScore = mediumScore;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDate() {
        return this.date;
    }
    public void setDate(int date) {
        this.date = date;
    }
    public float getMediumScore() {
        return this.mediumScore;
    }
    public void setMediumScore(float mediumScore) {
        this.mediumScore = mediumScore;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", mediumScore=" + mediumScore +
                '}';
    }
}
