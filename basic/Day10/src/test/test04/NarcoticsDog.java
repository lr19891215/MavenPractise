package test.test04;

public class NarcoticsDog extends Animal implements Narcotics{
    @Override
    public void roar() {
        System.out.println("汪汪叫");
    }

    @Override
    public void eat() {
        System.out.println("啃骨头");
    }

    @Override
    public void narcotics() {
        System.out.println("用鼻子测毒");
    }
}
