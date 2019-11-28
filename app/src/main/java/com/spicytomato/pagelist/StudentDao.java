package com.spicytomato.pagelist;

import androidx.lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface StudentDao {
    @Insert
    void insert(Student...students);

    @Query("DELETE from student")
    void deleteAll();

    @Query("SELECT * FROM student ORDER BY id DESC")
    DataSource.Factory<Integer,Student> getAllStudent();
}
