package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test03 {
    public static void main(String[] args) throws IOException {
        OutputStream fos = new FileOutputStream("D:\\b.txt",true);
        byte[] bytes = {'i',' ','l','o','v','e',' ','j','a','v','a'};
        for (int i = 0; i < 5; i++) {
            fos.write("\r\n".getBytes());
            fos.write(bytes);
        }
        fos.close();
    }
}
