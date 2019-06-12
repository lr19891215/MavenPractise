package demo02;

public class Demo {
    public static void main(String[] args) {
        Calculate cal = (int x ,int y )->x + y;
        System.out.println(cal.add(10,20));
    }


}
