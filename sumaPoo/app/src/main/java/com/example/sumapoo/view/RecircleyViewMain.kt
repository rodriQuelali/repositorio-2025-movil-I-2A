package com.example.sumapoo.view

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sumapoo.R
import com.example.sumapoo.data.Pais
import com.example.sumapoo.data.adapter.NameAdapter
import com.example.sumapoo.databinding.ActivityMainBinding
import com.example.sumapoo.databinding.ActivityRecircleyViewMainBinding


class RecircleyViewMain : AppCompatActivity() {

    private lateinit var binding: ActivityRecircleyViewMainBinding
    private lateinit var recirCley: RecyclerView

    private lateinit var txtN:EditText
    private lateinit var txtPobla:EditText
    private lateinit var butonEs:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecircleyViewMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        //recirCley = findViewById(R.id.rViewPersona)
        binding.rViewPersona.layoutManager = LinearLayoutManager(this)
        val listaPaises: List<Pais> = listOf(Pais("Bolivia", 1222222))

        val adapter = NameAdapter(listaPaises)
        binding.rViewPersona.adapter = adapter

    }


}