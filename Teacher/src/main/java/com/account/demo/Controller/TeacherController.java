package com.account.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.account.demo.Service.TeacherService;
import com.account.demo.model.Teacher;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class TeacherController {
	
	@Autowired
	
	private TeacherService ts;
	
	
	@PostMapping("add")
	public void add(@RequestBody Teacher t) {
		//TODO: process POST request
		
		ts.add(t);
	}
			
	@GetMapping("display")
	public List<Teacher> display() {
		return ts.display();
	}
	
	
	
	

}
