package test.jichu;

import java.io.File;

public class Test08 {
    public static void main(String[] args) {
        File f = new File("E:\\就业班\\day08_File类_递归");
        for (File file : f.listFiles()) {
            if(file.isFile()) {
                System.out.println(file);
            }
        }
    }
}
