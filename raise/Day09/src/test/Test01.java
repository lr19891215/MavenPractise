package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test01 {
    public static void main(String[] args) throws IOException {
        OutputStream fos = new FileOutputStream("D:\\a.txt");
        fos.write(97);
        fos.close();
    }
}