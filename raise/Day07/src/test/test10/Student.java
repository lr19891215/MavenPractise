package test.test10;

public class Student {
    private String name;
    private int scroe;

    public Student() {
    }

    public Student(String name, int scroe) {
        this.name = name;
        this.scroe = scroe;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", scroe=" + scroe +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScroe() {
        return scroe;
    }

    public void setScroe(int scroe) {
        this.scroe = scroe;
    }
}
