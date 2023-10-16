package com.example.myapplication.models;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.myapplication.interfaces.Authorization;


@Entity(tableName = "budget")
public class Budget implements Authorization {
    @PrimaryKey(autoGenerate = true)
    private int id_budget;
    private String date_strat_validation;
    private String date_end_validation;
    private Double pourcent_wallet;
    private Double money;
    public Budget(String date_strat_validation, String date_end_validation,Double pourcent_wallet){
        this.date_strat_validation = date_strat_validation;
        this.date_end_validation = date_end_validation;
        this.money = (1000.00*pourcent_wallet)/100.0;
    }

    public Double getPourcent_wallet() {
        return pourcent_wallet;
    }

    public void setPourcent_wallet(Double pourcent_wallet) {
        this.pourcent_wallet = pourcent_wallet;
    }
    public Double getMoney() {
        return money;
    }

    public String getDate_strat_validation() {
        return date_strat_validation;
    }

    public String getDate_end_validation() {
        return date_end_validation;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public int getId_budget() {
        return id_budget;
    }

    public void setId_budget(int id_budget) {
        this.id_budget = id_budget;
    }
}
