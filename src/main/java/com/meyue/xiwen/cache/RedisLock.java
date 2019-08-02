package com.meyue.xiwen.cache;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * @ClassName:RedisLock </br>
 * @Description: TODO  </br>
 * @Author:童晶继 tongjingji01@gmail.com </br>
 * @Date:
 * @version:1.0
 */

@Component
public class RedisLock {


    @Autowired
    private StringRedisTemplate template;

    public synchronized boolean tryLock(String key, String value) {

        boolean isSuccess = template.opsForValue().setIfAbsent(key, value);

        if(isSuccess){
            return true;
        }
        return false;
    }

    public void expire(String key, int expire){
        template.expire(key, expire, TimeUnit.MILLISECONDS);
    }

    public void releaseLock(String key) {
        template.delete(key);
    }
}
