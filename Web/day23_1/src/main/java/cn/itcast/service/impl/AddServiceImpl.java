package cn.itcast.service.impl;

import cn.itcast.dao.AddDao;
import cn.itcast.dao.impl.AddDaoImpl;
import cn.itcast.domain.User;
import cn.itcast.service.AddService;
import cn.itcast.utils.RedisUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

public class AddServiceImpl implements AddService {
    AddDao dao = new AddDaoImpl();
    @Override
    public String sel() {
        Jedis jedis = RedisUtils.getJedis();
        Set<String> name = jedis.keys("name");
        String str = null;
        if(name.isEmpty()){
            List<User> sel = dao.sel();
            ObjectMapper mapper = new ObjectMapper();
            str = mapper.writeValueAsString(sel);
            jedis.set("name",str);
        }else {
            str = jedis.get("name");
        }
        return str;
    }

    @Override
    public boolean check(String name) {
        this.save();


        return false;
    }
}
