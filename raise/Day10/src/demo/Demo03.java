package demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\a.txt"),"gbk");
        int c;
        while ((c = isr.read())!= -1) {
            System.out.print((char)c);
        }
        isr.close();
    }
}
