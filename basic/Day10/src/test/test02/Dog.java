package test.test02;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("啃骨头");
    }

    public void lookHome() {
        System.out.println("看家");
    }
}
