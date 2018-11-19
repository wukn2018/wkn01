package com.example.springboot.tesr;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * * *  GOOK LUCK  * *
 *
 * @Author by   wukainian,
 * @Date on     2018/11/16.
 */
public class TestDemo {


    @Test
    public void test() {

        String str = "sfsd,fs,d";
       String[] s =  str.split(",");

        List<String> list = Arrays.asList(s);
      for(int i = 0;i<list.size();++i) {
          System.out.println(list.get(i));
      }
    }
}
