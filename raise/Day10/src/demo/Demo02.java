package demo;

import java.io.*;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\b.txt"));

        String line = null;
        while ((line = br.readLine())!= null) {
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
