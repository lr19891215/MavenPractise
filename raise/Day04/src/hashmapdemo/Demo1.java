package hashmapdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("a", "a");
        map.put("c", "c");
        map.put("b","b");
        System.out.println(map);

        LinkedHashMap<String,String> linked = new LinkedHashMap<>();
        linked.put("a","a");
        linked.put("c","c");
        linked.put("b","b");
        System.out.println(linked);
    }
}
