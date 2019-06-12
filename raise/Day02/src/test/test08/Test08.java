package test.test08;

import java.util.ArrayList;

public class Test08 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(listTest(al,3));
    }
    public static int listTest(ArrayList<Integer> al, Integer s) {
        int num =-1;
        for (int i = 0; i < al.size(); i++) {
            if(al.get(i) == s) {
                num = i;
            }
        }
        return num;
    }
}
