package junit;

import java.lang.reflect.Field;

public class Demo02 {
    public static void main(String[] args) throws Exception {

        Class cla1 = Class.forName("junit.Penson");

        Class cla2 =  Penson.class;

        Penson penson = new Penson();
        Class cla3 = penson.getClass();

        Field[] fields = cla2.getFields();
        System.out.println(fields.length);


        System.out.println(penson.getAge());
        penson.setAge(120);
        System.out.println(penson.getAge());

        Field[] f = cla2.getDeclaredFields();
        System.out.println(f.length);

        Field name = cla2.getDeclaredField("name");
        name.setAccessible(true);
        name.set(penson,"zhang");
        System.out.println(name.get(penson));
    }
}
