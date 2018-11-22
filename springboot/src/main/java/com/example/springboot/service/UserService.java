package com.example.springboot.service;

import com.example.springboot.mapper.UserMapper;
import com.example.springboot.pojo.PageBean;
import com.example.springboot.pojo.UserEntity;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * * *  GOOK LUCK  * *
 *
 * @Author by   wukainian,
 * @Date on     2018/11/22.
 */
@Service
public class UserService {


    @Autowired
    private UserMapper userMapper;

    public UserEntity findUser(Long id){
        return userMapper.findUser(id);
    }



    public Long addUser(UserEntity userEntity){
        Long id = userMapper.addUser(userEntity);
        return id;
    }


    /**
     * 分页查询
     * @return
     */
    public PageInfo findPageUser(PageBean pageBean){
        PageHelper.startPage(pageBean.getPageSize(),pageBean.getPageNo());
        List<UserEntity> list = userMapper.findPageUser();
        Integer count = userMapper.findUserCount();
        PageInfo<UserEntity> page = new PageInfo<>();
        page.setPageNum(count);
        page.setPageSize(pageBean.getPageSize());
        page.setSize(pageBean.getPageNo());
        page.setList(list);
        return page;
    }




























}
