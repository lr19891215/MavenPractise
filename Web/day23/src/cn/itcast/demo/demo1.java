package cn.itcast.demo;

import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class demo1 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost",6379);
//        jedis.set("name","CA");
//        jedis.setex("name",20,"im");
//        jedis.hset("user","name","ca");
//        jedis.hset("user","name1","im");
//        jedis.hset("user","name2","hk");
//        Map<String, String> map = jedis.hgetAll("user");
//        Set<String> keySet = map.keySet();
//        for (String key:keySet) {
//            String value = map.get(key);
//            System.out.println(key+":"+value);
//        }
//        jedis.rpush("As","eyes","ca","toer","im");
//        jedis.lpop("As");
//        List<String> as = jedis.lrange("As", 0, -1);
//        for (String str : as) {
//            System.out.println(str);
//        }
        jedis.zadd("as",10,"toer");
        jedis.zadd("as",8,"huke");
        jedis.zadd("as",6,"im");
        jedis.zadd("as",5,"ca");
        jedis.zadd("as",100,"aoting");
        Set<String> as = jedis.zrange("as", 0, -1);
        for (String a : as) {
            System.out.println(a);
        }
        jedis.close();
    }
}
