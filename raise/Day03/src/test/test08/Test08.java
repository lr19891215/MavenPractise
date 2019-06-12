package test.test08;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test08 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("王昭君");
        lhs.add("王昭君");
        lhs.add("西施");
        lhs.add("杨玉环");
        lhs.add("貂蝉");
        Iterator<String> it = lhs.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }
        for (String lh : lhs) {
            System.out.println(lh);
        }
    }
}
