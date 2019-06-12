package demo02;

import java.util.function.Supplier;

public class Demo implements Supplier<String>{
    @Override
    public String get() {
        String str = "司马迁砸缸";

        return str;
    }
}
