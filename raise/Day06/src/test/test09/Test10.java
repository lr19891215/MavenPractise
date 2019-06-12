package test.test09;

public class Test10 {
    public static void main(String[] args) {
        RunnableImpl impl = new RunnableImpl();

        new Thread(impl,"张一").start();
        new Thread(impl,"张二").start();
        new Thread(impl,"张三").start();
        new Thread(impl,"张四").start();
        new Thread(impl,"张五").start();
        new Thread(impl,"张六").start();
        new Thread(impl,"张七").start();
        new Thread(impl,"张八").start();
        new Thread(impl,"张九").start();
        new Thread(impl,"张十").start();
    }
}
