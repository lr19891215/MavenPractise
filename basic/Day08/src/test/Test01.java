package test;

import java.lang.reflect.Array;

public class Test01 {
    public static void main(String[] args) {
        String str = "1234567890";
        for(int i = 0;i < str.length();i++) {
            System.out.println(str.charAt(i));
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(i,i + 1));
        }
    }
}
