package com.example.sumapoo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sumapoo.data.Calculadora


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //codigo
        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)
        val tvR = findViewById<TextView>(R.id.tvResultado)
        val btnOperar = findViewById<Button>(R.id.btnSuma)

        btnOperar.setOnClickListener{
            val calUno:Calculadora = Calculadora(et1.text.toString().toFloat(), et2.text.toString().toFloat())
            tvR.text = "La suam es: ${calUno.resultado.toString()}"
        }

    }
}