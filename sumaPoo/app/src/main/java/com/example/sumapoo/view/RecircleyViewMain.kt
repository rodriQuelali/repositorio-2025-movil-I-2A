package com.example.sumapoo.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sumapoo.R
import com.example.sumapoo.data.Pais
import com.example.sumapoo.data.adapter.NameAdapter


class RecircleyViewMain : AppCompatActivity() {

    //private lateinit var binding: ActivityMainBinding
    private lateinit var recirCley: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recircley_view_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 1. Preparar los datos
        val names = listOf(
            "Alice", "Bob", "Charlie", "David", "Eve", "Frank",
            "Grace", "Heidi", "Ivan", "Judy", "Kim", "Liam",
            "Mia", "Noah", "Olivia", "Peter", "Quinn", "Rachel",
            "Sam", "Tina", "Uma", "Victor", "Wendy", "Xavier",
            "Yara", "Zack", "Anna", "Ben", "Catherine", "Daniel",
            "Ella", "Felix", "Georgia", "Harry", "Isabel", "Jack"
        )

        recirCley = findViewById(R.id.rViewPersona)
        recirCley.layoutManager = LinearLayoutManager(this)
        val listaPaises: List<Pais> = listOf(Pais("Bolivia", 1222222))

        val adapter = NameAdapter(listaPaises)
        recirCley.adapter = adapter




    }
}