package test.test04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test04 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("张三丰","武当");
        map.put("灭绝","峨眉");
        map.put("空见","少林");
        Collection<String> val = map.values();
        for(String str : val) {
            System.out.println(str);
        }
        Iterator<String> it = val.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
