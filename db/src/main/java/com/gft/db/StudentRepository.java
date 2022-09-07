package com.gft.db;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
 
import com.gft.db.model.StudentModel;
import com.gft.entities.Student;
 
@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Long> {
 
    List<StudentModel> findByName(String name);

    @Query(
    		"Select s from StudentModel s where s.age between ?1 and ?2"
    		)
	List<StudentModel> findByAge(Integer from, Integer to);

}