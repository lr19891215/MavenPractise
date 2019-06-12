package test.test02;

import java.util.ArrayList;
import java.util.Collection;

public class Test02 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println("a:"+listTest(list, "a"));
        System.out.println("b:"+listTest(list, "b"));
        System.out.println("c:"+listTest(list, "c"));
        System.out.println("xxx:"+listTest(list, "xxx"));

    }

    public static int listTest(Collection<String> list,String s){
        int num = 0;
        for(String str : list) {
            if(str == s) {
                num ++;
            }
        }
        return num;
    }
}
