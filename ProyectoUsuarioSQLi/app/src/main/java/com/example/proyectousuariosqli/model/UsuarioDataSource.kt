package com.example.proyectousuariosqli.model

import android.content.ContentValues
import android.content.Context

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
        registro.put("nombre", usuario.setNombre())
        registro.put("correo", usuario.setCorreo())
        registro.put("password", usuario.setPassword())
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
        registro.put("nombre", usuario.setNombre())
        registro.put("correo", usuario.setCorreo())
        registro.put("password", usuario.setPassword())
        val cant = bd.update("usuario", registro, "codigo=${usuario.setCodigo().toString()}", null)
        bd.close()
        return cant
    }

}