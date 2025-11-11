package com.example.proyectousuariosqli.model.usuario

import android.content.Context

class UsuarioReppository (context: Context){

    private  val usuarioDataSource = UsuarioDataSource(context)

    fun insertRepository(usuario: Usuario):Long{
        return usuarioDataSource.insertUsuario(usuario)
    }

    fun deteleRepository(id: Int):Int{
        return usuarioDataSource.deleteUsuario(id)
    }

    fun updateRepository(usuario: Usuario):Int{
        return usuarioDataSource.updateUsuario(usuario)
    }

    fun listaUsuarioRepository(): List<Usuario>{
        return usuarioDataSource.listarUsuarios()
    }

}