package input;

import java.io.FileInputStream;
import java.io.InputStream;

public class DemoInput {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("Day09\\src\\output\\a.txt");
            int content ;
            while ((content = is.read())!= -1) {
                System.out.print((char) content);
            }
            is.close();
    }
}
