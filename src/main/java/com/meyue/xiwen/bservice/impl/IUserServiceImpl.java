package com.meyue.xiwen.bservice.impl;

import com.meyue.xiwen.bservice.IStudentService;
import com.meyue.xiwen.bservice.IUserService;
import com.meyue.xiwen.dao.business.StudentMapper;
import com.meyue.xiwen.dao.master.UserMapper;
import com.meyue.xiwen.entity.Student;
import com.meyue.xiwen.entity.User;
import com.meyue.xiwen.exception.ExceptionCode;
import com.meyue.xiwen.exception.ExceptionLevel;
import com.meyue.xiwen.exception.NullPointerFailureException;
import com.meyue.xiwen.exception.ZidingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.rowset.serial.SerialException;

/**
 * @ClassName:IStudentServiceImpl </br>
 * @Description: TODO  </br>
 * @Author:童晶继 tongjingji01@gmail.com </br>
 * @Date:
 * @version:1.0
 */
@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    UserMapper mapper;
    @Override

    @Transactional
    public void insertVO(User vo) throws ZidingException {
        mapper.insertSelective(vo);
        throw  new NullPointerFailureException(ExceptionLevel.ERROR, ExceptionCode.DB_BATCH_SAVE_FAIL);
    }

    @Override
    public User selectOne(Long id) {
        return mapper.selectByPrimaryKey(id);
    }
}
