package com.example.demo;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
	public static HashMap<Long,Student> hmStudent=new HashMap<Long,Student>();
	public static void main(String[] args) {
		Student one=new Student("John","mali");
	     hmStudent.put(new Long(one.getId()),one);
		//ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
	      SpringApplication.run(DemoApplication.class, args);
		Student two=new Student("abi","history");
	     hmStudent.put(new Long(two.getId()),two);
	}
}
