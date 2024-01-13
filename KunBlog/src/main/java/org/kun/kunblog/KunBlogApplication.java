package org.kun.kunblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@MapperScan(basePackages = "org.kun.kunblog.dao")
public class KunBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(KunBlogApplication.class, args);
    }

}
