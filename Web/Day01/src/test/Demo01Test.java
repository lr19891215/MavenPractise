package test;

import junit.Demo01;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Demo01Test {
    @Before
    public void b(){
        System.out.println("before");
    }
    @After
    public void c(){
        System.out.println("after");
    }

    @Test
    public void aTest(){
        Demo01 demo = new Demo01();
        int rel = demo.a(2, 3);
        Assert.assertEquals(5,rel);

    }
}
