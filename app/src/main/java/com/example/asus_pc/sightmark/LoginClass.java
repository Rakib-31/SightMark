package com.example.asus_pc.sightmark;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginClass extends SQLiteOpenHelper {

    private static final String DatabaseName = "Login_Database2.db";
    private static final String TableName = "User_Detail2";
    private static final String ID = "ID";
    private static final String Name = "NAME";
    private static final String Age = "AGE";
    private static final String Email = "EMAIL";
    private static final String Passward = "PASSWARD";
    private static final int versionNo = 1;
    private Context context;
    private static final String string = "CREATE TABLE "+TableName+"( "+ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+Name+" VARCHAR(255), "+Email+" VARCHAR(255), "+Passward+" VARCHAR(255), "+Age+" INTEGER ); ";
    private static final String str = "DROP TABLE IF EXISTS "+TableName;
    public String strin;
    public LoginClass(Context context) {
        super(context, DatabaseName, null, versionNo);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try{
            db.execSQL(string);
        }
        catch(Exception e){
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        try{
            db.execSQL(str);
            onCreate(db);
        }catch(Exception e){

        }
    }

    public long insertData(String name, String email, String passward,String age){

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Name,name);
        contentValues.put(Email,email);
        contentValues.put(Passward,passward);
        contentValues.put(Age,age);
        long rowId = sqLiteDatabase.insert(TableName,null,contentValues);
        return rowId;
    }

    public boolean search(String s, String p)
    {
        return findPassward(s,p);
    }

    private boolean findPassward(String semail, String spass) {

        SQLiteDatabase sq = this.getReadableDatabase();
        Cursor cursor = sq.rawQuery("SELECT * FROM "+TableName,null);
        Boolean result = false;

        while(cursor.moveToNext())
        {
            String username = cursor.getString(1);
            String cemail = cursor.getString(2);
            String passward = cursor.getString(3);

            if((username.equals(semail) || cemail.equals(semail)) && passward.equals(spass))
            {
                result = true;
                break;
            }
        }
        return result;
    }

}

