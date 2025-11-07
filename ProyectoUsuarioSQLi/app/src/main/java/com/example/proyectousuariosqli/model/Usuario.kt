package com.example.proyectousuariosqli.model

class Usuario(
    private var codigo:Int = 1,
    private val nombre:String,
    private val correo:String,
    private val password:String) {

    init {
        codigo = 1
    }
    fun setNombre() = this.nombre
    fun setCorreo() = this.nombre
    fun setPassword() = this.nombre
    fun setCodigo () = this.codigo

}