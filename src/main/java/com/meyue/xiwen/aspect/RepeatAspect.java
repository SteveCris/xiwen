/*
package com.meyue.xiwen.aspect;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.meyue.xiwen.annotation.IdempotentSubmit;
import com.meyue.xiwen.cache.RedisLock;
import com.meyue.xiwen.check.InputParamCheck;
import com.meyue.xiwen.exception.BaseMsgDes;
import com.meyue.xiwen.exception.ExceptionCode;
import com.meyue.xiwen.exception.ExceptionLevel;
import com.meyue.xiwen.exception.ExceptionUtil;
import com.meyue.xiwen.res.BaseResponseDto;
import com.meyue.xiwen.utils.ExceptionParseUtil;
import io.micrometer.core.instrument.util.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Objects;

*/
/**
 * @ClassName:RepeatAspect </br>
 * @Description: TODO  </br>
 * @Author:童晶继 tongjingji01@gmail.com </br>
 * @Date:
 * @version:1.0
 *//*


@Aspect
@Scope
@Component
public class RepeatAspect {
    private final static Logger logger = LoggerFactory.getLogger(RepeatAspect.class);
    @Autowired
    private RedisLock redisLock;

    @Resource
    private InputParamCheck inputParamCheck;

    @Pointcut("execution(* com.meyue.xiwen.service..*.*(..)) ")
    public void aspect() {
    }

    @Before(value = "aspect()")
    public void before(JoinPoint jp) {
        if (true) {
            MethodSignature methodSignature = (MethodSignature) jp.getSignature();
            StringBuffer sb = ExceptionParseUtil.methodPrintInfo(jp, methodSignature);
            logger.info("req:" + sb.toString());
        }
    }

    @Around(value = "aspect()")
    public Object doAround(ProceedingJoinPoint pjp) {
        Long start = System.currentTimeMillis();
        Object result = null;
        Signature sig = pjp.getSignature();
        MethodSignature msig = (MethodSignature) sig;
        String className = msig.getDeclaringTypeName();
        String methodName = msig.getName();
        className = className.substring(className.lastIndexOf(".") + 1);
        IdempotentSubmit idempotentLimit = null;
        String key = "";
        try {
            //参数校验
            String check = inputParamCheck.check(pjp.getArgs());
            if (StringUtils.isNotEmpty(check)) {
                Class<?> returnType = msig.getReturnType();
                BaseResponseDto<?> baseResponseDto = (BaseResponseDto<?>) BaseResponseDto.getResponse(returnType);
                baseResponseDto.setSuccess(false);
                baseResponseDto.setErrorCode(ExceptionCode.PARAMETER_ILLEGAL.intValue());
                baseResponseDto.setErrorMsg(ExceptionCode.PARAMETER_ILLEGAL.toString() + check);
                return baseResponseDto;
            }
            //幂等校验
            Class<?> classTarget = pjp.getTarget().getClass();
            Class<?>[] par = msig.getParameterTypes();
            Method objMethod;
            try {
                objMethod = classTarget.getMethod(methodName, par);
                if (Objects.nonNull(objMethod))
                    idempotentLimit = objMethod.getAnnotation(IdempotentSubmit.class);
            } catch (NoSuchMethodException | SecurityException e) {
                e.printStackTrace();
            }
            if (Objects.nonNull(idempotentLimit)) {
                if (pjp.getArgs().length > 0) {
                    String functionName = idempotentLimit.functionName();
                    int second = idempotentLimit.second();
                    key = "tongxiwen" + functionName;
                    final String value = getMD5AfterBase64(pjp.getArgs()[0]);
                    boolean lock = redisLock.tryLock(key, value);
                    redisLock.expire(key, second);
                    if (lock) {
                        //z走方法
                        result = pjp.proceed();
                    } else {
                        //重复提交
                        logger.error("重复提交");
                        Class<?> returnType = msig.getReturnType();
                        BaseResponseDto<?> baseResponseDto = (BaseResponseDto<?>) BaseResponseDto.getResponse(returnType);
                        baseResponseDto.setSuccess(false);
                        baseResponseDto.setErrorCode(ExceptionCode.REQUEST_REPEAT.intValue());
                        baseResponseDto.setErrorMsg(ExceptionCode.REQUEST_REPEAT.toString());
                        return baseResponseDto;

                    }
                }
            }
        } catch (Throwable t) {
            Class<?> returnType = msig.getReturnType();
            BaseMsgDes baseDes = ExceptionUtil.operateException(t);
            if (BaseResponseDto.class.isAssignableFrom(returnType)) {
                StringBuffer sb = ExceptionParseUtil.methodPrintInfo(pjp, msig);
                BaseResponseDto<?> response = (BaseResponseDto<?>) BaseResponseDto.getResponse(returnType);
                response.setSuccess(false);
                if (baseDes.getLevel().intValue() >= ExceptionLevel.WARN.intValue()) {
                    response.setErrorCode(baseDes.getCode().intValue());
                    response.setErrorMsg(baseDes.getCode().toString());
                    logger.info(sb.toString(), t);
                } else {
                    response.setErrorCode(baseDes.getCode().intValue());
                    response.setErrorMsg(t.getMessage());
                    logger.error(sb.toString(), t);
                }

                if (Objects.nonNull(idempotentLimit)) {
                    if (pjp.getArgs().length > 0) {
                        //出错删除幂等控制
                        redisLock.releaseLock(key);
                    }
                }

                return response;
            } else {
                StringBuffer sb = ExceptionParseUtil.methodPrintInfo(pjp, msig);
                if (baseDes.getLevel().intValue() >= ExceptionLevel.WARN.intValue()) {
                    logger.info(sb.toString(), t);
                } else {
                    logger.info(sb.toString(), t);
                }
            }
        }
        Long end = System.currentTimeMillis();
        logger.info("====耗时统计===方法名：" + className + "." + methodName + "======cost：" + (end - start) + "ms===");
        return result;
    }

    */
/**
     * 获取bean属性值对应的字符串的指纹
     *
     * @param object
     * @return
     *//*

    public String getMD5AfterBase64(Object object) {
        ObjectMapper mapper = new ObjectMapper();
        MessageDigest md5;
        String key = "";
        if (Objects.nonNull(object)) {
            try {
                md5 = MessageDigest.getInstance("MD5");
                key = Base64.getEncoder().encodeToString(md5.digest(mapper.writeValueAsString(object).getBytes()));//对象指纹
            } catch (NoSuchAlgorithmException e) {
                logger.error("MD5算符获取异常", e);
                ;
            } catch (JsonProcessingException e) {
                logger.error("对象装json异常", e);
                ;
            }
        } else {
            key = "null";
        }
        return key;
    }


}
*/
