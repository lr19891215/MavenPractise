package baozi;

public class BaoZiPu extends Thread{

    private BaoZi baoZi;

    public BaoZiPu(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (baoZi) {
                if (baoZi.flag == true) {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("包子铺正在做包子");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                baoZi.flag = true;
                baoZi.notify();
            }
        }
    }
}
