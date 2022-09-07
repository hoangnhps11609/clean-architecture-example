package com.gft.rest.mapper;

import java.util.ArrayList;
import java.util.List;

import com.gft.entities.Student;
import com.gft.rest.dto.StudentDto;
 
public class StudentMapper {
 
	public static StudentDto toDto(Student entity) {
		if (entity == null) {
			return null;
		}
 
        StudentDto studentDto = new StudentDto();
        studentDto.setId(entity.getId());
        studentDto.setName(entity.getName());
        studentDto.setAge(entity.getAge());
 
        return studentDto;
    }

	public static List<StudentDto> toListDto(List<Student> students) {
        List<StudentDto> list = new ArrayList<StudentDto>();
		if (students == null) {
			return null;
		}
		for(int i=0 ; i < students.size(); i++){
	        StudentDto studentDto = new StudentDto();
	        studentDto.setId(students.get(i).getId());
	        studentDto.setName(students.get(i).getName());
	        studentDto.setAge(students.get(i).getAge());
	        list.add(studentDto);
		}
		return list;
	}
}