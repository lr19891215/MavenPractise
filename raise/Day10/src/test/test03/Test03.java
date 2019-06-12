package test.test03;

import java.io.*;

public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\b.txt"));
        byte[] bytes = new byte[1024];

    }
}
