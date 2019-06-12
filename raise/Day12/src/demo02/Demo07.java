package demo02;

import java.util.function.Function;

public class Demo07 {
    public static void main(String[] args) {
        Function<String,Double> fun = a -> Double.parseDouble(a);
        System.out.println(fun.apply("9527"));
    }
}
