package com.gitproject.dataBase.dataBase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gitproject.dataBase.dataBase.domain.Student;
 
 
 
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
 
}