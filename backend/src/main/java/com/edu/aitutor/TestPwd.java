package com.edu.aitutor;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestPwd {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        // 明文密码
        String rawPwd = "123456";
        String encryptPwd = encoder.encode(rawPwd);
        System.out.println("BCrypt加密后的密码：" + encryptPwd);
    }
}
