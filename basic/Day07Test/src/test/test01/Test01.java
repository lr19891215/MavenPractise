package test.test01;
//键盘输入三个int,求最大值
import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数:");
        int a = sc.nextInt();
        System.out.println("输入第二个数:");
        int b = sc.nextInt();
        System.out.println("输入第三个数:");
        int c = sc.nextInt();

        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("最大值为:" + max);
    }

}
