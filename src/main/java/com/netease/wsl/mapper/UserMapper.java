package com.netease.wsl.mapper;

import com.netease.wsl.meta.User;
import org.springframework.stereotype.Repository;

/**
 * Author wsl
 * Date 2018/11/16
 */
@Repository
public interface UserMapper {

    User getUserById(Integer id);

    boolean add(User user);
}
