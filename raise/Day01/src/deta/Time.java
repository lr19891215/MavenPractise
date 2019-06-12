package deta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Time {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入出生日期,格式yyyy-MM-dd:");
        String bir = new Scanner(System.in).next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birDate = sdf.parse(bir);
        Date today = new Date();
        long bir2 = birDate.getTime();
        long today2 = today.getTime();
        System.out.println((today2 - bir2)/1000/60/60/24);
    }
}
