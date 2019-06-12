package demo01;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("输入年龄:");
        int num = sc.nextInt();

        System.out.println("输入姓名");
        String name = sc.next();

        System.out.println("我是" + name + ",今年" + num + "岁");
    }
}
