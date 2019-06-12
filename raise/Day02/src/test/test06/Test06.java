package test.test06;

import java.util.ArrayList;

public class Test06 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        System.out.println(listTest(al));
    }

    public static boolean listTest(ArrayList<String> al) {
        return al.isEmpty();
    }
}
