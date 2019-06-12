package test.test08;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("我需要一个老师");
        try {
            Thread.sleep(2000);
            System.out.println("张三丰老师正在辅导我...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("教完我JAVA后,老师回到了办公室");

    }
}
