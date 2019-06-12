package test.test10;

import java.util.ArrayList;
import java.util.Random;

public class Test10 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i]= r.nextInt(100) + 1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 10) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
