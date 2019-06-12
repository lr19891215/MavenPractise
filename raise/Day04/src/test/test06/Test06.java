package test.test06;

import java.util.HashMap;
import java.util.Map;

public class Test06 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
        for(Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + value);
        }
        map.put(5,"李晓红");
        map.remove(1);
        map.put(2,"周林");
        System.out.println(map);
    }
}
