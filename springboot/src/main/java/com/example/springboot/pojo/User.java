package com.example.springboot.pojo;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 *
 * @Author : Wukn
 * @Date : 2018/2/5
 */
public class User implements Serializable{
    private Integer id;

    private String name;

    private String messageid;

    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid;
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(Integer id, String name, String messageid) {
        this.id = id;
        this.name = name;
        this.messageid = messageid;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
