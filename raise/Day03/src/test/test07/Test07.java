package test.test07;

import java.util.ArrayList;
import java.util.List;

public class Test07 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("二丫");
        list.add("钱六");
        list.add("孙七");
        list.set(3,"王小丫");
        System.out.println(list);
    }
}
