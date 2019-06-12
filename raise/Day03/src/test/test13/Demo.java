package test.test13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        Student stu1 = new Student("liusan",20,90.0F);
        Student stu2 = new Student("lisi",22,90.0F);
        Student stu3 = new Student("wangwu",20,99.0F);
        Student stu4 = new Student("sunliu",22,100.0F);
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list,stu1,stu2,stu3,stu4);
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = (int)(o2.getScore() - o1.getScore());
                if(result ==0) {
                    result = o1.getAge() - o2.getAge();
                }
                return result;
            }
        });
        System.out.println(list);
    }
}
