package test.test08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test08  {
    public static void main(String[] args) {
        ExecutorService e = Executors.newFixedThreadPool(2);
        e.submit(new MyRunnable());
    }
}
