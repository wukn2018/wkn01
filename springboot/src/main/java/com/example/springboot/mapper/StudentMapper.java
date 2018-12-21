package com.example.springboot.mapper;

import com.example.springboot.pojo.StudentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * * *  GOOK LUCK  * *
 *
 * @Author by   wukainian,
 * @Date on     2018/11/22.
        */
@Component
public interface StudentMapper {

    StudentEntity findById(Long id);
}
