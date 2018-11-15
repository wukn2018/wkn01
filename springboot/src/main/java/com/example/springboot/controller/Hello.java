package com.example.springboot.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * * *  GOOK LUCK  * *
 *
 * @Author by   wukainian,
 * @Date on     2018/11/14.
 */
@Component
public class Hello {

    @RequestMapping("hellow")
    @ResponseBody
    public String  helloWord(){
        return "hello word";
    }


}
