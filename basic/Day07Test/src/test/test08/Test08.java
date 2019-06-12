package test.test08;

import java.util.ArrayList;
import java.util.Random;

public class Test08 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 30; i++) {
            list1.add(r.nextInt(99) + 2);
        }
        System.out.println("随机数为:");
        System.out.println(list1);

        for (int i = 0; i < list1.size(); i++) {
            Integer num = list1.get(i);
            if (islist(num)) {
                list2.add(list1.get(i));
            }
        }
        System.out.println("其中的质数为:");
        System.out.println(list2);
    }

        public static boolean islist(int n){
            boolean num = true;
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    num = false;
                }
            }
            return num;
        }
}