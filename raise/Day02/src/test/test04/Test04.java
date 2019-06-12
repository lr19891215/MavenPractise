package test.test04;

import java.util.ArrayList;
import java.util.Collection;

public class Test04 {
    public static void main(String[] args) {
        Collection<Integer> coll = new ArrayList<>();
        coll.add(1);
        coll.add(2);
        coll.add(3);
        coll.add(4);
        coll.add(5);
        coll.add(6);
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
