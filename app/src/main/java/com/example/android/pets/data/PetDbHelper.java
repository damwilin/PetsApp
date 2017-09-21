package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.android.pets.data.PetContract.PetEntry.COLUMN_PET_BREED;
import static com.example.android.pets.data.PetContract.PetEntry.COLUMN_PET_GENDER;
import static com.example.android.pets.data.PetContract.PetEntry.COLUMN_PET_NAME;
import static com.example.android.pets.data.PetContract.PetEntry.COLUMN_PET_WEIGHT;
import static com.example.android.pets.data.PetContract.PetEntry.COMMA_SEP;
import static com.example.android.pets.data.PetContract.PetEntry.INTEGER_TYPE;
import static com.example.android.pets.data.PetContract.PetEntry.TABLE_NAME;
import static com.example.android.pets.data.PetContract.PetEntry.TEXT_TYPE;
import static com.example.android.pets.data.PetContract.PetEntry._ID;

/**
 * Created by Damian on 7/7/2017.
 */

public class PetDbHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Pets.db";
    public static final int DATABASE_VERSION = 1;

    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String SQL_CREATE_ENTRIES = "CREATE TABLE " + TABLE_NAME + "(" +
                _ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                COLUMN_PET_NAME + TEXT_TYPE + COMMA_SEP +
                COLUMN_PET_BREED + TEXT_TYPE + COMMA_SEP +
                COLUMN_PET_GENDER + INTEGER_TYPE + COMMA_SEP +
                COLUMN_PET_WEIGHT + INTEGER_TYPE + ")";

        sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
