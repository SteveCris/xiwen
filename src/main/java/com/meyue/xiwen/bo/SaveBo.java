package com.meyue.xiwen.bo;

import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName:SaveBo </br>
 * @Description: TODO  </br>
 * @Author:童晶继 tongjingji01@gmail.com </br>
 * @Date:
 * @version:1.0
 */
public class SaveBo {
    @ApiModelProperty(value = "名称")
    private String name;

    //库存数量
    @ApiModelProperty(value = "年龄")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
