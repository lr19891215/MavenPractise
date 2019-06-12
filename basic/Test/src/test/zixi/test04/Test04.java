package test.zixi.test04;

import java.util.ArrayList;
import java.util.Random;

public class Test04 {
    public static void main(String[] args) {
        printCount(getNumList());
    }

    public static ArrayList<Integer> getNumList() {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(r.nextInt(10) + 1);
        }
        return list;
    }

    public static void printCount(ArrayList<Integer> list) {
        for(int i = 0; i <10; i++) {
            int num = 0;
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j) == i + 1) {
                    num++;
                }
            }
            System.out.println("数字:"+ (i + 1) +"--" + num +"次");
        }
    }
}
