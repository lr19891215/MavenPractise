package test.test05;

import java.util.ArrayList;

public class Test05 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("s");
        al.add("a");
        System.out.println(listTest(al,"s"));
    }


    public static boolean listTest(ArrayList<String> al, String s) {
        return al.contains(s);
    }
}
