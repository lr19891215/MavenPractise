package demo01;

public class MyInterfaceAImpl implements MyInterfaceA {
    @Override
    public void interface01() {
        System.out.println("方法执行");
    }

    @Override
    public void interface02() {

    }

    @Override
    public void interface03() {

    }

    @Override
    public void interface04() {

    }

    @Override
    public void interface05() {
        System.out.println("重写默认方法");
    }
}
