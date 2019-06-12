package test.test;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws IOException {
        Properties pp = new Properties();
        FileInputStream fis = new FileInputStream("D:\\a.txt");
        pp.load(fis);
        Set<String> set = pp.stringPropertyNames();
        for (String str : set) {
            if("lisi".equals(str)) {
                pp.setProperty(str,"100");
            }
        }
        pp.store(new FileWriter("D:\\a.txt"),"");
        fis.close();
    }
}
