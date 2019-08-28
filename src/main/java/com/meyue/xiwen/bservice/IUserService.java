package com.meyue.xiwen.bservice;

import com.meyue.xiwen.entity.Student;
import com.meyue.xiwen.entity.User;
import com.meyue.xiwen.exception.NullPointerFailureException;
import com.meyue.xiwen.exception.ZidingException;

/**
 * @ClassName:IStudentService </br>
 * @Description: TODO  </br>
 * @Author:童晶继 tongjingji01@gmail.com </br>
 * @Date:
 * @version:1.0
 */
public interface IUserService {

   void insertVO(User vo) throws ZidingException;

    User selectOne(Long id);
}
