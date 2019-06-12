package test.test11;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        System.out.println("请输入字符串:");
        String str = new Scanner(System.in).next();
        char[] array = str.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        for (Character character : set) {
            System.out.print(character);
        }
    }
}
