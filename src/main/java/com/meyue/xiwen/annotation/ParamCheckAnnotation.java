package com.meyue.xiwen.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 类: ParamCheckAnnotation.java <br>
 * 描述: 参数校验注解<br>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ParamCheckAnnotation {
	/**
	 * 方法: name <br>
	 * 描述:  字段名称 <br>
	 * @return
	 */
	 String name() default "";//字段的名称
	 /**
	  * 方法: necessary <br>
	  * 描述: 是否必填 <br>
	  * @return
	  */
	 boolean necessary() default true;//是否必填
	 /**
	  * 方法: length <br>
	  * 描述: 字段的长度 <br>
	  * @return
	  */
	 int length() default 64;//字段的长度
	 /**
	  * 方法: afterDecimalPointLength <br>
	  * 描述: 若是Double类型的，小数点后的位数 <br>
	  * @return
	  */
	 int afterDecimalPointLength() default 3;//若是Double，小数点后的位数
}
