
package com.gft.db.mapper;
 
import java.util.ArrayList;
import java.util.List;

import com.gft.db.model.StudentModel;
import com.gft.entities.Student;
 
public class StudentMapper {
 
	public static Student toEntity(StudentModel model) {
		if (model == null) {
			return null;
		}
 
		Student student = new Student();
		student.setId(model.getId());
		student.setName(model.getName());
		student.setAge(model.getAge());
 
		return student;
	}
	
	public static StudentModel toModel(Student entity) {
		if (entity == null) {
			return null;
		}
 
		StudentModel student = new StudentModel();
		student.setId(entity.getId());
		student.setName(entity.getName());
		student.setAge(entity.getAge());
 
		return student;
	}
	
	public static List<Student> toListEntity(List<StudentModel> students) {
        List<Student> list = new ArrayList<Student>();
		if (students == null) {
			return null;
		}
		for(int i=0 ; i < students.size(); i++){
	        Student student = new Student();
			student.setId(students.get(i).getId());
	        student.setName(students.get(i).getName());
	        student.setAge(students.get(i).getAge());
	        list.add(student);
		}
		return list;
	}
}