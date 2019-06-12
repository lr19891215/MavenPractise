package demo02;

import java.util.function.Predicate;

public class Demo05 {
    public static void main(String[] args) {
        String str = "days";
        Predicate<String> p1 = a->a.length()>5;
        Predicate<String> p2 = a->a.contains("a");
        System.out.println(p1.and(p2).test(str));
        System.out.println(p1.or(p2).test(str));
        System.out.println(p1.negate().test(str));
    }
}
