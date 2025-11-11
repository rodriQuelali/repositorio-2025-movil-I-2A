package com.example.proyectousuariosqli.model.usuario

import android.content.ContentValues
import android.content.Context
import com.example.proyectousuariosqli.model.AdminSQLiteOpenHelper

class UsuarioDataSource (context: Context){

    //metod de GRUD

    //insert
    //delete
    //update
    //list

    private val sqliAdmin = AdminSQLiteOpenHelper(context)
    //val u = Usuario(nombre = "h", correo = "k", password = "k")

    fun insertUsuario(usuario: Usuario):Long{
        val bd = sqliAdmin.writableDatabase
        val registro = ContentValues()
        registro.put("nombre", usuario.getNombre())
        registro.put("correo", usuario.getCorreo())
        registro.put("password", usuario.getPassword())
        val datResdult = bd.insert("usuario", null, registro)
        bd.close()
        return datResdult
        //Toast.makeText(this, "Se cargaron los datos del artículo", Toast.LENGTH_SHORT).show()
    }

    fun deleteUsuario(id:Int):Int{
        val bd = sqliAdmin.writableDatabase
        val cant = bd.delete("usuario", "codigo=${id.toString()}", null)
        bd.close()
        return cant
    }

    fun updateUsuario(usuario: Usuario): Int{
        val bd = sqliAdmin.writableDatabase
        val registro = ContentValues()
        registro.put("nombre", usuario.getNombre())
        registro.put("correo", usuario.getCorreo())
        registro.put("password", usuario.getPassword())
        val cant = bd.update("usuario", registro, "codigo=${usuario.getCodigo().toString()}", null)
        bd.close()
        return cant
    }

    //lista de usuario <list<Usuario>>

    fun listarUsuarios(): List<Usuario> {
        val db = sqliAdmin.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM usuario", null)
        val lista = mutableListOf<Usuario>()

        if (cursor.moveToFirst()) {
            do {
                println(cursor.getColumnIndexOrThrow("codigo"))
                lista.add(
                    Usuario(
                        codigo = cursor.getInt(cursor.getColumnIndexOrThrow("codigo")),
                        nombre = cursor.getString(cursor.getColumnIndexOrThrow("nombre")),
                        correo = cursor.getString(cursor.getColumnIndexOrThrow("correo")),
                        password = cursor.getString(cursor.getColumnIndexOrThrow("password"))
                    )
                )
            } while (cursor.moveToNext())
        }
        cursor.close()
        return lista
    }


}