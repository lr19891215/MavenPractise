package Test22;

public class Demo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "张三";
        teacher.course = "英语";
        teacher.teaching();
        Student student = new Student();
        student.name = "王五";
        student.score = 30;
        student.teacher = teacher;
        student.getMyResult();
    }
}
