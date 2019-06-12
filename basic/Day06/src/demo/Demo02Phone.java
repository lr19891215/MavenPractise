package demo;

public class Demo02Phone {
    public static void main(String[] args) {

        Phone one = new Phone();
        Phone two = one;

        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("==============");

        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "黑色";

        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

        one.call("乔布斯");
        one.sendMessage();
    }
}
