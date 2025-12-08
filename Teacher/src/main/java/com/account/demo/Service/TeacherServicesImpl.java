package com.account.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.demo.Repostiory.TeacherRepostiory;
import com.account.demo.TeacherApplication;
import com.account.demo.model.Teacher;

@Service
public class TeacherServicesImpl implements TeacherService {

	@Autowired
	public TeacherRepostiory tr;

	@Override
	public void add(Teacher t) {
		// TODO Auto-generated method stub

		tr.save(t);

	}

	@Override
	public List<Teacher> display() {
		// TODO Auto-generated method stub
		return tr.findAll();
	}

}
