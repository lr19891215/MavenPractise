package test.test08;

public class StudentException extends Exception{
    private String number;
    private String name;
    private int score;

    @Override
    public String toString() {
        return "StudentException{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
