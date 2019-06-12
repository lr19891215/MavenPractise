package test.test09;

import java.util.ArrayList;

public class Test09 {
    public static void main(String[] args) {
        Student stu1 = new Student("张无忌",18,"男");
        Student stu2 = new Student("张三丰",98,"男");
        Student stu3 = new Student("周芷若",16,"女");

        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        int max = stu1.age;
        for (int i = 1; i < list.size(); i++) {
            if(max < list.get(i).age) {
                max = list.get(i).age;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(max == list.get(i).age) {
                list.get(i).name = "小猪佩琪";
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
