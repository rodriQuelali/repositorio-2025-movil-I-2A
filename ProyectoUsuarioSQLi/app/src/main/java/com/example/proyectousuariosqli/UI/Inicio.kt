package com.example.proyectousuariosqli.UI

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectousuariosqli.MainActivity
import com.example.proyectousuariosqli.R
import com.example.proyectousuariosqli.UI.producto.Articulos
import com.google.android.material.button.MaterialButton

class Inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_inicio)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.inicio)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnUsuarios = findViewById<MaterialButton>(R.id.btnGestionarUsuarios)
        val btnArticulos = findViewById<MaterialButton>(R.id.btnGestionarArticulos)

        btnUsuarios.setOnClickListener {
            Toast.makeText(this, "Ir a gestión de usuarios", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, MainActivity::class.java))
        }

        btnArticulos.setOnClickListener {
            Toast.makeText(this, "Ir a gestión de artículos", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, Articulos::class.java))
        }
    }
}