package com.meyue.xiwen.exception;

/**
 * 类: ExceptionLevel <br>
 * 描述: 异常级别定义 <br>
 * 时间: 2016年8月24日 上午10:30:42
 */
public enum ExceptionLevel {

	DEBUG {
		@Override
		public int intValue() {
			return 0;
		}
	},
	INFO {
		@Override
		public int intValue() {
			return 1;
		}
	},
	WARN {
		@Override
		public int intValue() {
			return 2;
		}
	},
	ERROR {
		@Override
		public int intValue() {
			return 3;
		}
	}
	;
	public abstract int intValue();

}
