package Demo01;


public class Demo {
    public static void main(String[] args) {
        invokecook(() ->{
            System.out.println("Lambda表达式");
        });
    }
    public static void invokecook(Cook cook) {
        cook.makeFood();
    }
}
