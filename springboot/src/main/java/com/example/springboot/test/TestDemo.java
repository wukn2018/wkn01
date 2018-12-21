package com.example.springboot.test;
import com.example.springboot.common.BaseResponse;
import com.example.springboot.pojo.StudentEntity;
import com.example.springboot.pojo.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * * *  GOOK LUCK  * *
 *
 * @Author by   wukainian,
 * @Date on     2018/11/22.
 */
public class TestDemo {

Long l ;
@Test
public void test0168() {
    System.out.println(l);
}





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



    /**
     * 判断当前时间是否在[startTime, endTime]区间，注意时间格式要一致
     *
     * @param nowTime 当前时间
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return
     * @author jqlin
     */
    public  Integer isEffectiveDate(Date nowTime, Date startTime, Date endTime) {
        int i = 0;
        //时间段内
        if (nowTime.getTime() == startTime.getTime()
                || nowTime.getTime() == endTime.getTime()) {
            return i;
        }
        Calendar date = Calendar.getInstance();
        date.setTime(nowTime);

        Calendar begin = Calendar.getInstance();
        begin.setTime(startTime);

        Calendar end = Calendar.getInstance();
        end.setTime(endTime);
        //时间段内
        if (date.after(begin) && date.before(end)) {
            return i;
        //时间开始之前
        } else if(date.before(begin)) {
            return i-1;
        //时间结束之后
        }else if (date.after(end)) {
            return i+1;
        }
        return i;
    }



@Test
public void test23() {
    //设置日期格式
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    //now   2018-12-03 11:29:01
    Date nowDate = new Date();
    //end
    //Date nowDate1 = df.parse(df.format(new Date()));
    String startTime = "2018-12-01 11:29:01";
    String endTime = "2018-12-02 11:29:01";
    try {
        Date startDate = df.parse(startTime);
        Date endDate = df.parse(endTime);
        Integer b = isEffectiveDate(nowDate,startDate,endDate);
        System.out.println(">>>"+b);
    } catch (ParseException e) {
        e.printStackTrace();
    }
}



    /**
     * 获取活动状态，该活动是否正在进行（不仅活动上线，还需要该活动正在运行）
     * @return
     */
    public Boolean chechPromotionActiveStatus(Date nowTime, Date startTime, Date endTime) {
        //设置日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        boolean b = false;
        int i = 0;
        if(i < new Date().compareTo( startTime ) && i > new Date().compareTo( endTime ) ) {
            b = true;
        }
        return b;
    }



@Test
public void test014() {
    BigDecimal bigDecimal =new BigDecimal(15);
    BigDecimal bigDecimal1 =new BigDecimal(0);
    int i = 0;
    String s = "[{startNum:1,endNum:10,discountNum:20}," +
            "{startNum:11,endNum:20,discountNum:15}," +
            "{startNum:21,endNum:30,discountNum:10}," +
            "{startNum:31,endNum:40,discountNum:5}]";
    List<RebateJsonDto> list = TestDemo02.calcRulePrice(s);
    Collections.reverse(list);//倒叙(从大到小)
    for(RebateJsonDto r : list) {
        i++;
       if(bigDecimal.equals(r.getDiscountNum())) {
           break;
       }
    }
    if(i==list.size()) {
        bigDecimal1 = new BigDecimal(-1);
    }else {
        RebateJsonDto r = list.get(i);
        RebateJsonDto r2 = list.get(i-1);
        bigDecimal1 = r.getEndNum().subtract(r2.getEndNum());
    }
    System.out.println(bigDecimal1);


}







    @Test
    public void test0155() {
        BigDecimal bigDecimal = new BigDecimal(15);
        BigDecimal bigDecimal1 = new BigDecimal(0);
        int i = 0;
        String s = "[{startNum:6,endNum:10,discountNum:56}," +
                "{startNum:11,endNum:15,discountNum:86}," +
                "{startNum:16,endNum:20,discountNum:25}," +
                "{startNum:1,endNum:5,discountNum:422}]";
        List<RebateJsonDto> list = TestDemo02.calcRulePrice(s);
        //DiscountNum从大到小
        Collections.sort(list, new Comparator<RebateJsonDto>() {
            @Override
            public int compare(RebateJsonDto u1, RebateJsonDto u2) {
                int i = (u2.getDiscountNum()).compareTo((u1.getDiscountNum()));
               return i;
            }
        });
        for(RebateJsonDto r : list) {
            System.out.println(r);
        }
        System.out.println(list.get(1));
    }





@Test
public void test015() {
    //当前优惠幅度
    BigDecimal b1 =new BigDecimal(5);
    BigDecimal b2 =new BigDecimal(0);
    //当前购买数量
    BigDecimal b3 =new BigDecimal(2);
    BigDecimal b4 =new BigDecimal(0);
    int i = 0;
    int j = 0;
    String s = "[{startNum:1,endNum:10,discountNum:20}," +
            "{startNum:11,endNum:20,discountNum:15}," +
            "{startNum:21,endNum:30,discountNum:10}," +
            "{startNum:31,endNum:40,discountNum:5}]";
    List<RebateJsonDto> list = TestDemo02.calcRulePrice(s);
    for(RebateJsonDto r : list) {
        i++;
        if(b1.equals(r.getDiscountNum())) {
            break;
        }
    }
   if(i<list.size()) {
       RebateJsonDto rr1 = list.get(i-1);
       RebateJsonDto rr2 = list.get(i);
       if(i==list.size()) {
           System.out.println("已经到达最高优惠"+rr1.getDiscountNum());
       }else {
           System.out.println(rr2.getStartNum());
           System.out.println(rr1.getEndNum());
           b4 =rr2.getStartNum().subtract(rr1.getEndNum());
           System.out.println("距离下一段优惠还差"+b4);
       }
       j = (rr1.getEndNum().add(b3)).compareTo(rr2.getEndNum());
       if(j>=0) {
           System.out.println("当前优惠价1"+rr2.getDiscountNum());
       }
       System.out.println("当前优惠价2"+rr1.getDiscountNum());
   }
}





@Test
public void test156() {
    BigDecimal b1 =new BigDecimal(15);
    BigDecimal b2 =new BigDecimal(15);
    System.out.println(b1.compareTo(b2));

}








public void testw(String str) {
        switch (str) {
            case "a":
                System.out.println("1");
                break;
            case "b":
                System.out.println("2");
                break;
            case "c":
                System.out.println("3");
                break;
            case "d":
                System.out.println("4");
                break;
        }
}


@Test
public void testf56() {
    testw("d");
}




























}
