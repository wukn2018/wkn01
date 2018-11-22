package com.example.springboot.service;

import com.example.springboot.mapper.StudentMapper;
import com.example.springboot.pojo.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * * *  GOOK LUCK  * *
 *
 * @Author by   wukainian,
 * @Date on     2018/11/22.
 */
@Service
public class StudentService {


    @Autowired
    private StudentMapper studentMapper;


   public StudentEntity findById(Long id){
       return studentMapper.findById(id);
   }



}
