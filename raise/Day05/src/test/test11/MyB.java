package test.test11;

public class MyB extends Thread{
    @Override
    public void run() {
        long b1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            String b = "黑马程序员";
        }
        long e = System.currentTimeMillis();
        System.out.println("b的计算时间为:" + (e - b1));
    }
}
