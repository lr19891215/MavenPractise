package input;

import java.io.FileInputStream;
import java.io.InputStream;

public class DemoInput2 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("Day09\\src\\output\\a.txt");
            int len ;
            byte[] bytes = new byte[1024];
            while ((len = is.read(bytes))!= -1) {
                System.out.print(new String(bytes,0,len));
            }
            is.close();
    }
}
