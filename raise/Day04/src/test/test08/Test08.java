package test.test08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test08 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bcd");
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str += list.get(i);
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : str.toCharArray()) {
            if(map.containsKey(c)) {
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else {
                map.put(c,1);
            }
        }
        for(Character key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
