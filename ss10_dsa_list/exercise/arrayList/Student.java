package ss10_dsa_list.exercise.arrayList;


public class Student {
    private int id = 1;
    private String name = "Dat";
    private int date = 1999;
    private float mediumScore = 10;
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
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public float getMediumScore() {
        return mediumScore;
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
