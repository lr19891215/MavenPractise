package test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[2];
        ArrayList<Student> list = new ArrayList<>();
        Writer fw = new FileWriter("D:\\b.txt");
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入学生信息(学号,姓名):");
            String str = sc.next();
            arr = str.split(",");
            Student student = new Student(arr[0],arr[1]);
            list.add(student);
        }
        for (int i = 0; i < list.size(); i++) {
            fw.write(list.get(i).toString());
            fw.write("\r\n");
        }
        fw.close();
    }
}
