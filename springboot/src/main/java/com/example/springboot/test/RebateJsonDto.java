package com.example.springboot.test;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @description: 返利阶梯字符串操作类
 * @author: zuo.zhuan
 * @create: 2018-10-25 9:24
 */
@Getter
@Setter
@Data
public class RebateJsonDto implements Serializable {
    /**
     * 优惠开始区域(当为单个时为0)
     */
    private BigDecimal startNum;
    /**
     * 优惠结束区域(当为-1时表示最后一个刻度)
     */
    private BigDecimal endNum;
    /**
     * 优惠幅度
     */
    private BigDecimal discountNum;


}
