package com.example.proyectousuariosqli.viewModel.usuario

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.proyectousuariosqli.model.Usuario
import com.example.proyectousuariosqli.model.UsuarioReppository

class UsuarioViewModel (application: Application): AndroidViewModel(application){
    //

    private val usuarioReppository = UsuarioReppository(application)

    //observer
    val usuarios = MutableLiveData<List<Usuario>>()
    val mensaje = MutableLiveData<String>()

    val usuarioUno = MutableLiveData<Usuario>()

    fun registrarUsuairoViewModel(usuario: Usuario){
        if(usuario.getNombre().isEmpty() || usuario.getCorreo().isEmpty() || usuario.getPassword().isEmpty()){
            mensaje.value = "Llenar los campos..."
            return
        }
        val data = usuarioReppository.insertRepository(usuario)
        if(data > 0){
            mensaje.value = "registro correcto....."
            listaUsuarioViewModel()
        }else{
            mensaje.value = "Error al registro SQLi..."
        }

    }

    fun listaUsuarioViewModel(){
        usuarios.value = usuarioReppository.listaUsuarioRepository()
    }

    //delte

    //update



}