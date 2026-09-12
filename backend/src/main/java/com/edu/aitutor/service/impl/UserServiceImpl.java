package com.edu.aitutor.service.impl;

import com.edu.aitutor.entity.User;
import com.edu.aitutor.mapper.UserMapper;
import com.edu.aitutor.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Override
    public User login(String username, String password) {
        User user = userMapper.selectByUsername(username);
        if(user == null){
            return null;
        }
        // 校验加密密码
        if(encoder.matches(password, user.getPassword())){
            return user;
        }
        return null;
    }
}
