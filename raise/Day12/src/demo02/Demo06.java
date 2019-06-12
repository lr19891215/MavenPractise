package demo02;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo06 {
    public static void main(String[] args) {
        String[] str = {"貂蝉,女","吕布,男","董卓,男","王司徒,男"};
        ArrayList<String> list = new ArrayList<>();
        Predicate<String> p1 =a->{
          String[] split = a.split(",");
          return split[0].length() == 2;
        };
        Predicate<String> p2 =a->{
            String[] split = a.split(",");
            return split[1].equals("男");
        };
        for (String s : str) {
            if(p1.and(p2).test(s)) {
                list.add(s);
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
