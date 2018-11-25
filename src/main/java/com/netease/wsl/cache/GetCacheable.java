package com.netease.wsl.cache;


import java.lang.annotation.*;

/**
 *
 * 自定义缓存注解 获取缓存
 * Author wsl
 * Date 2018/11/25
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface GetCacheable {
}
