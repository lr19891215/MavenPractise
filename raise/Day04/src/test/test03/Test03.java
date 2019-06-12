package test.test03;

import java.util.HashMap;
import java.util.Map;

public class Test03 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("张三丰","武当");
        map.put("灭绝","峨眉");
        map.put("空见","少林");
        System.out.println(map);
        map.remove("空见");
        System.out.println(map);
        System.out.println(map.get("张三丰"));
    }
}
