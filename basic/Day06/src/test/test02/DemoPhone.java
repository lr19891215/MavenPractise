package test.test02;

public class DemoPhone {
    public static void main(String[] args) {

        Phone ph = new Phone();
        ph.setBrand("小米");
        ph.setPrice(998);

        Phone ph1 = new Phone("小米",998);
        ph.call();
        ph1.sendMessage();
        ph1.playGame();
    }
}
