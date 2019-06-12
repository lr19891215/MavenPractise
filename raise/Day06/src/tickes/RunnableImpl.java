package tickes;

public class RunnableImpl implements Runnable{
    Object obj = new Object();
    int tiakets = 100;
    @Override
    public void run() {
        while (true){
            synchronized  (obj){
                if(tiakets > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + tiakets + "张票");
                    tiakets--;
                }
            }

        }

    }
}
