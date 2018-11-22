package com.example.springboot.controller;

import com.example.springboot.request.ReqUser;
import com.example.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
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



    @Autowired
    private StudentService studentService;


    @PostMapping(value = "/find")
    public Object fidnUser(@RequestBody ReqUser reqUser) {
        return studentService.findById(reqUser.getId());
    }



}
