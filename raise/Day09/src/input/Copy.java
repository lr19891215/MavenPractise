package input;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copy {
    public static void main(String[] args) throws Exception {
        long b = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\源图片\\人马座.jpg");
        FileOutputStream fos = new FileOutputStream("E:\\人马座.jpg");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes))!=-1) {
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println(e-b);
    }
}
