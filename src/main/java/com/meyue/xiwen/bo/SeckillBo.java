package com.meyue.xiwen.bo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class SeckillBo implements Serializable {


    //商品名称
    @ApiModelProperty(value = "商品名称")
    private String name;

    //库存数量
    @ApiModelProperty(value = "库存数量")
    private Integer number;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}