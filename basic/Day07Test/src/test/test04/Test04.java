package test.test04;

import java.util.ArrayList;

public class Test04 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("曹操",35));
        list.add(new Student("刘备",40));
        list.add(new Student("孙权",20));
        list.add(new Student("司马懿",30));

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名:" + stu.getName() + " 年龄:" + stu.getAge());
        }
    }
}
