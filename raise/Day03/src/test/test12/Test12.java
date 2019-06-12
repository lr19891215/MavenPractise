package test.test12;

import java.util.HashSet;
import java.util.Random;

public class Test12 {
    public static void main(String[] args) {
        Random r = new Random();
        HashSet<Integer> hs = new HashSet<>();
        while (true) {
            if(hs.size() == 6) {
                break;
            }
            hs.add(r.nextInt(33) + 1);
        }
        int b = r.nextInt(16) + 1;
        System.out.println("红色球号码:" + hs);
        System.out.println("蓝色球号码:" + b);
    }
}
