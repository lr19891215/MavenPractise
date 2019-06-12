package itcast.utils;


import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.ResourceBundle;


public class RedisUtils {

    private  static Jedis jedis;

    static {
        //读取.properties配置文件
        //ResourceBundle 此类主要用于.properties文件的读取操作
        ResourceBundle rb = ResourceBundle.getBundle("jedis");

        //根据.properties的键名读取对应的值
        String maxTotal = rb.getString("maxTotal");
        String maxIdle = rb.getString("maxIdle");
        String host = rb.getString("host");
        String port = rb.getString("port");

        //根据值进行链接池的设置
        JedisPoolConfig config =  new JedisPoolConfig();
        config.setMaxTotal(Integer.parseInt(maxTotal));
        config.setMaxIdle(Integer.parseInt(maxIdle));

        //根据配置信息生成redis连接池
        JedisPool pool = new JedisPool(config,host,Integer.parseInt(port));

        //返回连接池
        jedis = pool.getResource();

    }



    public static Jedis getRedis() {

        return jedis;
    }



    public static void main(String[] args) throws Exception {

        Jedis redis = getRedis();

        redis.set("hello","world");

        System.out.println(redis.get("hello"));

    }

}
