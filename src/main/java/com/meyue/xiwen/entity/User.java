package com.meyue.xiwen.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @ClassName:User </br>
 * @Description: TODO  </br>
 * @Author:童晶继 tongjingji01@gmail.com </br>
 * @Date:
 * @version:1.0
 */
public class User implements Serializable{
        @ApiModelProperty(value = "id")
        private Long id;

        @ApiModelProperty(value = "名称")
        private String name;

        //库存数量
        @ApiModelProperty(value = "年龄")
        private Integer age;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

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
