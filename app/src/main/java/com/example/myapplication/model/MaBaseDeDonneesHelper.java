package com.example.myapplication.model;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MaBaseDeDonneesHelper extends SQLiteOpenHelper {
    // Définissez le nom de la base de données et sa version
    private static final String NOM_BDD = "MaBaseDeDonnees";
    private static final int VERSION_BDD = 1;

    private SQLiteDatabase db;

    // Définissez le schéma de votre base de données ici

    public MaBaseDeDonneesHelper(Context context) {
        super(context, NOM_BDD, null, VERSION_BDD);
        try {
            this.db = this.getReadableDatabase();
            this.insertData("fdpppppppppppppppppppJHGB");
            try {
                Cursor cursor = this.db.rawQuery("select * from MaTable", null);

                cursor.moveToFirst();

                System.out.println("valeur : " + cursor.getString(1) );

                cursor.close();
            }
            catch(Exception e){
                System.out.println("erreur : " + e);
            }
        }
        catch(Exception e){
            System.out.println("erreur" + e);
        }

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Créez ici les tables de votre base de données
         db.execSQL("CREATE TABLE MaTable (_id INTEGER PRIMARY KEY AUTOINCREMENT, nom TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Si vous devez mettre à jour la structure de la base de données, effectuez les modifications ici
    }
    public void insertData(String nom) {
        System.out.println("je suis dans insert");
        ContentValues values = new ContentValues();
        values.put("nom", nom);

        long newRowId = db.insert("MaTable", null, values);

        if (newRowId != -1) {
            System.out.println("fdp réussi");
            // Insertion réussie, newRowId contient l'ID de la nouvelle ligne insérée.
        } else {
            System.out.println("fdp echec");
            // Une erreur s'est produite lors de l'insertion.
        }

    }
}
