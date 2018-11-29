package com.example.springboot.request;

import com.alibaba.fastjson.JSON;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * * *  GOOK LUCK  * *
 *
 * @Author by   wukainian,
 * @Date on     2018/11/21.
 */
public class ReqUser implements Serializable {

    @NotNull(message = "id不能为空")
    private Long id;

    @NotBlank
    private String name;

    private Integer sex;

    private String address;

    public ReqUser() {
    }

    public ReqUser(Long id, String name, Integer sex, String address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.address = address;
    }

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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
