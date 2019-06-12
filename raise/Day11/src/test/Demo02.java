package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8006);
        while (true) {
            Socket socket = ss.accept();
            FileOutputStream fos = new FileOutputStream("E:\\2.jpg");
            InputStream is = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
            OutputStream os = socket.getOutputStream();
            os.write("上传成功".getBytes());
            os.close();
            is.close();
            fos.close();
        }
    }
}
