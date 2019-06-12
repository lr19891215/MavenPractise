package cn.itcast.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        Integer demo = ac.getBean("demo", Integer.class);
//        System.out.println(demo);
        Demo3 demo3 = ac.getBean("demo3", Demo3.class);
        System.out.println(demo3.getList());
        System.out.println(demo3.getMap());
    }
}
