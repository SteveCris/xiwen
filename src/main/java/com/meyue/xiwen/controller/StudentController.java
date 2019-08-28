package com.meyue.xiwen.controller;

import com.meyue.xiwen.bservice.IStudentService;
import com.meyue.xiwen.entity.Student;
import com.meyue.xiwen.result.BaseResponse;
import com.meyue.xiwen.vo.SeckillVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Api(tags = "学生管理")
@RestController
@RequestMapping("/studentApi")
public class StudentController {

	private final static Logger logger = LoggerFactory.getLogger(StudentController.class);

	private static int corePoolSize = Runtime.getRuntime().availableProcessors();
	//创建线程池  调整队列数 拒绝服务
	private static ThreadPoolExecutor executor  = new ThreadPoolExecutor(corePoolSize, corePoolSize+1, 10l, TimeUnit.SECONDS,
			new LinkedBlockingQueue<Runnable>(10));

	@Autowired
	private IStudentService iStudentService;

	@ApiOperation(value = "新增")
	@ResponseBody
	@RequestMapping(value = "/insertDto", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public BaseResponse<?> insertDto(@RequestBody Student student) {
		BaseResponse<?> response = new BaseResponse<>();

		iStudentService.insertVO(student);

		return  response;
	}

	@ApiOperation(value = "查询")
	@ResponseBody
	@RequestMapping(value = "/selectOne", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public BaseResponse<Student> selectOne(@RequestParam("id") Long id) {
		BaseResponse<Student> response = new BaseResponse<>();

		Student bo=iStudentService.selectOne(id);

		response.setModel(bo);

		return  response;
	}

}
