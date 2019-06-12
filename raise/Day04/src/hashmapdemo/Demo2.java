package hashmapdemo;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        Map<Person,Integer> map = new HashMap<>();
        map.put(new Person("张无忌","武当"),18);
        map.put(new Person("周芷若","峨眉"),16);
        map.put(new Person("张无忌","明教"),20);
        map.put(new Person("张无忌","明教"),15);
        System.out.println(map);
    }
}
