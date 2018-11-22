package com.example.springboot.mapper;

import com.example.springboot.pojo.UserEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * * *  GOOK LUCK  * *
 *
 * @Author by   wukainian,
 * @Date on     2018/11/22.
 */
@Mapper
public interface UserMapper {


    @Select( "select * from t_user where id = #{id}" )
    public UserEntity findUser(Long id);




    /**
     *
     * @param userEntity
     * @return
     * useCache = true表示将会缓存本次查询结果
     * flushCache = Options.FlushCachePolicy.FALSE表示查询时不刷新缓存；
     * timeout = 10000表示查询结果缓存10000秒。
     *
     *
     * before=false//设置 在执行sql之前还是之后
     * //查询出的列名(别名)
     */
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    @Options(
            useCache = true,
            flushCache = Options.FlushCachePolicy.FALSE,
            timeout = 10000,
            useGeneratedKeys = true,
            keyProperty = "id",
            keyColumn = "id")
    @Insert("INSERT INTO t_user (id,name,sex,address) VALUES(#{id},#{name},#{sex},#{address})")
    public Long addUser(UserEntity userEntity);


    /**
     * 全查询
     * @return
     */
    @Select("select * from t_user")
    public List<UserEntity> findPageUser();

    @Select( "select count(*) from t_user" )
    public int findUserCount();









}
