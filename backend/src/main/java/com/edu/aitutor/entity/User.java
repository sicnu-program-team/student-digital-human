package com.edu.aitutor.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String role;
    private Date createTime;

}
