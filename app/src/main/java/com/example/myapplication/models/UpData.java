/*package com.example.myapplication.models;

import kotlin.collections.BooleanIterator;

public class UpData {
    //initialiser la class
    static  {
        UpData.wallet = null; // on récupere le wallet de  la bd
    }
      private static  Wallet wallet;

    public  static boolean test(Update update){
        if(update.verifyT(UpData.wallet)){
            // start sql transaction
            Update.insert();
            UpData.wallet.set(UpData.wallet.Get()-update.getRising());
            //mettre a jour le wallet danw la base de données
            DATABASE.updata(UpData.wallet)
             // End transaction
        }else {
            ///renvoyer une exception
        }
    }
    public interface Update{
    public Boolean insert();
    public boolean verifyT(Wallet wallet);
    public Double getRising();
    }

}
try{

    if(autorisationExpense.verify(ex)){
        Update:wallet
        }
        Expense ex= new Expense("23");
        UpData.test(ex);
        Expense ex= new Expense("400");
        UpData.test(ex);
        }
catch{

        }




Budget bu*/