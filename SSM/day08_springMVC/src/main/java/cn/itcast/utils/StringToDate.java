package cn.itcast.utils;


import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate implements Converter<String,Date>{


    @Override
    public Date convert(String source) {
        try {
            if(source!= null) {
                DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
                Date parse = date.parse(source);
                return parse;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
