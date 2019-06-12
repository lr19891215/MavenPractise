package test.kaoshi.test01;

public class Demo {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "王思聪";
        manager.dept = "万达事业";
        manager.working();
        Employee employee = new Employee();
        employee.name = "李凯";
        employee.score = 60;
        employee.manager = manager;
        employee.getResult();
    }
}
