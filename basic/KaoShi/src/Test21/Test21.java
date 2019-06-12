package Test21;

import java.util.ArrayList;
import java.util.Scanner;

public class Test21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入第" + i + "个数字:");
            int num = sc.nextInt();
            if(num % 2 == 0 && num >= 100 && num <= 200) {
                list1.add(num);
            }else if(num % 2 != 0 && num >= 100 && num <= 200) {
                list2.add(num);
            }else {
                System.out.println("数字超出范围,请重新输入");
                i--;
            }
        }
        System.out.println("偶数元素集合为:");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        System.out.println("奇数元素集合为:");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
    }
}
