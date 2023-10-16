package com.example.myapplication.UpDate;


import com.example.myapplication.models.Budget;
import com.example.myapplication.models.ExpenseCategory;
import com.example.myapplication.models.Wallet;

public class UpDateData{
    static {
        // récupere l'entité wallet à la premier utilisation de de cet class
        //UpDateWallet.wallet =
    }
    public  static Wallet wallet;
    public static Budget budget;
    public static ExpenseCategory expenseCategory;

    public static void wallet(Double money){
        UpDateData.wallet.setMoney(UpDateData.wallet.getMoney() - money);
        //requete pour mettre à jour dans la bdd
    }
    public static void budget(Double money){
        UpDateData.budget.setMoney(UpDateData.budget.getMoney() - money);
        //requete pour mettre à jour dans la bdd
    }
    public static void Category( Double money){
        UpDateData.expenseCategory.setMoney(UpDateData.expenseCategory.getMoney()- money);
        //requete pour mettre à jour dans la bdd
    }
}
