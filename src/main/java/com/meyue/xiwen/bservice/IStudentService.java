package com.meyue.xiwen.bservice;

import com.meyue.xiwen.entity.Student;

/**
 * @ClassName:IStudentService </br>
 * @Description: TODO  </br>
 * @Author:童晶继 tongjingji01@gmail.com </br>
 * @Date:
 * @version:1.0
 */
public interface IStudentService {

   void insertVO(Student vo);

    Student selectOne(Long id);
}
