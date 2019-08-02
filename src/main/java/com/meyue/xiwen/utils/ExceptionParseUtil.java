package com.meyue.xiwen.utils;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.util.Map;

/**
 * 类: ExceptionParseUtil <br>
 */
public class ExceptionParseUtil {

	private static Map<String, String> nameMap = Maps.newConcurrentMap();

	public static StringBuffer methodPrintInfo(JoinPoint jp, MethodSignature methodSignature) {
		String className = methodSignature.getDeclaringTypeName();
		String methodName = methodSignature.getName();
		className = className.substring(className.lastIndexOf(".") + 1);
		String[] parameterNames = methodSignature.getParameterNames();
		Object[] parameters = jp.getArgs();
		StringBuffer sb = new StringBuffer();
		sb.append(className);
		sb.append(".");
		sb.append(methodName);
		sb.append(";参数: ");

		if (parameters == null || parameters.length == 0) {
			sb.append("无 ");
		} else {
			for (int i = 0; i < parameters.length; i++) {
				Object parameter = parameters[i];
				if (parameter == null) {
					sb.append(" null ");
					continue;
				}
				if (parameter.getClass().equals(int.class) || parameter.getClass().equals(long.class)
						|| parameter.getClass().equals(double.class) || parameter.getClass().equals(String.class)
						|| parameter.getClass().equals(Long.class) || parameter.getClass().equals(Integer.class)
						|| parameter.getClass().equals(Double.class)) {
					if (parameterNames != null && parameterNames.length > (i + 1)) {
						sb.append(" " + parameterNames[i] + " ").append(": ").append(parameter);
					} else {
						sb.append(" " + i + " ").append(": ").append(parameter);
					}
				} else if (parameter instanceof ServletRequest || parameter instanceof ServletResponse
						|| parameter instanceof MultipartFile) {
					continue;
				} else {

					if (parameterNames != null && parameterNames.length > (i + 1)) {
						sb.append(" " + parameterNames[i] + " ").append(": ").append(JSONObject.toJSONString(parameter));
					} else {
						try {
							sb.append(" " + i + " ").append(": ").append(JSONObject.toJSONString(parameter));
						} catch (Exception e) {
							sb.append("parse error:" + ExceptionUtil.getThrowableStackTraceWithSize(e));
						}
					}
				}
				if (i < parameters.length - 1) {
					sb.append(", ");
				}
			}
		}
		return sb;
	}

	public static StringBuffer methodPrintInfo(JoinPoint jp) {
		MethodSignature methodSignature = (MethodSignature) jp.getSignature();
		return methodPrintInfo(jp, methodSignature);
	}

	public static String generateClassName(String className) {
		String result = nameMap.get(className);
		if (result != null) {
			return result;
		}
		String classNameUpperCase = className.toUpperCase();
		result = classNameUpperCase.substring(7, classNameUpperCase.length() - 13);
		nameMap.put(className, result);
		return result;
	}

}
