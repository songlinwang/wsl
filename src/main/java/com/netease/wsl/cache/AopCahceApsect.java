package com.netease.wsl.cache;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Author wsl
 * Date 2018/11/25
 */
@Component
@Aspect
public class AopCahceApsect {
    @Around(value = "@annotation(com.netease.wsl.cache.GetCacheable)")
    public Object getCache(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        return null ;
    }

    private String genKey(ProceedingJoinPoint proceedingJoinPoint){
        StringBuffer cacheKey = new StringBuffer();
        String type = proceedingJoinPoint.getArgs().getClass().getSimpleName();
        //cacheKey.append(com.sun.tools.javac.util.StringUtils.join(proceedingJoinPoint.getArgs(), "::"));
        cacheKey.append(type);
        return cacheKey.toString();
    }

}
