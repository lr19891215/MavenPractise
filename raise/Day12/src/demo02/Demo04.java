package demo02;

import java.util.function.Consumer;

public class Demo04 {
    public static void main(String[] args) {
        String[] arr = {"郭攸之,男","费祎,男","董允,男","孙尚香,女"};

        Consumer<String> c1 = (a)->{
            String[] str = a.split(",");
            System.out.println("姓名:"+str[0]);
        };
        Consumer<String> c2 = (a)->{
            String[] str = a.split(",");
            System.out.println("姓别:"+str[1]);
        };
        for (String s : arr) {
            c1.andThen(c2).accept(s);
        }
    }
}
