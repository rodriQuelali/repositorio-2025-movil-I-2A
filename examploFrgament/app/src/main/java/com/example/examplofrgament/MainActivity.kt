package com.example.examplofrgament

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.examplofrgament.UI.holaFragment
import com.example.examplofrgament.UI.hola_dos

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

        val btnS1 = findViewById<Button>(R.id.btnS1)
        val btnS2 = findViewById<Button>(R.id.btnS2)

        btnS2.setOnClickListener {
            val hola2 = hola_dos()
            //() ....
            //Llamando a fragment hola 2.
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, hola2)
                .addToBackStack(null).commit()
        }

        btnS1.setOnClickListener {
            val hola1 = holaFragment()
            //() ....
            //Llamando a fragment hola 2.
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, hola1)
                .addToBackStack(null).commit()
        }

    }
}