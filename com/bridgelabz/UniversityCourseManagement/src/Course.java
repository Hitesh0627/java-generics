package com.bridgelabz.UniversityCourseManagement.src;


public class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public void displayCourse() {
        courseType.displayCourseDetails();
    }

    public T getCourseType() {
        return courseType;
    }
}