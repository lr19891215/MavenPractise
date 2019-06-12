package test.test01;

public class Student extends Person{
    String school;
    int stuNumber;
    @Override
    public void work() {
        System.out.println("学生需要学习");
    }
}
