package deta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DetaFormat {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);

        String strBorn = "1989-12-15 03:12:13";
        Date date = sdf.parse(strBorn);
        System.out.println(date);
    }
}
