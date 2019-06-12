package demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1599);
        while (true) {
            Socket socket = ss.accept();
            FileOutputStream fos = new FileOutputStream("E:\\upload\\" + UUID.randomUUID() + ".jpg");
            InputStream is = socket.getInputStream();
            byte[] b = new byte[1024];
            int len;
            while ((len = is.read(b)) != -1) {
                fos.write(b, 0, len);
            }
            OutputStream os = socket.getOutputStream();
            os.write("收货成功".getBytes());
            os.close();
            fos.close();
            is.close();
        }
    }
}
