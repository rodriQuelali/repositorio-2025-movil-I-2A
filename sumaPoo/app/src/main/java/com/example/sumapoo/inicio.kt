package com.example.sumapoo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_inicio)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnSuma = findViewById<Button>(R.id.btnCalculadora)
        val btnRadio = findViewById<Button>(R.id.btnRadios)
        val btnSpinner = findViewById<Button>(R.id.btnSpinner)
        val btnListView = findViewById<Button>(R.id.btnListView)

        btnRadio.setOnClickListener {
            val i = Intent(this, radio::class.java)
            startActivity(i)
        }
        btnSuma.setOnClickListener{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

        btnSpinner.setOnClickListener{
            val i = Intent(this, Spinner::class.java)
            startActivity(i)
        }

        btnListView.setOnClickListener{
            val i = Intent(this, ListView::class.java)
            startActivity(i)
        }
    }
}