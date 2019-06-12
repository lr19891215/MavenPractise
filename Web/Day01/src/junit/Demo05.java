package junit;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

@MyAnno(className = "junit.Penson",method = "eat")
public class Demo05 {
    public static void main(String[] args) throws Exception {
        //通过反射获取注解对象22
        Class<Demo05> demo05 = Demo05.class;
        MyAnno annotation = demo05.getAnnotation(MyAnno.class);
        //读取注解中的属性
        String className = annotation.className();
        String method = annotation.method();
        //根据注解中的属性获取字节码对象和方法对象
        Class cla = Class.forName(className);
        Method eat = cla.getMethod(method);
        //执行构造器
        Constructor c = cla.getConstructor();
        Object o = c.newInstance();
        //执行方法
        eat.invoke(o);
    }
}
