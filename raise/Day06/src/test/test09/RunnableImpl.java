package test.test09;

public class RunnableImpl implements Runnable {
    int i = 0;

    @Override
    public void run() {
        synchronized (this) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
            System.out.println(Thread.currentThread().getName() + "第" + i + "个经过山洞");
        }

    }
}
