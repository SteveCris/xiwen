/**  
 * 工程: logistics-tms-system-common-service <br>
 * 标题: InputParamCheck.java <br>
 * 描述: TODO <br>
 * 作者: 张乔 zhangqiao01@corp.netease.com <br>
 * 时间: 2018年12月19日 下午10:39:00 <br>
 * 版权: Copyright 2018 LONGCODE Technology Co.,Ltd. <br>
 * All rights reserved.
 *
 */

package com.meyue.xiwen.check;

import com.google.common.collect.Maps;
import com.meyue.xiwen.annotation.ParamCheckAnnotation;
import com.meyue.xiwen.constant.DictionaryFild;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.text.NumberFormat;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;

/**
 * 类: InputParamCheck <br>
 * 描述: 参数校验 <br>
 */
@Service
public class InputParamCheck {

	private static final Logger logger = LoggerFactory.getLogger(InputParamCheck.class);

	public String check(Object[] objects) {
		StringBuilder s = new StringBuilder();
		for (Object object : objects) {
			if(Objects.nonNull(object)) {
				try {
					for (Field f : object.getClass().getDeclaredFields()) {
						f.setAccessible(true);
						ParamCheckAnnotation ParamCheckAnnotation = f.getAnnotation(ParamCheckAnnotation.class);
						if (ParamCheckAnnotation != null) {
							Class<?> objectClass=f.getType();//参数类型
							Object myObject=f.get(object);//参数对象
							
							if (isEmpty(objectClass,myObject)) {//为空
								if (ParamCheckAnnotation.necessary())//必输
									s.append(ParamCheckAnnotation.name() + DictionaryFild.NOT_NULL);//记录提示
							}else if(getLength(objectClass,myObject)>ParamCheckAnnotation.length()) {//长度校验
								s.append(ParamCheckAnnotation.name() + DictionaryFild.LENGTH_CANNOT_OVERSIZE + ParamCheckAnnotation.length()
								+ DictionaryFild.SEMICOLON);
							}else if(objectClass==Double.class&&getDecimalPointLength((Double)myObject).getValue()>ParamCheckAnnotation.afterDecimalPointLength()) {
								// 判断Double的小数位
								s.append(ParamCheckAnnotation.name() + DictionaryFild.AFTER_DECIMAL_POINT_LENGTH_CANNOT_OVERSIZE + ParamCheckAnnotation.afterDecimalPointLength()
								+ DictionaryFild.SEMICOLON);
							}
							
						}
						
					}
				} catch (IllegalArgumentException | IllegalAccessException e) {
					logger.error("参数校验", e);
				}
			}
		}
		return s.toString();
	}

	/**
	 * 方法: isEmpty <br>
	 * 描述: 判断参数是否为空 <br>
	 * @return
	 */
	public Boolean isEmpty(Class<?> objectClass, Object object) {
		Boolean flag = false;
		if (objectClass == String.class) {
			flag = StringUtils.isEmpty((String) object);
		} else if (objectClass == List.class) {
			flag = CollectionUtils.isEmpty((List<?>) object);
		} else if (objectClass == Double.class || objectClass == Long.class || objectClass == Integer.class) {
			flag = Objects.isNull(object);
		}
		return flag;
	}

	/**
	 * 方法: getLength <br>
	 * @return
	 */
	public Integer getLength(Class<?> objectClass, Object object) {
		Integer result = 0;
		if (objectClass == String.class) {
			result = ((String) object).length();
		} else if (objectClass == List.class) {
			result = ((List<?>) object).size();
		} else if (objectClass == Double.class) {
			result = getDecimalPointLength((Double)object).getKey();
		}else if (objectClass == Long.class ) {
			Long num = (Long) object;
			num = num > 0 ? num : -num;
			if (num == 0) {
				return 1;
			}
			result = (int) Math.log10(num) + 1;
		}else if(objectClass == Integer.class) {
			Integer num = (Integer) object;
			num = num > 0 ? num : -num;
			if (num == 0) {
				return 1;
			}
			result = (int) Math.log10(num) + 1;
		}
		return result;
	}

	/**
	 * 方法: getDecimalPointLength <br>
	 */
	public Entry<Integer, Integer> getDecimalPointLength(Double param) {
		Entry<Integer, Integer> entry;
		NumberFormat nf = NumberFormat.getInstance();   
		nf.setGroupingUsed(false);  
		String string=nf.format(param);
		int index = string.indexOf(".");
		if (index == -1)
			entry = Maps.immutableEntry(string.length(), 0);
		else
			entry = Maps.immutableEntry(index, string.length()-1-index);
		return entry;
	}
}
