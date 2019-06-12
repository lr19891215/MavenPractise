package cn.itcast.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.ResourceBundle;

public class RedisUtils {
    private static Jedis jedis;
    static {
        ResourceBundle rb = ResourceBundle.getBundle("jedis");
        String maxTotal = rb.getString("maxTotal");
        String maxIdle = rb.getString("maxIdle");
        String host = rb.getString("host");
        String port = rb.getString("port");
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(Integer.parseInt(maxTotal));
        config.setMaxIdle(Integer.parseInt(maxIdle));
        JedisPool pool = new JedisPool(config,host,Integer.parseInt(port));
        jedis = pool.getResource();
    }
    public static Jedis getJedis(){
        return jedis;
    }
}
