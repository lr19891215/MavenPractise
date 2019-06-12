package test.test01;

public class Demo {
    public static void main(String[] args) {
        Student student = new Student();
        student.work();
        Worker worker = new Worker();
        worker.work();
        StudentLeader studentLeader = new StudentLeader();
        studentLeader.meeting();
    }
}
