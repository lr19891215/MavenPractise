package Demo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Demo03 {
    public static void main(String[] args) throws Exception {
        while (true) {
            Thread.sleep(3000);
            Socket socket = new Socket("192.168.21.22", 1599);
            FileInputStream fis = new FileInputStream("E:\\1.jpg");
            OutputStream os = socket.getOutputStream();
            byte[] b = new byte[1024];
            int len;
            while ((len = fis.read(b)) != -1) {
                os.write(b, 0, len);
            }

            socket.shutdownOutput();

            InputStream is = socket.getInputStream();
            while ((len = is.read(b)) != -1) {
                System.out.println(new String(b, 0, len));
            }

            is.close();
            os.close();
            fis.close();
        }
    }
}
