package com.example.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    Logger logger = LoggerFactory.getLogger(Hello.class);

    @RequestMapping("hellow")
    @ResponseBody
    public String  helloWord(){
        logger.info("ss");
        return "hello word";
    }


}
