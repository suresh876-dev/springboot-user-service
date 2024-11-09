package com.codedecode.userinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
public class UserInformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserInformationApplication.class, args);
	}

}
