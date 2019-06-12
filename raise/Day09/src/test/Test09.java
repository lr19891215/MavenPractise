package test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) throws IOException {
        Writer fw = new FileWriter("D:\\b.txt");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生信息:");
            String str = sc.next();
            if(str.equals("end")) {
                break;
            }else {
                fw.write(str + "\r\n");
            }
        }
        fw.close();
    }
}
