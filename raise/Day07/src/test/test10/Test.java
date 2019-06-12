package test.test10;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student[] stu = {new Student("张无忌",60),
                new Student("张三丰",100),
                new Student("张翠山",80)};

        Arrays.sort(stu,(a,b)->b.getScroe() - a.getScroe());

        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i]);
        }
    }
}
