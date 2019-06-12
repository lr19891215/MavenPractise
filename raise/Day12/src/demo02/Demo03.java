package demo02;

import java.util.function.Consumer;

public class Demo03 {
    public static void main(String[] args) {
        Consumer<String> c1 = a -> System.out.println(a);
        Consumer<String> c2 = a -> System.out.println(a);

        c1.andThen(c2).accept("9527");
    }
}
