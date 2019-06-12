package demo;

public class Demo1Student {

    public static void main(String[] args) {
        Student stu = new Student();

        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("===========");
        stu.name = "鲁迅";
        stu.age = 20;

        System.out.println(stu.name);
        System.out.println(stu.age);

        stu.eat();
        stu.sleep();
        stu.study();
    }
}
