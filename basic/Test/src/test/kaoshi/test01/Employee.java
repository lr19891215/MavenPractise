package test.kaoshi.test01;

public class Employee {
    String name;
    int score;
    Manager manager;

    public void getResult() {
        System.out.println("我是员工" + name + ",我的主管是"
                + manager.name +",我在" + manager.dept + "部门");
        if(score >= 90) {
            System.out.println("很优秀哦");
        }else if(score < 90) {
            System.out.println("考核不通过,主管" + manager.name + "让我回去罚写10000检讨");
        }
    }



    public Employee() {
    }

    public Employee(String name, int score, Manager manager) {
        this.name = name;
        this.score = score;
        this.manager = manager;
    }
}
