package com.meyue.xiwen.service;

import com.meyue.xiwen.annotation.IdempotentSubmit;
import com.meyue.xiwen.bo.SeckillBo;
import com.meyue.xiwen.bservice.ISeckillService;
import com.meyue.xiwen.cache.RedisCacheService;
import com.meyue.xiwen.check.InputParamCheck;
import com.meyue.xiwen.constant.IdempotentFunctionKey;
import com.meyue.xiwen.entity.Seckill;
import com.meyue.xiwen.exception.ZidingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName:ISeckillBusinessService </br>
 * @Description: TODO  </br>
 * @Author:童晶继 tongjingji01@gmail.com </br>
 * @Date:
 * @version:1.0
 */

@Service
public class ISeckillBusinessApiImpl {

    private final static Logger logger = LoggerFactory.getLogger(ISeckillBusinessApiImpl.class);

    @Autowired
    private ISeckillService iSeckillService;

    @Autowired
    RedisCacheService redisCacheService;

    public List<Seckill> getSeckillList() {

        logger.info("当前时间你好{}",System.currentTimeMillis());
        List<Seckill> list = iSeckillService.getSeckillList();
        return list;
    }
    //@Transactional
    public void insetDto(SeckillBo bo) throws ZidingException {
        redisCacheService.setKey("xiwen-product","meyue"+bo.getName(),bo.getName()+bo.getNumber()+"",1000, TimeUnit.HOURS);
        logger.info("当前时间你好{}",System.currentTimeMillis());
        iSeckillService.insaveDto(bo);


        iSeckillService.insaveSekDto();

        //throw  new RuntimeException();
       /* try {
             iSeckillService.insaveSekDto();
         }catch (Exception e){
           e.printStackTrace();
         }*/



           //





    }
}
