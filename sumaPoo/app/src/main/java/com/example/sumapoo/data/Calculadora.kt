package com.example.sumapoo.data

import kotlin.math.roundToInt

class Calculadora  {


    fun suma(a: String, b:String):String{
        val total = a.toFloat() + b.toFloat()
        val redon = (total * 100.0).roundToInt() / 100.0
        val data = validarEnteroDecimal(redon.toString())
        return data
    }

    private fun validarEnteroDecimal(t:String):String{
        val num = t.toFloat()
        return if (num % 1.0f == 0.0f)  num.toInt().toString() else num.toString()
    }







    /*
    private Int numeroUno;
    private Int numeroDos;
    private Int resultado;

    function Calculadora(numeroUno: Int, numeroDos:Int, resultado:Int){
       this.numeroUno = numeroUno
        this.numeroDos = numeroDos
        this.resultado = resultado
    }

    funtion int sumar(){

    }
    */

    //metodos


}