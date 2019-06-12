package list;

import java.util.ArrayList;
import java.util.List;

public class LiseDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.set(1,6);
        System.out.println(list);
        System.out.println(list.get(0));

        for (int i:list) {
            System.out.println(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
