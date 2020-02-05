package com.shixun.online.cmall.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages ="com.shixun.online.cmall.manage.mapper")
public class CmallManageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmallManageServiceApplication.class, args);
    }

}
