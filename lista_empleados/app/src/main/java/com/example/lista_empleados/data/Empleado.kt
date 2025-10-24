package com.example.lista_empleados.data

class Empleado (private val nombre:String, private val genero: String, private val salario:Double, private val fechaIngreso: String){
    fun getNombre(): String {
        return nombre
    }

    fun getSalario(): Double {
        return salario
    }

    fun getFechaIngreso(): String {
        return fechaIngreso
    }

    fun getQuinquenio(): Int {
        return 2000
    }
}