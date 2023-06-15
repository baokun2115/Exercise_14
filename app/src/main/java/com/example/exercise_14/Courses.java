package com.example.exercise_14;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "course_table")
public class Courses {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String courseName;
    private String courseDescription;
    private String courseDurations;

    public Courses(String courseName, String courseDescription, String courseDurations) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseDurations = courseDurations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseDurations() {
        return courseDurations;
    }

    public void setCourseDurations(String courseDurations) {
        this.courseDurations = courseDurations;
    }
}
