package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class HelloWorkController {
   @GetMapping("/hello-world")
   public String HelloWorld() {
	   return "Hello World!!";
   }
   @GetMapping(value="")
   public String Home() {
	   return "Welcome!!";
   }
   @GetMapping("/hello-world-bean")
   public HelloWorldBean HelloWorldBean() {
	   return new HelloWorldBean("Hello World");
   }
   @GetMapping("/hello-world-bean/{name}")
   public HelloWorldBean HelloWorldBeanName(@PathVariable String name) {
	   //throw new RuntimeException("Exception");
	   return new HelloWorldBean(String.format("This is from Spring Server %s",name));
   }
   
}
