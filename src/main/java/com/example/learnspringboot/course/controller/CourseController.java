package com.example.learnspringboot.course.controller;

import com.example.learnspringboot.course.bean.Course;
import com.example.learnspringboot.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository repository;

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return repository.findAll();
    }

    @GetMapping("/courses/{id}")
    public Course getCourseDetails(@PathVariable int id){
        Optional<Course> course = repository.findById(id);
        if(repository.findById(id).isEmpty()) {
            throw new RuntimeException(id+" Course not found");
        }
        return course.get();
    }

    @PostMapping("/courses")
    public void createCourse(@RequestBody Course course){
        repository.save(course);
    }

    @PutMapping("/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String id){
        repository.save(course);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable int id){
        repository.deleteById(id);
    }
}