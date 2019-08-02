package com.meyue.xiwen.bservice;


import com.meyue.xiwen.bo.SeckillBo;
import com.meyue.xiwen.entity.Seckill;

import java.util.List;

public interface ISeckillService {

	/**
	 * 查询全部的秒杀记录
	 * @return
	 */
	List<Seckill> getSeckillList();

	/**
	 * 查询单个秒杀记录
	 * @param seckillId
	 * @return
	 */
	Seckill getById(long seckillId);
	/**
	 * 查询秒杀售卖商品
	 * @param seckillId
	 * @return
	 */
	Long getSeckillCount(long seckillId);
	/**
	 * 删除秒杀售卖商品记录
	 * @param seckillId
	 * @return
	 */
	void deleteSeckill(long seckillId);


    void insaveDto(SeckillBo bo);
}
