package com.example.springboot.course.controller;

import com.example.springboot.course.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return Arrays.asList(
                new Course(1,"Learn Microservices","James Gosling"),
                new Course(2,"Learn Full Stack","Udemy"),
                new Course(3,"Learn JavaScript and TypeScript","Google and Meta")
        );
    }
}
