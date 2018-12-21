package com.example.springboot.test;

import lombok.Data;

import java.math.BigDecimal;

/**
 * * *  GOOK LUCK  * *
 *
 * @Author by   wukainian,
 * @Date on     2018/12/4.
 */
@Data
public class RebateJson {


    /**
     * 距离下一段优惠差多少
     */
    private BigDecimal endNum;
    /**
     * 当前优惠
     */
    private BigDecimal discountNum;
}
