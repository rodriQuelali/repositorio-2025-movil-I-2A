package com.example.sumapoo.data

class Calculadora  {


    fun suma(a: String, b:String):String{
        val total = a.toFloat() + b.toFloat()
        val data = validarEnteroDecimal(total.toString())
        return data
    }

    private fun validarEnteroDecimal(t:String):String{
        val num = t.toFloat()
        if (num % 1.0f == 0.0f){
            return num.toInt().toString()
        }
        return num.toString()
    }

    fun suma(a: Int, b:Int):Int{
        return a + b
    }

    fun resta(a: Int, b: Int):Int{
        return a - b
    }

    fun resta(a: Float, b:Float):Float{
        return a - b
    }

    fun multiplicacion(a: Int, b: Int):Int{
        return a * b
    }

    fun multiplicacion(a: Float, b:Float):Float{
        return a * b
    }

    fun division(a: Int, b: Int):Int{
        if(b == 0){
            return 0
        }
        return a / b
    }

    fun division(a: Float, b:Float):Float{
        if(b == 0.0f){
            return 0.0f
        }
        return a / b
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