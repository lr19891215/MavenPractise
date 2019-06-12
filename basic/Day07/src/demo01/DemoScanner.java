package demo01;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个整数:");
        int num1 = sc.nextInt();
        System.out.println("输入第二个整数:");
        int num2 = sc.nextInt();
        System.out.println("两个数的和为:" + (num1 + num2));
    }

}
