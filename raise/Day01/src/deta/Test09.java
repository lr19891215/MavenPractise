package deta;

public class Test09 {
    public static void main(String[] args) {
        String str = "Hello";
         long b = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str += "World";
        }
        long e = System.currentTimeMillis();
        System.out.println(e - b);

        StringBuilder bu = new StringBuilder("Hello");
        long b2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            bu.append("World");
        }
        long e2 = System.currentTimeMillis();
        System.out.println(e2 - b2);
    }
}
