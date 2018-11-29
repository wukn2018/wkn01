package com.example.springboot.tesr;
import com.example.springboot.common.BaseResponse;
import com.example.springboot.pojo.StudentEntity;
import com.example.springboot.pojo.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * * *  GOOK LUCK  * *
 *
 * @Author by   wukainian,
 * @Date on     2018/11/22.
 */
public class TestDemo {


    public void test01(String s) {
        Optional.ofNullable(s)
                .map((x) -> {
                    if(s.equals("1")) {
                        System.out.println("11");
                    }
                    return "";
                });
    }



    @Test
    public void test02() {
        BigDecimal bignum1 = new BigDecimal(2);
        BigDecimal bignum2 = new BigDecimal("5");
        BigDecimal bignum3 = new BigDecimal(0);
        List<BigDecimal> list  = new ArrayList<>();
        list.add(null);
        for(BigDecimal b : list) {
            bignum3 =bignum3.add(b);
        }
    }






    /**
     * 计算参加活动总价
     * @return
     */
    public BigDecimal getTotalPrice(List<BigDecimal> list) {
        return Optional.ofNullable(list)
                .map((x) -> {
                    BigDecimal bigDecimal = new BigDecimal(0);
                    bigDecimal = x.get(0).multiply(x.get(1));
                    return bigDecimal;
                }).get();
    }

    public String test03(String s) {
        if(s.equals("a")) {
            return "1";
        }
        return "2";
    }



    public BaseResponse test023(UserEntity userEntity) {

        return Optional.ofNullable(userEntity.getAddress())
                .map((x) -> {
                    return BaseResponse.ok("ok");
                }).orElse(BaseResponse.error("fail"));
    }

    @Test
    public void test012() {
        UserEntity userEntity = new UserEntity();
        userEntity.setAddress("d");
        BaseResponse baseResponse = test023(userEntity);
        System.out.println(baseResponse);
    }


    @Test
    public void test56() {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1L);
        userEntity.setAddress("1");
        userEntity.setSex(1);
        userEntity.setName("s");

        StudentEntity studentEntity = new StudentEntity();
        BeanUtils.copyProperties(userEntity,studentEntity);
        System.out.println(studentEntity);




    }













}
