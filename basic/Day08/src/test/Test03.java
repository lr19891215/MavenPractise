package test;

public class Test03 {
    public static void main(String[] args) {
        String str = "arscitheyBOW";
        System.out.println(conversion(str));
    }

    public static String conversion(String str) {
        String begin = str.substring(0,1);
        String end = str.substring(1);
        String s = begin.toUpperCase() + end.toLowerCase();
        return s;
    }
}
