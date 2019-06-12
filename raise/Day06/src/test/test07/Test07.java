package test.test07;

public class Test07 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("播放背景音乐");
                }
            }
        }).start();

        for (int i = 0; i < 20; i++) {
            System.out.println("显示画面");
        }
    }
}
