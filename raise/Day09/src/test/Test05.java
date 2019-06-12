package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test05 {
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("D:\\b.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes))!=-1) {
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
    }
}
