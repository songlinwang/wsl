package com.netease.wsl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.cache.RedisCacheManager;

import javax.annotation.Resource;

@SpringBootApplication
@MapperScan("com.netease.wsl.mapper")
public class WslApplication {

    public static void main(String[] args) {
        SpringApplication.run(WslApplication.class, args);
    }
}
