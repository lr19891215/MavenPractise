package demo;

import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.stream().map(a->Double.parseDouble(a)).forEach(a-> System.out.println(a));
    }
}
