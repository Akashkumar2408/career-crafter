package com.example.careercraftier;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.security.PublicKey;

public class DBhelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "signup.db";
    public static final int DATABASE_VIRSION = 1;

    public DBhelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VIRSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table signupdata (uname text primary key ,upassword text )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" drop table if exists signupdata");
    }

    public boolean insert(String user ,String password)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("uname",user);
        contentValues.put("upassword",password);
        long result=db.insert("signupdata",null,contentValues);
        if (result == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public boolean checkuser(String user)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("select * from signupdata where uname = ? ",new String[]{user});
        if (cursor.getCount()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean checkuserpassword(String user,String password)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("select * from signupdata where uname = ? and upassword = ?",new String[]{user,password});
        if (cursor.getCount()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
