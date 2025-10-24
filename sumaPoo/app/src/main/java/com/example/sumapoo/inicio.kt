package com.example.sumapoo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.sumapoo.view.ListView
import com.example.sumapoo.view.MainActivity
import com.example.sumapoo.view.RecircleirViewButtonImg
import com.example.sumapoo.view.RecircleyViewMain
import com.example.sumapoo.view.Spinner
import com.example.sumapoo.view.radio

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
        val btnRecircley = findViewById<Button>(R.id.btnRecircley)
        val btnRecirlButtonIMG = findViewById<Button>(R.id.btnRebuttonIMG)


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

        btnRecircley.setOnClickListener{
            val i = Intent(this, RecircleyViewMain::class.java)
            startActivity(i)
        }

        btnRecirlButtonIMG.setOnClickListener {
            val i = Intent(this, RecircleirViewButtonImg::class.java)
            startActivity(i)
        }


    }
}