package com.meyue.xiwen.dao.business;

import com.meyue.xiwen.entity.Seckill;
import com.meyue.xiwen.entity.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

}