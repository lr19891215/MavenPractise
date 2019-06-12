package demo03;

public class NewPhone extends Phone {

    public NewPhone(){
        super(10);
        System.out.println("zi()");
    }
    public void show() {
        super.show();
        System.out.println("显示姓名");
        System.out.println("显示地址");

    }
}
