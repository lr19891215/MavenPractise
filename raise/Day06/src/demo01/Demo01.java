package demo01;

public class Demo01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("将进酒");
            }
        }).start();

        new Thread(){
            @Override
            public void run() {
                System.out.println("侠客行");
            }
        }.start();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("蜀道难");
            }
        };
        new Thread(r).start();
    }
}
