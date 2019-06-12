package test.test01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Test01 {
    public static void main(String[] args) throws Exception {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\a.txt"));
        bos.write(97);
        bos.close();
    }
}
