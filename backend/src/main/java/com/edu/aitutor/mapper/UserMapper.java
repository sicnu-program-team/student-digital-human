package com.edu.aitutor.mapper;

import com.edu.aitutor.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select id,username,password,role,create_time from user where username = #{username}")
    User selectByUsername(String username);
}
