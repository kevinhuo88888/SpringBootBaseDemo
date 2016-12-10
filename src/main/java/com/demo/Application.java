package com.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication application=new SpringApplication(Application.class);
		//关闭banner
		application.setBannerMode(Banner.Mode.OFF);
		application.run();
	}

}