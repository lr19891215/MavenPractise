package demo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        Properties pp = new Properties();
        pp.load(new FileReader("D:\\a.txt"));

        Set<String> keys = pp.stringPropertyNames();
        for (String key : keys) {
            System.out.println(key + "=" + pp.getProperty(key));
        }
    }
}
