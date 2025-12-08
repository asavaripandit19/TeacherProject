package com.account.demo.Repostiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.account.demo.model.Teacher;

@Repository
public interface TeacherRepostiory extends JpaRepository<Teacher, Integer> {

	

}
