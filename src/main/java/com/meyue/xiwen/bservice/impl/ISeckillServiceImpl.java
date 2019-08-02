package com.meyue.xiwen.bservice.impl;

import com.meyue.xiwen.bo.SeckillBo;
import com.meyue.xiwen.bservice.ISeckillService;
import com.meyue.xiwen.dao.seckillMapper;
import com.meyue.xiwen.entity.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @ClassName:ISeckillServiceImpl </br>
 * @Description: TODO  </br>
 * @Author:童晶继 tongjingji01@gmail.com </br>
 * @Date:
 * @version:1.0
 */

@Service("bISeckillService")
public class ISeckillServiceImpl  implements ISeckillService {

    @Autowired
    private seckillMapper mapper;
    @Override
    public List<Seckill> getSeckillList() {
        return mapper.selectAll();
    }

    @Override
    public Seckill getById(long seckillId) {
        return null;
    }

    @Override
    public Long getSeckillCount(long seckillId) {
        return null;
    }

    @Override
    public void deleteSeckill(long seckillId) {

    }

    @Override
    public void insaveDto(SeckillBo bo) {
        Seckill parm =new Seckill();
        parm.setCreateTime(new Date());
        parm.setName(bo.getName());
        parm.setNumber(bo.getNumber());
        parm.setEndTime(new Date());
        parm.setVersion(1);
        mapper.insert(parm);
    }
}
