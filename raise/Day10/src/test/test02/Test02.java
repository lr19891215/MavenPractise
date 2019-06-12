package test.test02;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Test02 {
    public static void main(String[] args) throws Exception {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\a.txt"));
        byte[] bytes = {'i',' ','l','o','v','e',' ','j','a','v','a'};
        bos.write(bytes);
        bos.close();
    }
}
