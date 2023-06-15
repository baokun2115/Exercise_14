package com.example.exercise_14;

import android.app.Application;

import java.util.List;

public class CourseRepository {
    public static DAO dao;

    public CourseRepository(Application application) {
        CourseDB db = CourseDB.getInstance(application);
        dao = db.dao();
    }

    public void insert(Courses c) {
        dao.insert(c);
    }

    public void update(Courses c) {
        dao.update(c);
    }

    public void delete(Courses c) {
        dao.delete(c);
    }

    public void deleteAll() {
        dao.deleteAllCourse();
    }

    public List<Courses> getAllCourse() {
        return dao.getAllCourse();
    }
}
