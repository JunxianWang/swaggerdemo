package com.scnu.swaggerdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.scnu.swaggerdemo.dao")//将项目中对应的mapper类的路径加进来就可以了
public class SwaggerdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerdemoApplication.class, args);
	}
}
