package test.test03;

public class Demo {
    public static void main(String[] args) {
        usePhone();
    }

    public static void usePhone () {
        Phone phone = new NewPhone();
        phone.call();
        phone.message();
        NewPhone newPhone = (NewPhone) phone;
        newPhone.play();
    }
}
