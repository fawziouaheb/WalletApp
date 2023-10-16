package com.example.myapplication.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.Date;
import com.example.myapplication.helper.DateHelper;
@Entity(tableName = "users")
public class User {
    @PrimaryKey(autoGenerate = true)
    public int id_user;

    public String name;
    public String email;
    public String pwd;
    public String date;

    public User(String name, String email, String pwd){
        this.name = name;
        this.email = email;
        this.pwd = pwd;
        this.date = DateHelper.getFormatDate(new Date());
    }
    public String getEmail() {
        return this.email;
    }
    public String getDate() {
        return date;
    }
    public String getPwd() {
        return pwd;
    }
    public String getName() {
        return name;
    }
    public int getId_user() {
        return id_user;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }
}
