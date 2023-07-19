package com.example.learnspringboot.course.repository;

import com.example.learnspringboot.course.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {

}