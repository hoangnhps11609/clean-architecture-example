package com.gft.usecases.student;


import java.util.List;

import com.gft.entities.Student;
import com.gft.usecases.adapter.StudentAdapter;
 
public class StudentUseCase {
 
	private StudentAdapter adapter;
 
	public StudentUseCase(StudentAdapter adapter) {
		this.adapter = adapter;
	}
 
	public List<Student> find(String name) {
		return adapter.findByName(name);
	}

	public List<Student> findAll() {
		return adapter.findAll();
	}
	
	public String insert(Student student) {
		return adapter.save(student);
	}

	public String delete(Long id) {
		return adapter.delete(id);
	}

	public String update(Student student) {
		return adapter.update(student);
	}

	public List<Student> findByAge(Integer from, Integer to) {
		return adapter.findByAge(from, to);
	}
 
}