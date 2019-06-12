package tickes;

public class Demo {
    public static void main(String[] args) {

        RunnableImpl impl = new RunnableImpl();
        Thread t1 = new Thread(impl, "1号窗口");
        Thread t2 = new Thread(impl, "2号窗口");
        Thread t3 = new Thread(impl, "3号窗口");

        t1.start();
        t2.start();
        t3.start();

    }
}
