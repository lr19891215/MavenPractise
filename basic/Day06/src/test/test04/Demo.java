package test.test04;

public class Demo {

    public static void main(String[] args) {
        Cat c = new Cat();
        c.setColor("花色");
        c.setBreed("波斯猫");
        c.eat();
        c.catchMouse();
        Dog d = new Dog("黑色","旺财");
        d.eat();
        d.lookHome();
    }

}
