  package com.example.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.HelloWorkController;
import com.example.demo.TodoResources;

@SpringBootApplication
@ComponentScan(basePackageClasses=HelloWorkController.class)
@ComponentScan(basePackageClasses=TodoResources.class)
public class MyToDoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyToDoApplication.class, args);
	}

}
