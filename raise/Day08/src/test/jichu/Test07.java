package test.jichu;

import java.io.File;
import java.io.IOException;

public class Test07 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\a.txt");
        f1.createNewFile();
        if(f1.isFile()) {
            System.out.println("a.txt是一个文件");
        }else {
            System.out.println("a.txt不是一个文件");
        }

        File f2 = new File("D:\\aaa");
        f2.mkdirs();
        if(f2.isDirectory()) {
            System.out.println("aaa是一个文件夹");
        }else {
            System.out.println("aaa不是一个文件夹");
        }
    }
}
