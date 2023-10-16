package com.example.myapplication.models;

import androidx.room.Embedded;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import androidx.room.Entity;

import com.example.myapplication.interfaces.Authorization;

@Entity(tableName = "expenseCategory")
public class ExpenseCategory implements Authorization {
    @PrimaryKey(autoGenerate = true)
    private  int id_expense_category;
    private String name;
    private Double money;
    private Double PourcentCategory;
    @ForeignKey(entity = Budget.class, parentColumns = "id_expense_category", childColumns = "budgetId")
    private int budgetId;

    @Embedded
    private Budget budget;
    public ExpenseCategory(String name,Double PourcentCategory, Budget budget){
        this.budget= budget;
        this.name = name;
        this.PourcentCategory = PourcentCategory;
        this.money = (budget.getMoney()*PourcentCategory)/100.0;
    }

    public String getName() {
        return name;
    }

    public int getId_expense_category() {
        return id_expense_category;
    }

    public Budget getBudget() {
        return budget;
    }

    public Double getPourcentCategory() {
        return PourcentCategory;
    }

    @Override
    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public void setPourcentCategory(Double pourcentCategory) {
        PourcentCategory = pourcentCategory;
    }
}
