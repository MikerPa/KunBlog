package org.kun.kunblog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author 84401
 * @version 1.0
 * @description: TODO
 * @date 2024/1/13 20:19
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private ApiInfo apiInfo(){
        Contact contact = new Contact("cherry","https://www.bilibili.com/","tao_sama@126.com");
        return new ApiInfo(
                "Swagger学习", // 标题
                "学习演示如何配置Swagger", // 描述
                "v1.0", // 版本
                "http://www.bilibili.com/", // 组织链接
                contact, // 联系人信息
                "Apach 2.0 许可", // 许可
                "http://www.apache.org/licenses/LICENSE-2.0", // 许可连接
                new ArrayList<>()// 扩展
        );
    }

    @Bean
    public Docket docket(Environment environment){
        //设置要显示的swagger环境
        Profiles of = Profiles.of("dev","test");
        //判断当前是否属于该环境
        //通过enable() 接收此参数是否要显示
        boolean b = environment.acceptsProfiles(of);

        return new Docket(DocumentationType.SWAGGER_2)
                //.groupName("hello")//配置分组 就是这个swagger是那个项目的
                .apiInfo(apiInfo())
                .enable(b) //配置是否齐用Swagger
                .select()//通过.select()方法 配置接口
                .apis(RequestHandlerSelectors.basePackage("org.kun.kunblog.controller"))
                //RequestHandlerSelectors 配置要扫描接口的方式
                //basePackage 指定扫描的包
                //any():扫描全服
                //none(): 不扫描
                //withClassAnnnotation  扫描类上的注解
                // 配置如何通过path过滤,即这里只扫描请求以/api开头的接口
                .paths(PathSelectors.ant("/api/**"))
                .build();//工厂模式
    }

}
