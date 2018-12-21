package com.example.springboot.test;
import com.alibaba.fastjson.JSON;
import java.util.ArrayList;
import java.util.List;

/**
 * * *  GOOK LUCK  * *
 *
 * @Author by   wukainian,
 * @Date on     2018/12/3.
 */
public class TestDemo02 {


    /**
     * 返回优惠梯度实体类
     * @param rule
     * @return
     */
    public static List<RebateJsonDto> calcRulePrice(String rule) {
        List<RebateJsonDto> list = new ArrayList<>();
        if(null != rule && !"".equals(rule)) {
            try {
                list = JSON.parseArray(rule, RebateJsonDto.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }














}
