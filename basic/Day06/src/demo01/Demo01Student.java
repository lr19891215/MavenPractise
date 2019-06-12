package demo01;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println("姓名:" + stu1.getName() + " 年龄:" + stu1.getAge());
        stu1.setName("张三丰");
        stu1.setAge(98);
        System.out.println("姓名:" + stu1.getName() + " 年龄:" + stu1.getAge());

        Student stu2 = new Student("张无忌",18);
        System.out.println("姓名:" + stu2.getName() + " 年龄:" + stu2.getAge());
    }
}
