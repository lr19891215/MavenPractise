package test.test03;

public class Demo {
    public static void main(String[] args) {
        Teacher tea = new Teacher();
        tea.setName("大鹏");
        tea.setAge(30);
        tea.setContent("Java基础中面向对象");
        tea.eat();
        tea.teach();

        Student stu = new Student("小辉辉",18,"面向对象");
        stu.eat();
        stu.study();
    }
}
