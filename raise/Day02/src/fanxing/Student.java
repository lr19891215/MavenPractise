package fanxing;

public class Student<E> {
    E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
