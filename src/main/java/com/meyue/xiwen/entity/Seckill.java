package com.meyue.xiwen.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class Seckill implements Serializable {
    //商品库存id
    @ApiModelProperty(value = "商品库存id")
    private Long seckillId;

    //商品名称
    @ApiModelProperty(value = "商品名称")
    private String name;

    //库存数量
    @ApiModelProperty(value = "库存数量")
    private Integer number;

    //秒杀开始时间
    @ApiModelProperty(value = "秒杀开始时间")
    private Date startTime;

    //秒杀结束时间
    @ApiModelProperty(value = "秒杀结束时间")
    private Date endTime;

    //创建时间
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    //版本号
    @ApiModelProperty(value = "版本号")
    private Integer version;

    private static final long serialVersionUID = 1L;

    /**
     * 获取商品库存id
     *
     */
    public Long getSeckillId() {
        return seckillId;
    }

    /**
     * 设置商品库存id
     *
     * @param seckillId 商品库存id
     */
    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    /**
     * 获取商品名称
     *
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名称
     *
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取库存数量
     *
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置库存数量
     *
     * @param number 库存数量
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获取秒杀开始时间
     *
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置秒杀开始时间
     *
     * @param startTime 秒杀开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取秒杀结束时间
     *
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置秒杀结束时间
     *
     * @param endTime 秒杀结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

    /**
     * 获取版本号
     *
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seckillId=").append(seckillId);
        sb.append(", name=").append(name);
        sb.append(", number=").append(number);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}