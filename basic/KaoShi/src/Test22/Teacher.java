package Test22;

public class Teacher implements Teach {

    String name;
    String course;

    @Override
    public void teaching() {
        System.out.println("我是" + name + "老师,我教" + course + "学科");
    }

    public Teacher() {
    }

    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }
}
