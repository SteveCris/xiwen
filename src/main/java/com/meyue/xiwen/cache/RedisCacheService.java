package com.meyue.xiwen.cache;

import com.alibaba.druid.util.StringUtils;
import com.meyue.xiwen.constant.CommonFild;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName:RedisCacheService </br>
 * @Description: TODO  </br>
 * @Author:童晶继 tongjingji01@gmail.com </br>
 * @Date:
 * @version:1.0
 */

@Service
public class RedisCacheService {

    private static final Logger logger = LoggerFactory.getLogger(RedisCacheService.class);

    @Autowired(required = false)
    private RedisFacade redisFacade;

    private static final String LOGIS_XIWEN_REDIS_PRE = "xiwen";
    /**
     * buildKey
     */
    private String buildKey(String product, String key) {
        final String value = product + key;
        return  value;
    }
    /**
     * set
     */
    public boolean setKey(String product, String key, String value, long time) {
        return setKey(product, key, value, time, TimeUnit.MILLISECONDS);
    }
    /**
     * set TimeUnit
     */
    public boolean setKey(String product, String key, String value, long time, TimeUnit timeUnit) {
        if (StringUtils.isEmpty(key) || StringUtils.isEmpty(value) || StringUtils.isEmpty(product)) {
            return false;
        }
        String buildKey = buildKey(product, key);
        redisFacade.set(buildKey, value, time, timeUnit);
        logger.info("put rediskey success " + buildKey + "  value:" + value + " time:" + time + "timeUnit:" + timeUnit);
        return true;
    }

    /**
     * get key
     */
    public String getByKey(String product, String key) {
        if (StringUtils.isEmpty(key) || StringUtils.isEmpty(product)) {
            return null;
        }
        return redisFacade.get(buildKey(product, key));
    }

    public Long incr(String product, String key, long delta, long timeout, TimeUnit unit) {
        if (StringUtils.isEmpty(key) || StringUtils.isEmpty(product)) {
            return 0L;
        }
        String buildKey = buildKey(product, key);
        return redisFacade.incr(buildKey, delta, timeout, unit);
    }

    /**
     * delete key
     */
    public boolean delByKey(String product, String key) {
        if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(product)) {
            String buildKey = buildKey(product, key);
            redisFacade.delete(buildKey);
        }
        return true;
    }
}
