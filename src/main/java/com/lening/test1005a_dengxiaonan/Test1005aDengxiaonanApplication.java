package com.lening.test1005a_dengxiaonan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.lening.test1005a_dengxiaonan.mapper"})
public class Test1005aDengxiaonanApplication {

    public static void main(String[] args) {
        SpringApplication.run(Test1005aDengxiaonanApplication.class, args);
    }

}
