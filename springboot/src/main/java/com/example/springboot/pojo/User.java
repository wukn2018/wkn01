package com.example.springboot.pojo;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * * *  GOOK LUCK  * *
 *
 * @Author by   wukainian,
 * @Date on     2018/11/21.
 */
public class User implements Serializable {

    private String name;

    public User() {
    }

    public User(String name, Integer id, String address) {
        this.name = name;
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
