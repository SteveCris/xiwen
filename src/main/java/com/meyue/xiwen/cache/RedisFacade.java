package com.meyue.xiwen.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName:RedisFacade </br>
 * @Description: TODO  </br>
 * @Author:童晶继 tongjingji01@gmail.com </br>
 * @Date:
 * @version:1.0
 */

@Service
public class RedisFacade {

    @Autowired(required = false)
    private RedisTemplate redisTemplate;

    public void set(String buildKey, String value, long time, TimeUnit timeUnit) {
        redisTemplate.opsForValue().set(buildKey,value,time,timeUnit);
    }

    public String get(String key) {

        return  (String)redisTemplate.opsForValue().get(key);
    }

    public Long incr(String key, long delta, long timeout, TimeUnit unit) {
        Boolean expire = redisTemplate.expire(key, timeout, unit);
        if(expire){
            return 0L;
        }
        return  redisTemplate.opsForValue().increment(key,delta);
    }

    public void delete(String key) {
        redisTemplate.delete(key);
    }
}
