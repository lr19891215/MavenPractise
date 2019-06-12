package cn.itcast.service.impl;

import cn.itcast.dao.JiguanDao;
import cn.itcast.dao.impl.JiguanDaoImpl;
import cn.itcast.domain.Province;
import cn.itcast.service.JiguanService;
import cn.itcast.utils.RedisUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

public class JiguanServiceImpl implements JiguanService {
    JiguanDao dao = new JiguanDaoImpl();
    @Override
    public String jiguan() {
        Jedis jedis = RedisUtils.getJedis();
        Set<String> province = jedis.keys("province");
        String string = null;
        if(province.isEmpty()){
            try {
                List<Province> jiguan = dao.jiguan();
                ObjectMapper mapper = new ObjectMapper();
                string = mapper.writeValueAsString(jiguan);
                jedis.set("province",string);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }else {
            string = jedis.get("province");
        }
        return string;
    }

}
