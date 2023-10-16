package com.example.myapplication.helper;
import androidx.room.Room;
import android.app.Application;


public class Myapp extends Application {
    public static AppDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        database = Room.databaseBuilder(this,AppDatabase.class, "base_de_donnee").allowMainThreadQueries().build();
        System.out.println("mon objcet c'estttttttt "+database);
    }
}