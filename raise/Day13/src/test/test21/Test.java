package test.test21;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {
        ArrayList<Book> list = new ArrayList<>();
        BufferedReader fr = new BufferedReader(new FileReader("E:\\IdeaProjects\\raise\\Day13\\src\\test\\test21\\book.txt"));
        String len;
        while ((len = fr.readLine()) !=null) {
            String[] split = len.split(",");
            double d = Double.parseDouble(split[1]);
            int i = Integer.parseInt(split[2]);
            list.add(new Book(split[0],d,i));
        }
        double sum = 0;
        for (Book book : list) {
            System.out.println(book.getName()+",共计"+book.getPrice()*book.getNumber()+"元");
            sum += book.getPrice()*book.getNumber();
        }
        System.out.println("图书总金额为:"+sum+"元");
        fr.close();
    }
}
