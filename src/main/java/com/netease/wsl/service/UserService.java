package com.netease.wsl.service;

import com.netease.wsl.mapper.UserMapper;
import com.netease.wsl.meta.User;
import com.netease.wsl.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author wsl
 * Date 2018/11/16
 */
@Service
public class UserService {

    private static final String GLOBAL_CACHE_PRE = "redis_";

    @Resource
    private UserMapper userMapper;

    @Resource
    private RedisUtil redisUtil;

    public User getUserById(int id) {
        String key = GLOBAL_CACHE_PRE + id;
        User user;
        if (redisUtil.get(key) == null) {
            user = (User) redisUtil.get(key);
        } else {
            user = userMapper.getUserById(id);
            redisUtil.set(key, user);
        }
        return user;
    }

    public boolean add(User user) {
        return userMapper.add(user);
    }
}
