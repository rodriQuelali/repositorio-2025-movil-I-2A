package com.example.sumapoo.data

import android.widget.Toast


class Empleado constructor(val nombre:String, val sueldo: Int, val incremento:Int, val tipo: String) {

    private var salarioTota:Double = 0.0
    private var incrementoOptenido: Double = 0.0

    private fun calcularIncremento(): Double{
        //print("datossss v.........${this.verificarSueldoEmpleadoAdmi()}")
        if (this.verificarSueldoEmpleadoAdmi() == true) {
            incrementoOptenido = (this.incremento.toDouble() * this.sueldo.toDouble()) / 100
            return incrementoOptenido
        }
        return 0.0
    }

    private fun verificarSueldoEmpleadoAdmi():Boolean{

        if (this.sueldo in 2500..3000) {
            println("sueldo 1..................${this.sueldo}")
            return true
        }
        if (this.sueldo >= 3500 && this.sueldo <= 4000) {
            println("sueldo 2..................${this.sueldo}")
            return true
        }
        return false
    }

    fun mostraDatos():String{
        if (this.calcularIncremento() == 0.0){
            return "No se puede calcular por su sueldo no esta en rango.."
        }
        salarioTota = this.calcularIncremento() + this.sueldo.toDouble()
        return "Nombre: ${this.nombre}. \n Suelto actual: ${this.sueldo}. \n Incremento: ${this.incrementoOptenido}. \n Suelto total:${this.salarioTota}"
    }
}