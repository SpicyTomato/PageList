package com.spicytomato.pagelist;

import android.content.Context;
import android.os.AsyncTask;

import androidx.room.Delete;

public class Repository {
    StudentDao studentDao;

    Repository(Context context){
        StudentDataBase studentDataBase = StudentDataBase.getInstance(context);
        studentDao = studentDataBase.getStudentDao();
    }

    void insert(Student...students){
        new Insert(studentDao).execute(students);
    }

    void deleteAll(){
        new DeleteAll(studentDao).execute();
    }

    static class Insert extends AsyncTask<Student,Void,Void>{
        StudentDao studentDao;

        Insert(StudentDao studentDao){
            this.studentDao = studentDao;
        }

        @Override
        protected Void doInBackground(Student... students) {
            studentDao.insert(students);
            return null;
        }
    }

    static class DeleteAll extends AsyncTask<Void,Void,Void>{
        StudentDao studentDao;

        DeleteAll(StudentDao studentDao){
            this.studentDao = studentDao;
        }
        @Override
        protected Void doInBackground(Void... voids) {
            studentDao.deleteAll();
            return null;
        }
    }
}
