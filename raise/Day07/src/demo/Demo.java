package demo;

public class Demo {
    public static void main(String[] args) {
        new Thread(
                ()->{
                    System.out.println(Thread.currentThread().getName());
                }).start();

    }
}
