package test;

import java.io.*;

public class Test06 {
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("D:\\b.txt");
        OutputStream fos = new FileOutputStream("D:\\c.txt");
        int len = 0;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }
        fis.close();
    }
}
