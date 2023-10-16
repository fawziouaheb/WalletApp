package com.example.myapplication.models;
import androidx.room.Embedded;
import  androidx.room.Entity;
import  androidx.room.PrimaryKey;

import com.example.myapplication.interfaces.Authorization;


@Entity(tableName = "expense")
public class Expense implements Authorization {
    @PrimaryKey(autoGenerate = true)
    private int id_expense;
    private Double money;
    private  String name;
    private  String date;
    @Embedded
    private ExpenseCategory EC;
    public Expense(Double money,String name,String date, ExpenseCategory EC) {
        this.money = money;
        this.name = name;
        this.date = date;
        this.EC = EC;
    }
    
    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getId_expense() {
        return id_expense;
    }

    public Double getMoney() {
        return money;
    }

}

