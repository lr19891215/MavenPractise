package test.test07;

import java.util.Random;

public class BoundRandom {
    public int getRandom(int begin,int end) {
        Random r = new Random();
        int num = r.nextInt(end - begin + 1) + begin;
        return num;
    }

}
