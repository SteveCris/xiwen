package com.meyue.xiwen.constant;

public interface CommonFild {

	public String LOGIS_XIWEN_REDIS_PRE = "xiwen"; //工程key，必须加

    public String COMMON_SPILT_COLON = ":";//冒号

    public String COMMON_REDIS_ALLOCATE = "ac";// 分拨
    


    public String COMMON_REDIS_RULE = "rule";// 规则
    
    public String COMMON_REDIS_APPLICATION = "application";// 系统级

    public String COMMON_REDIS_BATCH_NO = "batchno" + COMMON_SPILT_COLON;

    public String COMMON_REDIS_TMS_ACCOUNT_BILL_NO = "tmsAccountBillNo" + COMMON_SPILT_COLON;

    public String COMMON_LIKE_STR = "%";//百分号

    public String COMMON_DOT_COLON = ",";//逗号

    public String COMMON_ZHONG_COLON = "-";//中划线

    public String COMMON_REDIS_TARIFF_VERSION = "TMSTARIFFVERSION" + COMMON_SPILT_COLON;



}
