package demo;

public class Demo01 {
    public static void main(String[] args) {
        RunnableImpl impl = new RunnableImpl();

        Thread thread = new Thread(impl);
        thread.setName("旺财");
        thread.start();

        new Thread(impl).start();
    }
}
