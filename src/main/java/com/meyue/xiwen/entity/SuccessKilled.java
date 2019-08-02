package com.meyue.xiwen.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class SuccessKilled extends SuccessKilledKey implements Serializable {
    //状态标示：-1指无效，0指成功，1指已付款
    @ApiModelProperty(value = "状态标示：-1指无效，0指成功，1指已付款")
    private Byte state;

    //创建时间
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取状态标示：-1指无效，0指成功，1指已付款
     *
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置状态标示：-1指无效，0指成功，1指已付款
     *
     * @param state 状态标示：-1指无效，0指成功，1指已付款
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * 获取创建时间
     *
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", state=").append(state);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}