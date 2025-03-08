package com.shop.cafe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:config/secu.properties")
public class Shoppingmall3Application {

	public static void main(String[] args) {
		SpringApplication.run(Shoppingmall3Application.class, args);
	}

}
