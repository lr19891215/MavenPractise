package test.test11;

public class MyC extends Thread{
    @Override
    public void run() {
        long b = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            String c = "黑马程序员" + i;
        }
        long e = System.currentTimeMillis();
        System.out.println("c的计算时间为:" + (e - b));
    }
}
