package com.example.sumapoo

import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Spinner
import android.widget.Toast

class Spinner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_spinner)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /*
        * Confeccionar la siguiente aplicacion utilizando Spinner:
        * - listar los datos de: SUMA, RESTA, MULTIPLICACION y DIVISION.
        * - Que realiza la operacion al seleccionar cada Item.
        * - Ojo se deve de seleccionar y operar, no utilizar otro Button.
        * - La entrega se realiza el dia Lunes a primero hora, subir su proyecto a su repositorio o llevarlo en un USB*/

        val spin:Spinner = findViewById(R.id.spOper)

        val lista:MutableList<String> = mutableListOf("Lista de Operaciones.....","sumar", "restar", "multiplicar", "dividir", "Raiz cuadrada")
        val adap = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista)
        spin.adapter = adap

        spin.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {

                val selectedItem = parent?.getItemAtPosition(position).toString()
                Toast.makeText(this@Spinner, "$selectedItem", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }

    }
}