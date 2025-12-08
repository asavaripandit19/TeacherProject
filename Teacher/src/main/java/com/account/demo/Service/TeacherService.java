package com.account.demo.Service;

import java.util.List;

import com.account.demo.model.Teacher;

public interface TeacherService {
	
	void add(Teacher t);
	List<Teacher> display();

}
