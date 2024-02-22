package com.nx.example.common.service;

import com.nx.example.common.model.User;

/**
 * 用户服务接口
 *
 * @author nx
 */
public interface UserService {
    /**
     * 获取用户
     *
     * @param user
     * @return {@link User }
     * @author nx
     */
    User getUser(User user);
}
