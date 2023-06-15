package com.example.exercise_14;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public interface DAO {
    @Insert
    void insert(Courses c);
    @Update
    void update(Courses c);
    @Delete
    void delete(Courses c);
    @Query("DELETE FROM course_table")
    void deleteAllCourse();
    @Query("SELECT * FROM course_table ORDER BY courseName ARC")
    List<Courses> getAllCourse();
}
