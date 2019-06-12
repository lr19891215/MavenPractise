package test.zixi.test02;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1.录入信息 0.退出");
            int num = sc.nextInt();
            if(num == 1){
                list.add(getStudent());
            }else if(num == 0){
                System.out.println("录入完毕");
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            Student stu = new Student();
            stu = list.get(i) ;
            System.out.println("学生姓名=" + stu.getName() + ", 年龄=" + stu.getAge());
        }
    }
    public static Student getStudent() {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String n = sc.next();
        System.out.println("请输入年龄:");
        int e = sc.nextInt();
        stu.setName(n);
        stu.setAge(e);
        return stu;
    }
}
