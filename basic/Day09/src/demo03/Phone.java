package demo03;

public class Phone {

    public Phone(){
        System.out.println("fu()");
    }
    public Phone(int num) {
        System.out.println("fu(i)");
    }

    public void call(){
        System.out.println("打电话");
    }

    public void show() {
        System.out.println("显示号码");
    }
}
