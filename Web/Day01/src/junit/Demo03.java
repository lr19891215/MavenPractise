package junit;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


public class Demo03 {
    public static void main(String[] args) throws Exception{
        Class<Penson> cla = Penson.class;
        Constructor[] con = cla.getDeclaredConstructors();
        Object o = con[1].newInstance("zhang", 18);
        System.out.println(o);

        Method eat = cla.getMethod("eat", String.class);
        Penson p = new Penson();
        eat.invoke(p,"sss");
    }
}
