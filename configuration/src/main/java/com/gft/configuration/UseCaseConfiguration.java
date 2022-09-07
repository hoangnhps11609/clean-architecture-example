package com.gft.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gft.db.StudentAdapterImpl;
import com.gft.usecases.adapter.StudentAdapter;
import com.gft.usecases.student.StudentUseCase;

@Configuration
public class UseCaseConfiguration {

   @Bean
   public StudentUseCase findStudentByNameUseCase(StudentAdapter studentAdapter) {
       return new StudentUseCase(studentAdapter);
   }

   @Bean
   public StudentAdapter studentAdapter() {
       return new StudentAdapterImpl();
   }
}