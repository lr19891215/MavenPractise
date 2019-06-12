package output;

import java.io.FileWriter;

public class DemoOutPut {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("测试文件.txt");
        fw.write("hello\r\nworld");
        fw.close();
    }
}
