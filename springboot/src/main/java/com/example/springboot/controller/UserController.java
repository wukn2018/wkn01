package com.example.springboot.controller;

import com.example.springboot.pojo.PageBean;
import com.example.springboot.pojo.UserEntity;
import com.example.springboot.request.ReqUser;
import com.example.springboot.service.UserService;
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
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserService userService;




    @PostMapping(value = "/find")
    public Object fidnUser(@RequestBody ReqUser reqUser) {
        return userService.findUser( reqUser.getId() );
    }



    @PostMapping(value = "/add")
    public Object addUser(@RequestBody ReqUser reqUser) {
        long i = 0;
        for(int i1 = 8;i1<100;++i1) {
            UserEntity userEntity = new UserEntity();
            userEntity.setId((long) i1);
            userEntity.setName("c"+i1);
            userEntity.setSex(i1);
            userEntity.setAddress("chian"+i1);
            Long l = userService.addUser(userEntity);
            i = (int) (i+l);
        }
        return i;
    }







    @PostMapping(value = "/page")
    public Object PageUser(@RequestBody PageBean reqUser) {
        return userService.findPageUser(reqUser).getList();
    }






}
