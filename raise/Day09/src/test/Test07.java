package test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) throws IOException {
        Writer fw = new FileWriter("D:\\b.txt");
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入信息:");
            String str = sc.next();
            if(str.equals("886")) {
                break;
            }else {
                fw.write(str + "\r\n");
            }
        }
        fw.close();
    }
}
