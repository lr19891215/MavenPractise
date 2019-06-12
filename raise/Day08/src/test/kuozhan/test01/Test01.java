package test.kuozhan.test01;

import java.io.File;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入路径:");
        File f = new File(sc.next());
        int sum = 0;
        if(f.isFile()) {
            System.out.println(f.length());
        }else {
            for (File file : f.listFiles()) {
                if(file.isFile()) {
                    sum += file.length();
                }
            }
            System.out.println(sum);
        }
    }
}
