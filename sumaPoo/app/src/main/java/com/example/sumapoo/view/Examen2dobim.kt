package com.example.sumapoo.view

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sumapoo.R
import com.example.sumapoo.data.Empleado

class examen2dobim : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_examen2dobim)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtN = findViewById<EditText>(R.id.editTextName)
        val txtS = findViewById<EditText>(R.id.editTextSalary)

        val tvR = findViewById<TextView>(R.id.tvReEx)

        val btR1 = findViewById<RadioButton>(R.id.radioButton10)
        val btR2 = findViewById<RadioButton>(R.id.radioButton15)
        val btR3 = findViewById<RadioButton>(R.id.radioButton20)

        val btnResulMos = findViewById<Button>(R.id.buttonCalculate)
        val spinnerEm = findViewById<Spinner>(R.id.spinnerEmployeeType)

        val lista = arrayOf("Seleccione","Empleado de planta", "Administrador")
        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista)
        spinnerEm.adapter = adaptador1

        btnResulMos.setOnClickListener {
            var dataEm:String=""
            var empleado:Empleado

            when (spinnerEm.selectedItem.toString()) {
                "Empleado de planta" -> dataEm = "Empleado de planta"
                "Administrador" -> dataEm = "Administrador"
            }
            if (dataEm == "") {
                Toast.makeText(this, "seleccione un tipo", Toast.LENGTH_SHORT).show()
            }else {
                if (btR1.isChecked){
                    empleado = Empleado(txtN.text.toString(), txtS.text.toString().toInt(), 10, dataEm)
                    tvR.text = empleado.mostraDatos()
                }
                if (btR2.isChecked) {
                    empleado = Empleado(txtN.text.toString(), txtS.text.toString().toInt(), 15, dataEm)
                    tvR.text = empleado.mostraDatos()
                }
                if (btR3.isChecked){
                    empleado = Empleado(txtN.text.toString(), txtS.text.toString().toInt(), 20, dataEm)
                    tvR.text = empleado.mostraDatos()
                }

            }
        }
    }
}