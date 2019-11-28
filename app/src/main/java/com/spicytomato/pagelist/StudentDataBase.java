package com.spicytomato.pagelist;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Student.class},version = 1,exportSchema = false)
public abstract class StudentDataBase extends RoomDatabase {
    private static StudentDataBase Instance;

    static synchronized StudentDataBase getInstance(Context context){
        if (Instance == null){
            Instance = Room.databaseBuilder(context,StudentDataBase.class,"student_database")
                    .build();
        }

        return Instance;
    }

    public abstract StudentDao getStudentDao();
}
