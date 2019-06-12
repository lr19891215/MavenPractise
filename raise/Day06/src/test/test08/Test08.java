package test.test08;

public class Test08 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "--->" + i);
                }
            }
        },"子线程").start();

        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}
