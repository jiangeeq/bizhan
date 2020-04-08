package com.jls.mybatis.dao;

import com.jls.mybatis.po.User;

public interface UserDao {

	User queryUserById(User param);
}
