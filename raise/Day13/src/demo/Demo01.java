package demo;

import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("谢逊");
        list.add("张无忌");
        list.add("周芷若");
        list.add("灭绝");
        list.add("张三丰");
        list.add("赵敏");
        list.stream()
                .skip(1).limit(3)
                .forEach(a-> System.out.println(a));
    }
}
