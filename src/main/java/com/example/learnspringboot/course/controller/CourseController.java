package com.example.learnspringboot.course.controller;

import com.example.learnspringboot.course.bean.Course;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return Arrays.asList(
                new Course(1,"Learn Java","James Gosling"),
                new Course(2,"Learn Mulesoft","Salesforce"),
                new Course(3,"Learn Amazon Web Services","AWS"));
    }
}