package junit;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo04 {
    public static void main(String[] args) throws Exception {

        InputStream in = Demo04.class.getClassLoader().getResourceAsStream("config.properties");
        Properties p = new Properties();
        p.load(in);

        String className = p.getProperty("className");
        String methodName = p.getProperty("methodName");

        Class aClass = Class.forName(className);
        Method method = aClass.getMethod(methodName);

        Constructor c = aClass.getConstructor();
        Object o = c.newInstance();

        method.invoke(o);
    }
}
