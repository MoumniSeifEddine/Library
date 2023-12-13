package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Domain.Course;
 

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.Domain.Student;
 
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>
{
    @Query(value="select s.id, s.stname, c.coursename from student s Inner Join course c ON s.course=c.id", nativeQuery=true)

	List<Object[]> findStudent();
}
