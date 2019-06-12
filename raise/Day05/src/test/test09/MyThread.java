package test.test09;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
