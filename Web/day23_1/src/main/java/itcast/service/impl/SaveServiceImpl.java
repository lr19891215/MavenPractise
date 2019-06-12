package itcast.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import itcast.dao.UserDao;
import itcast.dao.impl.UserDaoImpl;
import itcast.domian.User;
import itcast.service.SaveService;
import itcast.utils.RedisUtils;
import redis.clients.jedis.Jedis;

import java.io.IOException;
import java.util.List;
import java.util.Set;


public class SaveServiceImpl implements SaveService {

    UserDao dao = new UserDaoImpl();

    @Override
    public String save() throws JsonProcessingException {

        Jedis redis = RedisUtils.getRedis();

        Set<String> set = redis.keys("user");

        String str = null;

        if(set.isEmpty()){

            //导入数据
            List<User> list = dao.find();

            //json
            ObjectMapper mapper = new ObjectMapper();
            str = mapper.writeValueAsString(list);

            //存储到redis
            redis.set("user",str);

        }else{

            str=redis.get("user");
        }

        return str;
    }



    @Override
    public boolean check(String name) {


        try {

            //{[name:tom,age:10]}
            String str = this.save();

            ObjectMapper mapper = new ObjectMapper();

            JavaType javaType = mapper.getTypeFactory().constructParametricType(List.class, User.class);

            //此方法不可以转集合 只能转javaBean 和 基本类型
            List<User> list = mapper.readValue(str, javaType);


            for(User user : list) {
                if(user.getName().equals(name)){
                    return true;
                }
            }

            return false;



        } catch(JsonProcessingException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }


        return false;
    }


}
