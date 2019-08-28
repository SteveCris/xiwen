package com.meyue.xiwen.bservice.impl;

import com.meyue.xiwen.bservice.IStudentService;
import com.meyue.xiwen.dao.business.StudentMapper;
import com.meyue.xiwen.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName:IStudentServiceImpl </br>
 * @Description: TODO  </br>
 * @Author:童晶继 tongjingji01@gmail.com </br>
 * @Date:
 * @version:1.0
 */
@Service
public class IStudentServiceImpl implements IStudentService {

    @Autowired
    StudentMapper mapper;
    @Override
    public void insertVO(Student vo) {
        mapper.insertSelective(vo);


    }

    @Override
    public Student selectOne(Long id) {
        return mapper.selectByPrimaryKey(id);
    }
}
