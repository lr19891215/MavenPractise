package test.jichu;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\a.txt");
        if(!f1.exists()) {
            f1.createNewFile();
        }
        File f2 = new File("D:\\ccc\\bbb\\aaa");
        f2.mkdirs();
        f1.delete();
        f2.delete();

        new File("D:\\aaa").mkdirs();
        File f3 = new File("D:\\aaa\\b.txt");
        f3.createNewFile();
        System.out.println(f3.getName());
        System.out.println(f3.length());
        System.out.println(f3.getAbsolutePath());

    }
}
