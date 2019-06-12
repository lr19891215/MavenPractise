package test.test09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1930,"乌拉圭");
        map.put(1934,"意大利");
        map.put(1938,"意大利");
        map.put(1950,"乌拉圭");
        map.put(1954,"西德");
        map.put(1958,"巴西");
        map.put(1962,"巴西");
        map.put(1966,"英格兰");
        map.put(1970,"巴西");
        map.put(1974,"西德");
        map.put(1978,"阿根廷");
        map.put(1982,"意大利");
        map.put(1986,"阿根廷");
        map.put(1990,"西德");
        map.put(1994,"巴西");
        map.put(1998,"法国");
        map.put(2002,"巴西");
        map.put(2006,"意大利");
        map.put(2010,"西班牙");
        map.put(2014,"德国");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份:");
        Integer year1 = sc.nextInt();
        if(map.containsKey(year1)) {
            System.out.println(year1 + "年,获得世界杯冠军的是:" + map.get(year1));
        }else {
            System.out.println("没有举办世界杯");
        }
        System.out.println("请输入一个国家名称:");
        String str = sc.next();
        if(map.containsValue(str)) {
            for(Integer key : map.keySet()) {
                String value = map.get(key);
                if(value.equals(str)) {
                    System.out.println(key);
                }
            }
        }else {
            System.out.println("没有获得过世界杯");
        }
    }
}
