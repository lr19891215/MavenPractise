package deta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("输入生日:");
        String b = new Scanner(System.in).next();
        Date bir = sdf.parse(b);
        long a = bir.getTime();
        long today = System.currentTimeMillis();
        System.out.println((today-a)/1000/60/60/24);
    }
}
