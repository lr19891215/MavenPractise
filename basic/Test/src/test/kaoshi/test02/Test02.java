package test.kaoshi.test02;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("请输入:");
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if(num % 2 == 0) {
                list1.add(num);
            }else if(num % 2 != 0) {
                list2.add(num);
            }
        }
        System.out.println("偶数集合:" + list1);
        System.out.println("奇数集合:" + list2);
        ArrayList<Integer> list = puls(list1,list2);
        System.out.println(list);


    }

    public static ArrayList<Integer> puls(ArrayList<Integer> list1,ArrayList<Integer> list2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            list.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            list.add(list2.get(i));
        }
        return list;
    }

}
