package test.test06;

import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        Person p1 = new Person("张无忌",20);
        Person p2 = new Person("张翠山",30);
        Person p3 = new Person("张无忌",20);
        Person p4 = new Person("张三丰",120);
        HashSet<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.println(set);
    }
}
