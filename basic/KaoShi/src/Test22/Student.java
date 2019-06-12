package Test22;

public class Student {

    String name;
    int score;
    Teacher teacher;

    public void getMyResult() {
        System.out.println("我是学生" + name + ",我的老师是"
                + teacher.name + ",他教我" + teacher.course + "学科");
        if(score >= 60) {
            System.out.println("继续加油哦");
        }else if(score < 60) {
            System.out.println("成绩太低了，老师" + teacher.name + "让我回去罚写100遍");
        }
    }

    public Student() {
    }

    public Student(String name, int score, Teacher teacher) {
        this.name = name;
        this.score = score;
        this.teacher = teacher;
    }
}
