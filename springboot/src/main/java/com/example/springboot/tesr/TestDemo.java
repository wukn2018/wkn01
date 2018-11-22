package com.example.springboot.tesr;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.example.springboot.pojo.User;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * * *  GOOK LUCK  * *
 *
 * @Author by   wukainian,
 * @Date on     2018/11/16.
 */
public class TestDemo {


    @Test
    public void test() {

       final User user = (User) new TypeReference<User>(){}.getType();

        String planJson = "plan";
            User plan = JSON.parseObject(planJson, new TypeReference<User>() {
            });



        }
    }


