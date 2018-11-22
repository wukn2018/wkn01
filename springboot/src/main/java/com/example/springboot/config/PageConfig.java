//package com.example.springboot.config;
//
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInterceptor;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.omg.PortableInterceptor.Interceptor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//
//import java.util.Properties;
//
///**
// * * *  GOOK LUCK  * *
// *
// * @Author by   wukainian,
// * @Date on     2018/11/22.
// */
//@Configuration
//public class PageConfig {
//
//    @Bean
//      public PageHelper pageHelper() {
//         PageHelper pageHelper = new PageHelper();
//         Properties properties = new Properties();
//         properties.setProperty("offsetAsPageNum","true");
//         properties.setProperty("rowBoundsWithCount","true");
//         properties.setProperty("reasonable","true");
//        //配置mysql数据库的方言
//         properties.setProperty("dialect","mysql");
//         pageHelper.setProperties(properties);
//         return pageHelper;
//         }
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
