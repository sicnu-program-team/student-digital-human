package com.edu.aitutor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.edu.aitutor.mapper")
public class AitutorApplication {
	public static void main(String[] args) {
		SpringApplication.run(AitutorApplication.class, args);
	}
}
