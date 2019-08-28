package com.meyue.xiwen.dao.business;

import com.meyue.xiwen.entity.Seckill;

import java.util.List;

public interface seckillMapper {
    int deleteByPrimaryKey(Long seckillId);

    int insert(Seckill record);

    int insertSelective(Seckill record);

    Seckill selectByPrimaryKey(Long seckillId);

    int updateByPrimaryKeySelective(Seckill record);

    int updateByPrimaryKey(Seckill record);

    List<Seckill> selectAll();
}