package cn.itcast.demo;

import cn.itcast.util.RedisUtils;
import redis.clients.jedis.Jedis;

public class demo2 {
    public static void main(String[] args) {
        Jedis jedis = RedisUtils.getJedis();
        jedis.set("ca","man");
        String ca = jedis.get("ca");
        System.out.println(ca);
        jedis.close();
    }
}
