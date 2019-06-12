package test.test03;

public class Demo01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        RunnableImpl runnable = new RunnableImpl();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
