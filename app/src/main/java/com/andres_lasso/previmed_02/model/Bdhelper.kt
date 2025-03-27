package com.andres_lasso.previmed_02.model

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

//clase para crear la base de datos extendiendose de SQLiteOpenHelper
class Bdhelper(context: Context) : SQLiteOpenHelper(context, "previmed.db", null, 1){
   //recordar importar el context
    override fun onCreate(db: SQLiteDatabase?) {
        TODO("Not yet implemented")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
}