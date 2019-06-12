package demo01;

public class Demo {
    public static void main(String[] args) {
        MyInterface impl = new MyInterface() {
            @Override
            public void math() {
                System.out.println("匿名内部类");
            }
        };
        impl.math();
    }
}
