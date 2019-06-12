package test.test01;

public class Worker extends Person{
    String unit;
    int workAge;
    @Override
    public void work() {
        System.out.println("工人的工作是盖房子");
    }
}
