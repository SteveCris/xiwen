package com.meyue.xiwen.exception;

/**
 * @ClassName:ZidingException </br>
 * @Description: TODO  </br>
 * @Author:童晶继 tongjingji01@gmail.com </br>
 * @Date:
 * @version:1.0
 */
public class ZidingException extends Exception {


    private String remark;

    protected String outPusMsg;


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOutPusMsg() {
        return outPusMsg;
    }

    public void setOutPusMsg(String outPusMsg) {
        this.outPusMsg = outPusMsg;
    }

    public ZidingException(String message, String remark, String outPusMsg) {
        super(message);
        this.remark = remark;
        this.outPusMsg = outPusMsg;
    }
}
