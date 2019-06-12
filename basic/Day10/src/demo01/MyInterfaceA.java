package demo01;

public interface MyInterfaceA {

    public abstract void interface01();
    abstract void interface02();
    public void interface03();
    void interface04();
    public default void interface05() {
        System.out.println("默认方法执行");
    }
    public static void interface06() {
        System.out.println("静态方法");
    }

}
