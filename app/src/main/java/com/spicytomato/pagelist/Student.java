package com.spicytomato.pagelist;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Student {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "student_number")
    private String studentNumber;

    Student(String studentNumber){
        this.studentNumber = studentNumber;
    }

    int getId() {
        return id;
    }

    String getStudentNumber() {
        return studentNumber;
    }

    void setId(int id) {
        this.id = id;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
