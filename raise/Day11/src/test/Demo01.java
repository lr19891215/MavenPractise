package test;

import java.io.*;
import java.net.Socket;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        Socket socket =new Socket("192.168.21.22",8006);
        File file = new File("E:\\1.jpg");
        InputStream fis = new FileInputStream("E:\\1.jpg");
        OutputStream os = socket.getOutputStream();
        byte[] b = new byte[1024];
        int len;
        if(file.exists() && file.getName().equals("1.jpg") && file.length() < 2*1024*1024) {
            while ((len = fis.read(b)) != -1) {
                os.write(b, 0, len);
            }
        }

        InputStream is = socket.getInputStream();
        while ((len = is.read(b))!=-1) {
            System.out.println(new String(b,0,len));
        }

        is.close();
        socket.close();
        fis.close();
        os.close();
    }
}
