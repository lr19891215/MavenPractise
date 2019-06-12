package test.test11;

public class MyA extends Thread{
    @Override
    public void run() {
        long b = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Integer a = i;
        }
        long e = System.currentTimeMillis();
        System.out.println("a的计算时间为:" + (e - b));
    }
}
