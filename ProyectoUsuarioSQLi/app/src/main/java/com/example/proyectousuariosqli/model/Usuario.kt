package com.example.proyectousuariosqli.model

class Usuario(
    private var codigo:Int = 1,
    private val nombre:String,
    private val correo:String,
    private val password:String) {

    init {
        codigo = 1
    }
    fun getNombre() = this.nombre
    fun getCorreo() = this.correo
    fun getPassword() = this.password
    fun getCodigo () = this.codigo

}