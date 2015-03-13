package com.example.steve.listappv2;

import android.database.sqlite.*;
import android.content.Context;

import android.util.Log;

/**
 * Created by Steve on 09-Mar-15.
 */
public class DatabaseHelper extends SQLiteOpenHelper{

    private static final String DATABASE_NAME = "database";
    private static final String TABLE_NAME_USER = "USERS";
    private static final int DATABASE_VERSION=1;
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME_USER + "(UID INTEGER PRIMARY KEY AUTOINCREMENT, FNAME VARCHAR(255), LNAME VARCHAR(255), DOB VARCHAR(255))";
    private Context context;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context=context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        try{
            db.execSQL(CREATE_TABLE);
            Log.i(DatabaseHelper.class.toString(), "DatabaseHelper created");

        }catch(SQLiteException e){
            //Message.message(context, e);
            //Log.e(DatabaseHelper.class.toString(), e);

        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
