package test.zixi.test01;

import java.util.Random;

public class Test01 {

    public static void main(String[] args) {
        char[] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};
        for (int i = 0; i < 10; i++) {
            System.out.print("随机验证码:");
            random(arr);
            System.out.println();
        }
    }

    public static void random(char[]array) {
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(62);
            System.out.print(array[num]);
        }
    }
}
