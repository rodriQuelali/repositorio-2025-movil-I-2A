package com.example.sumapoo

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
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
        val rbMul = findViewById<RadioButton>(R.id.rbMulti)
        val rbDiv = findViewById<RadioButton>(R.id.rbDiv)

        val chSuma = findViewById<CheckBox>(R.id.chSuma)
        val chResta = findViewById<CheckBox>(R.id.chResta)
        val chMul = findViewById<CheckBox>(R.id.chMulti)
        val chDiv = findViewById<CheckBox>(R.id.chDiv)

        val txtCh = findViewById<TextView>(R.id.tvResulCh)

        var dataResChech:String = ""

        
        rbSuma.setOnClickListener{
            if(rbSuma.isChecked) {

                Toast.makeText(this, "la suma es ${Calculadora().suma(txt1.text.toString(),txt2.text.toString())}", Toast.LENGTH_SHORT).show()
            }
        }

        rbResta.setOnClickListener{
            if (rbResta.isChecked){
                Toast.makeText(this, "la resta es ${Calculadora().resta(txt1.text.toString(),txt2.text.toString())}", Toast.LENGTH_SHORT).show()
            }
        }

        rbMul.setOnClickListener{
            if(rbMul.isChecked) {
                Toast.makeText(this, "la suma es ${Calculadora().Multiplicacion(txt1.text.toString(),txt2.text.toString())}", Toast.LENGTH_SHORT).show()
            }
        }

        rbDiv.setOnClickListener{
            if (rbDiv.isChecked){
                Toast.makeText(this, "la resta es ${Calculadora().division(txt1.text.toString(),txt2.text.toString())}", Toast.LENGTH_SHORT).show()
            }
        }



        chSuma.setOnClickListener{
            if(chSuma.isChecked) {
                dataResChech += Calculadora().suma(txt1.text.toString(),txt2.text.toString())
                //Toast.makeText(this, "la suma es ${Calculadora().suma(txt1.text.toString(),txt2.text.toString())}", Toast.LENGTH_SHORT).show()
            }
        }

        chResta.setOnClickListener{
            if (chResta.isChecked){
                dataResChech += Calculadora().resta(txt1.text.toString(),txt2.text.toString())
                //Toast.makeText(this, "la resta es ${Calculadora().resta(txt1.text.toString(),txt2.text.toString())}", Toast.LENGTH_SHORT).show()
            }
        }

        chMul.setOnClickListener{
            if(chMul.isChecked) {
                dataResChech += Calculadora().Multiplicacion(txt1.text.toString(),txt2.text.toString())
                //Toast.makeText(this, "la suma es ${Calculadora().Multiplicacion(txt1.text.toString(),txt2.text.toString())}", Toast.LENGTH_SHORT).show()
            }
        }

        chDiv.setOnClickListener{
            if (chDiv.isChecked){
                dataResChech += Calculadora().division(txt1.text.toString(),txt2.text.toString())
                //Toast.makeText(this, "la resta es ${Calculadora().division(txt1.text.toString(),txt2.text.toString())}", Toast.LENGTH_SHORT).show()
            }
        }

        txtCh.text = dataResChech

    }
}