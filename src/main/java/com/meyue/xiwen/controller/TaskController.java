package com.meyue.xiwen.controller;

import com.meyue.xiwen.bo.SaveBo;
import com.meyue.xiwen.bo.SeckillBo;
import com.meyue.xiwen.bservice.ISeckillService;
import com.meyue.xiwen.exception.ZidingException;
import com.meyue.xiwen.result.BaseResponse;
import com.meyue.xiwen.service.ISeckillBusinessApiImpl;
import com.meyue.xiwen.vo.SeckillVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Api(tags = "秒杀商品接口")
@RestController
@RequestMapping("/spikeGoods")
public class TaskController {

	private final static Logger logger = LoggerFactory.getLogger(TaskController.class);
	private static int corePoolSize = Runtime.getRuntime().availableProcessors();
	//创建线程池  调整队列数 拒绝服务
	private static ThreadPoolExecutor executor  = new ThreadPoolExecutor(corePoolSize, corePoolSize+1, 10l, TimeUnit.SECONDS,
			new LinkedBlockingQueue<Runnable>(10));

	@Autowired
	private ISeckillBusinessApiImpl biSeckillService;

	@Autowired
	ISeckillService iSeckillService;

	@ApiOperation(value = "信息")
	@ResponseBody
	@RequestMapping(value = "/insertDto", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public BaseResponse<SeckillVo> insertDto(@RequestBody SeckillBo order) throws ZidingException{
		BaseResponse<SeckillVo> response = new BaseResponse<>();
		biSeckillService.insetDto(order);
		return  response;
	}


	@ApiOperation(value = "信息")
	@ResponseBody
	@RequestMapping(value = "/saveDto", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void saveDto(@RequestBody SaveBo bo)throws ZidingException {
		iSeckillService.saveDto(bo);
	}

}
