package demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9788);
        while (true) {
            Socket socket = ss.accept();
            InputStream is = socket.getInputStream();
            byte[] b = new byte[1024];
            int len;
            while ((len = is.read(b)) != -1) {
                System.out.println(new String(b, 0, len));
            }

            OutputStream os = socket.getOutputStream();
            Scanner sc = new Scanner(System.in);
            System.out.println("输入:");
            os.write(sc.next().getBytes());

            os.close();
            is.close();
            socket.close();
        }
    }
}
