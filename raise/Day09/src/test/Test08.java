package test;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test08 {
    public static void main(String[] args) throws IOException {
        Reader fr = new FileReader("D:\\b.txt");
        int len = 0;
        int i = 0;
        while ((len = fr.read())!= -1) {
            if(len == 'a') {
                i ++;
            }
        }
        fr.close();
        System.out.println("a出现" + i +"次");
    }
}
