package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test02 {
    public static void main(String[] args) throws IOException {
        OutputStream fos = new FileOutputStream("D:\\b.txt");
        byte[] bytes = {'i',' ','l','o','v','e',' ','j','a','v','a'};
        fos.write(bytes);
        fos.close();
    }
}
