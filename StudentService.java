package com.example.demo;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value="/rest/student")
//@GetMapping
class StudentService{
  //@RequestMapping(value="/")
	@GetMapping("/rest/student")
   public HashMap<Long,Student> getAllStudents(){
      return DemoApplication.hmStudent;
   }
}