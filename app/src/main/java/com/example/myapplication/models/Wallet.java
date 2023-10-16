package com.example.myapplication.models;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "wallet")
public class Wallet{
    @PrimaryKey(autoGenerate = true)
    private int id_wallet;
    private Double money;

    public int getId_wallet() {
        return id_wallet;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getMoney() {
        return money;
    }
}
