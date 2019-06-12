package test.test05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        HashMap<Car,String> map = new HashMap<>();
        map.put(new Car("哈弗","白"),"15万");
        map.put(new Car("大众","黑"),"20万");
        for(Car key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key+"="+value);
        }
        Set<Map.Entry<Car,String>> ent = map.entrySet();
        for (Map.Entry<Car,String> entry : ent) {
            Car key = entry.getKey();
            String val = entry.getValue();
            System.out.println(key + val);
        }

    }
}
