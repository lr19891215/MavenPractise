package test.test06;

public class Demo {
    public static void main(String[] args) {
        RunnableImpl impl = new RunnableImpl();
        Thread thread = new Thread(impl);
        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("主线程执行");
        }
    }
}
