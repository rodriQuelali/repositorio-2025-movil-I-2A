package com.example.sumapoo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sumapoo.data.Calculadora

class radio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txt1 = findViewById<EditText>(R.id.txt1)
        val txt2 = findViewById<EditText>(R.id.txt2)

        val rbSuma = findViewById<RadioButton>(R.id.rbSuma)
        val rbResta = findViewById<RadioButton>(R.id.rbResta)

        val btnOpe = findViewById<Button>(R.id.btnRb)
        btnOpe.setOnClickListener{
            if(rbSuma.isChecked == true) {

                //Toast.makeText(this, "la suma es ${Calculadora().suma(txt1.text.toString(),txt2.text.toString())}", Toast.LENGTH_SHORT).show()
            }
            if (rbResta.isChecked == true){
                Toast.makeText(this, "la suma es ${txt1.text.toString().toInt() - txt2.text.toString().toInt()}", Toast.LENGTH_SHORT).show()
            }

        }

    }
}