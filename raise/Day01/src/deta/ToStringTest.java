package deta;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ToStringTest{
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(date));

        String text = "2019-03-04";
        Date date2 = sdf.parse(text);
        System.out.println(date2);

        Calendar c = Calendar.getInstance();
        c.set(2018,2,14);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);
    }
}

