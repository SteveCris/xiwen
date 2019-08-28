package com.meyue.xiwen.bservice.impl;

import com.meyue.xiwen.annotation.MultiTransactional;
import com.meyue.xiwen.bo.SaveBo;
import com.meyue.xiwen.bo.SeckillBo;
import com.meyue.xiwen.bservice.ISeckillService;
import com.meyue.xiwen.bservice.IStudentService;
import com.meyue.xiwen.bservice.IUserService;
import com.meyue.xiwen.cache.RedisCacheService;
import com.meyue.xiwen.dao.business.seckillMapper;
import com.meyue.xiwen.entity.Seckill;
import com.meyue.xiwen.entity.Student;
import com.meyue.xiwen.entity.SuccessKilled;
import com.meyue.xiwen.entity.User;
import com.meyue.xiwen.exception.ZidingException;
import com.meyue.xiwen.utils.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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


    @Autowired
    RedisCacheService redisCacheService;

    @Autowired
    private IUserService iUserService;

    @Autowired
    private IStudentService iStudentService;

    @Autowired
    private com.meyue.xiwen.dao.business.successKilledMapper successKilledMapper;
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
    @MultiTransactional
    public void saveDto(SaveBo bo) throws ZidingException {
        User user = BeanUtil.do2bo(bo, User.class);

        final Student student = BeanUtil.do2bo(bo, Student.class);

        iUserService.insertVO(user);

        iStudentService.insertVO(student);

    }
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insaveDto(SeckillBo bo) {
        Seckill parm =new Seckill();
        parm.setCreateTime(new Date());
        parm.setName(bo.getName());
        parm.setNumber(bo.getNumber());
        parm.setEndTime(new Date());
        parm.setStartTime(new Date());
        parm.setVersion(1);
        mapper.insert(parm);
       /* int  i= 1/0;
        System.out.println(i);*/
      // deleteRedisKey(bo);

    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void insaveSekDto() throws ZidingException{
        SuccessKilled parm =new SuccessKilled();
        parm.setCreateTime(new Date());
        parm.setState((byte)1);
        parm.setUserId(10L);
        parm.setSeckillId(System.currentTimeMillis());
        successKilledMapper.insertSelective(parm);
        throw  new ZidingException("333","333","333");
       // throw  new RuntimeException();
        //throw  new RuntimeException();
       /* try {
            SuccessKilled parm =new SuccessKilled();
            parm.setCreateTime(new Date());
            parm.setState((byte)1);
            parm.setUserId(10L);
            parm.setSeckillId(System.currentTimeMillis());
            successKilledMapper.insertSelective(parm);
            throw new RuntimeException();
        }catch (Exception ex){
            ex.printStackTrace();
        }
*/
       /* int  i= 1/0;
        System.out.println(i);*/
       // deleteRedisKey(bo);

    }

    //PROPAGATION_NOT_SUPPORTED
    @Transactional(propagation=Propagation.NOT_SUPPORTED)
    void deleteRedisKey(SeckillBo bo) {
        redisCacheService.delByKey("xiwen-product","meyue"+bo.getName());
        int i = 1/0 ;
        System.out.println(i);
       // redisCacheService.setKey("xiwen-product","meyue"+bo.getName()
          /* try {
               redisCacheService.delByKey("xiwen-product","meyue"+bo.getName());
               int i = 1/0 ;
               System.out.println(i);
           }catch (Exception e ){
               e.printStackTrace();
           }*/

    }
}
