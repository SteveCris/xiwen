package com.meyue.xiwen.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 类:  <br>
 * 描述: TODO <br>
 * 作者: 童晶继 tongjingji01@gmail.com<br>
 * 时间:
 */

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public  @interface  IdempotentSubmit {

    String functionName() default "other";//方法签名

    int second() default 10;//秒数
}
