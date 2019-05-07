package com.literary.user.impl;

import com.literary.user.IUserService;
import com.literary.User;
import com.literary.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("userServiceImpl")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByID(Integer id){
        User user = userMapper.findById(id);
        return user;
    }

    @Override
    public User findByUuid(String uuid) {
        return null;
    }

    @Override
    public void save(User entity) {

    }

    @Override
    public void update(User entity) {

    }
}
