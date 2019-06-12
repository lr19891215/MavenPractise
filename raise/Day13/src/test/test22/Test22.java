package test.test22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Test22 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"tom","kobe","jordan","tracy","westbook","yaoming","ace","stephen");
        Stream<String> s1 = list1.stream().filter(a->a.length() > 4).limit(3);
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"beyonce", "jay_z", "adele", "taylor","bieber","ladygaga");
        Stream<String> s2 = list2.stream().filter(a->a.contains("a")).skip(1);
        ArrayList<String> list = new ArrayList<>();
        Stream.concat(s1,s2).forEach(s->list.add(s));
        Collections.sort(list, (o1,o2)->o2.charAt(0) - o1.charAt(0));
        list.stream().forEach(a-> System.out.println(a));
    }
}
