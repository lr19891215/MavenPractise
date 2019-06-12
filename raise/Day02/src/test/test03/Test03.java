package test.test03;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        System.out.println(toList(array));
    }

    public static ArrayList<Integer> toList(int [] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        return list;
    }
}
