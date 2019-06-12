package cn.itcast.demo;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.JdbcUtils;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test {

//    private static Map<Object, Object> map;
//    static {
//        try {
//            InputStream in = Test.class.getClassLoader().getResourceAsStream("application.properties");
//            Properties properties = new Properties();
//            properties.load(in);
//            map = new HashMap<Object, Object>();
//            Set<Object> set = properties.keySet();
//            for (Object key : set) {
//                String property = properties.getProperty(key.toString());
//                Class aClass = Class.forName(property);
//                Object o = aClass.newInstance();
//                map.put(key,o);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static Object getObj(String key){
//        return map.get(key);
//    }


    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        DataSource ds = ac.getBean("ds", DataSource.class);
        JdbcTemplate jdbc = new JdbcTemplate(ds);

    }
}
