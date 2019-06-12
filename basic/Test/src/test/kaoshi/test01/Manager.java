package test.kaoshi.test01;

public class Manager implements Company{
    String name;
    String dept;

    @Override
    public void working() {
        System.out.println("我是" + name +"主管,我主要负责" + dept + "部门");
    }

    public Manager() {
    }

    public Manager(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
}
