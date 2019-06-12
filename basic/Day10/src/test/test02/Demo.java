package test.test02;

public class Demo {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        Dog dog = (Dog) animal;
        dog.lookHome();

        Cat cat = new Cat();
        cat.catchMouse();
    }
}
