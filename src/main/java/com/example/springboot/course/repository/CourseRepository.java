package com.example.springboot.course.repository;

import com.example.springboot.course.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {

}