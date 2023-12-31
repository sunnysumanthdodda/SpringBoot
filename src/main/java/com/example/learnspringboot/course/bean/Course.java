package com.example.learnspringboot.course.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    private int courseId;
    private String courseName;
    private String courseAuthor;

    public Course(int courseId, String courseName, String courseAuthor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAuthor = courseAuthor;
    }

    public Course() {

    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseAuthor() {
        return courseAuthor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseAuthor='" + courseAuthor + '\'' +
                '}';
    }
}