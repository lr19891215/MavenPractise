package test.zixi.test05;

import java.util.ArrayList;
import java.util.Random;

public class Test05 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list = getScoreList();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1 = countScore(list);
        printCount(list1);
    }

    public static ArrayList<Integer> getScoreList() {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add(r.nextInt(101));
        }
        return list;
    }

    public static ArrayList<Integer> countScore(ArrayList<Integer> list) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) <= 100 && list.get(i) >= 80) {
                a++;
            }else if(list.get(i) < 80 && list.get(i) >= 60){
                b++;
            }else if(list.get(i) < 60 && list.get(i) >= 40){
                c++;
            }else if(list.get(i) < 40 && list.get(i) >= 0){
                d++;
            }
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(a);
        list1.add(b);
        list1.add(c);
        list1.add(d);
        return list1;
    }

    public static void printCount(ArrayList<Integer> list) {
        System.out.println("100分--80分:" + list.get(0) + "人");
        System.out.println("79分--60分:" + list.get(1) + "人");
        System.out.println("59分--40分:" + list.get(2) + "人");
        System.out.println("39分--0分:" + list.get(3) + "人");
        }
}
