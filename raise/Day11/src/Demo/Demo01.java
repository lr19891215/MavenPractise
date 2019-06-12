package Demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        while (true) {
            Socket socket = new Socket("192.168.21.80", 9788);
            Scanner sc = new Scanner(System.in);
            System.out.println("输入:");
            String str = sc.next();
            OutputStream os = socket.getOutputStream();
            os.write(str.getBytes());

            socket.shutdownOutput();

            InputStream is = socket.getInputStream();
            byte[] b = new byte[1024];
            int len;
            while ((len = is.read(b)) != -1) {
                System.out.println(new String(b, 0, len));
            }

            socket.close();
            os.close();
        }
    }
}
