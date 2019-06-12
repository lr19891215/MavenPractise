package test.test10;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Test10 {
    public static void main(String[] args) {
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedHashSet<String> hs = new LinkedHashSet<>();
        for (int i = 0; i < strs.length; i++) {
            hs.add(strs[i]);
        }
        LinkedList<String> list = new LinkedList<>();
        for (String h : hs) {
            list.add(h);
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
