package cn.itcast.utils;


import org.apache.commons.io.FileUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Aspect
@Component
public class Power {
//    @Autowired
//    Connection conn;
//    @Pointcut("execution(* cn.itcast.service.impl.*.*(..))")
//    public void pf(){}
//    @Before("pf()")
//    public void begin(){
//        System.out.println("开启");
//    }
//    @AfterReturning("pf()")
//    public void commit() throws SQLException {
//        System.out.println("提交");
//        conn.commit();
//    }
//    @AfterThrowing("pf()")
//    public void rollback() throws SQLException {
//        System.out.println("回滚");
//        conn.rollback();
//    }
//    @After("pf()")
//    public void release() throws SQLException {
//        System.out.println("关闭");
//        conn.close();
//    }
//    @Around("pf()")
    public Object aroundPower(ProceedingJoinPoint pjp) throws IOException {
        Object proceed = null;
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = date.format(new Date());
        String name = pjp.getSignature().getName();
        String str = null;
        try {
            proceed = pjp.proceed(pjp.getArgs());
            str = time+"---"+name+"方法已执行";
        } catch (Throwable throwable){
            str = time+"---"+name+"方法发生异常";
        } finally {
                FileUtils.writeStringToFile(new File("C:\\Users\\Administrator\\Desktop\\a.txt"),str,true);
        }
        return proceed;
    }
}
