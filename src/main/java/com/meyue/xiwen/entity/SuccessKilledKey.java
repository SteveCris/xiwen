package com.meyue.xiwen.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class SuccessKilledKey implements Serializable {
    //秒杀商品id
    @ApiModelProperty(value = "秒杀商品id")
    private Long seckillId;

    //用户Id
    @ApiModelProperty(value = "用户Id")
    private Long userId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取秒杀商品id
     *
     */
    public Long getSeckillId() {
        return seckillId;
    }

    /**
     * 设置秒杀商品id
     *
     * @param seckillId 秒杀商品id
     */
    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    /**
     * 获取用户Id
     *
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户Id
     *
     * @param userId 用户Id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seckillId=").append(seckillId);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}