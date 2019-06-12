package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test04 {
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("D:\\b.txt");
        int len;
        while ((len = fis.read()) != -1) {
            System.out.print((char) len);
        }
        fis.close();
    }
}
