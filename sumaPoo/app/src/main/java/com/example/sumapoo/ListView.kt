package com.example.sumapoo

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListView : AppCompatActivity() {

    lateinit var lvPaises: ListView
    lateinit var btnAddList: Button
    lateinit var txtAddPais: EditText
    lateinit var txtAddPobla: EditText

    lateinit var adapter: ArrayAdapter<String>

    lateinit var listaPaises: MutableList<String>
    lateinit var listaProblacion: MutableList<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initR()
        addPaises()
        listaPaises = mutableListOf("Bolivia", "Colombia")
        listaProblacion = mutableListOf(2555, 45555)

        adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaPaises)
        lvPaises.adapter=adapter

        lvPaises.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "${listaProblacion[position]}",Toast.LENGTH_SHORT).show()
        }
    }

    fun initR(){
        lvPaises = findViewById(R.id.ltView)
        btnAddList = findViewById(R.id.btnAddList)
        txtAddPais = findViewById(R.id.txtAddPais)
        txtAddPobla = findViewById(R.id.txtAddPobla)
    }

    fun addPaises(){
        btnAddList.setOnClickListener {
            listaPaises.add(txtAddPais.text.toString())
            listaProblacion.add(txtAddPobla.text.toString().toInt())
            lvPaises.adapter=adapter
        }
    }
}