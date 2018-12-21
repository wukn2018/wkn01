package com.example.springboot.config;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * Created with IntelliJ IDEA.
 * Description: 配置一些 handleArgumentResolver 和 配置 swagger
 * Date: 2018-06-08
 * Time: 5:50 PM
 *
 * @author: fanzhengchen
 */
@Configuration
@EnableSwagger2
public class WebConfiguration  {




    private boolean swaggerShow = true;


    /**
     * 创建API基本信息
     * @return
     */
    @Bean
    public Docket createRestApi() {
        if(swaggerShow) {
            return new Docket( DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())
                    .select()
                    //扫描需要展示的api接口
                    .apis( RequestHandlerSelectors.basePackage("com.xgn.cms.web.controller"))
                    .paths( PathSelectors.any())
                    .build();
        }else {
            return new Docket( DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())
                    .select()
                    .apis( RequestHandlerSelectors.basePackage("wkn.00.00.0.0"))
                    .paths( PathSelectors.any())
                    .build();
        }

    }


    private ApiInfo apiInfo() {
        if(swaggerShow) {
            return new ApiInfoBuilder()
                    .title("spring测试")
                    .description("基于多平台，多服务的整合开发，一站式解决你的建站烦恼")
                    .termsOfServiceUrl("https://my.csdn.net/")
                    .contact("wukn")
                    .version("1.3.0")
                    .build();
        }else {
            return new ApiInfoBuilder()
                    .title("cms建站平台(新光集团旗下产品)")
                    .description("基于多平台，多服务的整合开发，一站式解决你的建站烦恼")
                    .termsOfServiceUrl("https://my.csdn.net/")
                    .contact("wukn")
                    .version("1.3.0")
                    .build();
        }

    }
}
