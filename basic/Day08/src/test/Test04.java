package test;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = sc.next();
        char[] chars = toChar(str);
        char[] ch = tolower(chars);
        if(ch[0] != ch[ch.length-1]) {
            char temp = ch[0];
            ch[0] = ch[ch.length-1];
            ch[ch.length-1] = temp;
        }
        for (int i = 0; i < ch.length; i++) {
            if(i % 2 == 0) {
                ch[i] = '~';
            }
        }
        System.out.println("最终显示的效果:");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }

    public static char[] toChar(String str) {
        char[] ch = new char[str.length()];
        for(int i = 0; i < str.length();i++) {
            ch[i] = str.charAt(i);
        }
        return ch;
    }

    public static char[] tolower(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] += 32;
            }
        }
        return ch;
    }
}
