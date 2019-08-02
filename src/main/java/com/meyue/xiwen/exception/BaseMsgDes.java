package com.meyue.xiwen.exception;

/**
 * 类: BaseMsgDes <br>
 * 描述: 消息描述接口 <br>
 * 时间: 2016年8月30日 下午7:28:47
 */
public interface BaseMsgDes {

	
	public ExceptionLevel getLevel() ;

	public ExceptionCode getCode() ;
	
	public String getRemark();

	public String getOutPusMsg();
}
