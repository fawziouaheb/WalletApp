package com.example.myapplication.helper;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.myapplication.interfaces.bdd.*;
import com.example.myapplication.models.*;

@Database(entities = {User.class,Budget.class,Expense.class,ExpenseCategory.class,Wallet.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao UserDao();
    public abstract BudgetDao BudgetDao();
    public  abstract  WalletDao WalletDao();
    public abstract  ExpenseDao ExpenseDao();
    public abstract ExpenseCategoryDao ExpenseCategoryDao();

}
