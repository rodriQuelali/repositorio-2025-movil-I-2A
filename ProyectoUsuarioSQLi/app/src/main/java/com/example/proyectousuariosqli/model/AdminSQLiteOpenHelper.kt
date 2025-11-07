package com.example.proyectousuariosqli.model

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
//crear la base de datos y las tablas.
class AdminSQLiteOpenHelper(
    context: Context,
    name: String ="administracion",
    factory: SQLiteDatabase.CursorFactory? = null,
    version: Int=1):
    SQLiteOpenHelper(context, name, factory,version) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("create table usuario(codigo int primary key, nombre text, correo text, password text)")
    }

    override fun onUpgrade(
        p0: SQLiteDatabase?,
        p1: Int,
        p2: Int
    ) {
        TODO("Not yet implemented")
    }
}