package demo;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        File f = new File("E:\\就业班");
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
