package com.example.myapplication.model;
import androidx.room.Room;
import android.app.Application;


public class Myapp extends Application {
    public static AppDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        database = Room.databaseBuilder(this, AppDatabase.class, "my-app-database").allowMainThreadQueries().build();
        System.out.println("mon objcet c'estttttttt "+database);
    }
}
