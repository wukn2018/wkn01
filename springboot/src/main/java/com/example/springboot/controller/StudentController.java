package com.example.springboot.controller;

import com.example.springboot.common.BaseResponse;
import com.example.springboot.exception.CMSException;
import com.example.springboot.request.ReqUser;
import com.example.springboot.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * * *  GOOK LUCK  * *
 *
 * @Author by   wukainian,
 * @Date on     2018/11/22.
 */
@RestController
@RequestMapping("student")
public class StudentController {

Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;


    @PostMapping(value = "/find")
    public BaseResponse fidnUser(@RequestBody @Validated ReqUser reqUser, BindingResult bindingResult) {
        logger.info("ReqUser"+reqUser);
        return  BaseResponse.ok(studentService.findById(reqUser.getId()));


    }



}
