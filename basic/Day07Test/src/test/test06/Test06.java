package test.test06;

import java.util.ArrayList;
import java.util.Random;

public class Test06 {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            bigList.add(num);
        }
        ArrayList<Integer> list = getlist(bigList);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static ArrayList<Integer> getlist(ArrayList<Integer> list) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0) {
                smallList.add(list.get(i));
            }
        }
        return smallList;
    }
}
