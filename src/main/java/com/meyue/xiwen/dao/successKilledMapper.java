package com.meyue.xiwen.dao;


import com.meyue.xiwen.entity.SuccessKilled;
import com.meyue.xiwen.entity.SuccessKilledKey;

public interface successKilledMapper {
    int deleteByPrimaryKey(SuccessKilledKey key);

    int insert(SuccessKilled record);

    int insertSelective(SuccessKilled record);

    SuccessKilled selectByPrimaryKey(SuccessKilledKey key);

    int updateByPrimaryKeySelective(SuccessKilled record);

    int updateByPrimaryKey(SuccessKilled record);
}