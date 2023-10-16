package com.example.myapplication.authorizationManager;
import com.example.myapplication.interfaces.Authorization;
/**
 * autoriser de créer une cathegorie ( wallet.money - Category.rising>0)
 */

public abstract  class AuthorizationAction {
    /**
     *  vérifier si on a assez d'argent pour créer un  budget
     * @param budget
     * @return boolean si on a réussi à creer un budget
     */
    public static  boolean authorizationCreateBudget(Authorization budget){
        return  false;
    }

    /**
     * vérifier si on a assez d'argent sur ce budget pour créer cette categorie
     * @param expenseCategory la categorie a créer
     * @return si on à reussi a créer cette categorie
     */
    public  static boolean  authorizationCreateCategory(Authorization expenseCategory){
        return  false;
    }

    /**
     * si on a assez d'argent sur cette categori pour faire cette transaction
     * @param expense la transaction en question
     * @return si une transation  à réussi ou pas
     */
    public static boolean authorizationExpense(Authorization expense){
        return  false;
    }

}







