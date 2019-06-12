package test.zixi.test03;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(83);
        list.add(72);
        list.add(72);
        int index = findIndex(list,72);
        System.out.println("72的索引是" + index);
        System.out.println("替换前:" + list);
        replace(list,72,66);
        System.out.println("替换后:" + list);
    }

    public static int findIndex(ArrayList<Integer> list,int num) {
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == num) {
                index = i;
                break;
            }
        }
        return index;
    }
    public static void replace(ArrayList<Integer> list,int oldnum,int newnum) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == oldnum) {
                list.remove(i);
                list.add(i,newnum);
            }
        }
    }
}
