package demo02;

import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        Supplier<String> supplier = ()->{
            return "sss";
        };
        String str = supplier.get();
        System.out.println(str);
    }
}
